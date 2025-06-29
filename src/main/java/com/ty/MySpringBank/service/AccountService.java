package com.ty.MySpringBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.MySpringBank.model.Account;
import com.ty.MySpringBank.repository.AccountRepository;

@Service
public class AccountService {
    @Autowired
	private AccountRepository accountRepository;
	
	public Account createAccount(Account account) {
	 return accountRepository.save(account);
	}
	
	
}
