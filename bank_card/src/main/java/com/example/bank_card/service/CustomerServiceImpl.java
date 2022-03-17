package com.example.bank_card.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank_card.domain.Customer;
import com.example.bank_card.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> list() {
		return customerRepository.findAll();
	}

	@Override
	public void register(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public Customer read(String jumin) {
		return customerRepository.getById(jumin);
	}

	@Override
	public void modify(Customer customer) {
		Customer cusEntity = customerRepository.getById(customer.getJumin());
		cusEntity.setName(customer.getName());
		cusEntity.setAddr(customer.getAddr());
		cusEntity.setBirth(customer.getBirth());
		cusEntity.setEmail(customer.getEmail());
		cusEntity.setPhnum(customer.getPhnum());
		cusEntity.setJob(customer.getJob());	
	}

	@Override
	public void delete(String jumin) {
		customerRepository.deleteById(jumin);
		
	}
}
