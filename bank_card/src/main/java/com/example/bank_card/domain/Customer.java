package com.example.bank_card.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity(name="B_CUSTOMERS")
@Table
//@TableGenerator(name="customer_gen", table="B_CUSTOMERS",pkColumnValue="CUSTOMERS_SEQ", allocationSize=1)
//@SequenceGenerator(name="cus_seq_gen", sequenceName = "B_CUSTOMERS_SEQUENCE", initialValue=1, allocationSize = 1)

public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cus_seq_gen")
//	@GeneratedValue(strategy = GenerationType.TABLE, generator = "cus_seq_gen")
	@Column(name="cust_jumin")
	private String jumin; 
	@Column(name="cust_name")
	private String name;
	@Column(name="cust_birth")
	private Date birth;
	@Column(name="cust_addr")
	private String addr;
	@Column(name="cust_email")
	private String email;
	@Column(name="cust_phnum")
	private String phnum;
	@Column(name="cust_job")
	private String job;
	
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

}
