package com.example.bank_card.service;

import java.util.List;

import com.example.bank_card.domain.Customer;

public interface CustomerService {
	public List<Customer> list();
	public void register(Customer customer);
	public Customer read(String jumin);
	public void modify(Customer customer);
	public void delete(String jumin);
}
