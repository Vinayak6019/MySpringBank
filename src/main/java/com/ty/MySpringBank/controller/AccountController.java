package com.ty.MySpringBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.MySpringBank.model.Account;
import com.ty.MySpringBank.service.AccountService;

@Controller
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountService service;
	
    @RequestMapping("/create")
	public String showCreateAccount(Model model) {
		model.addAttribute("account",new Account());
		return "create-account";
	}
    
    @PostMapping("/create")
    public String createAccount(@ModelAttribute Account account) {
    	service.createAccount(account);
    	return "redirect:/accounts/create";
    }
}
