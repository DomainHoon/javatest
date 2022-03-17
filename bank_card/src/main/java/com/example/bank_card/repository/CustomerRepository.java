package com.example.bank_card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bank_card.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{}


