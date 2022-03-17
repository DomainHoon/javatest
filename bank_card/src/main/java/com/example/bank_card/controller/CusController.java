package com.example.bank_card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bank_card.domain.Customer;
import com.example.bank_card.service.CustomerService;

@Controller
@RequestMapping("/cus")
public class CusController {
	private CustomerService customerService;
	
	@Autowired
	public CusController(CustomerService customerService) {
		this.customerService = customerService;
	}
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", customerService.list());
	}
	@GetMapping("/register")
	public void registerForm(Customer customer, Model model) {
		
	}
	@PostMapping("/register")
	public String register(Model model, Customer customer) {
		this.customerService.register(customer);
		model.addAttribute("msg", "등록이 완료되었습니다.");
		return "cus/success";
	}
	@GetMapping("/read")
    public void read(Model model, String jumin) {
        model.addAttribute(customerService.read(jumin));
    }
	@GetMapping("/modify")
	public void modifyForm(Model model, String jumin) {
		model.addAttribute(customerService.read(jumin));
	}
	@PostMapping("/modify")
	public String modify(Model model, Customer customer) {
		this.customerService.modify(customer);
		model.addAttribute("msg", "수정이 완료 되었습니다.");
		return "cus/success";
	}
	@PostMapping("/delete")
	public String delete(Model model, String jumin) {
		this.customerService.delete(jumin);
		model.addAttribute("msg", "삭제가 완료 되었습니다.");
		return "cus/success";
	}
	
}
