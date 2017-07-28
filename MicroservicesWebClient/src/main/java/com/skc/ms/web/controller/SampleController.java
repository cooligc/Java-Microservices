/**
 * 
 */
package com.skc.ms.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.ms.web.repo.Account;
import com.skc.ms.web.repo.RemoteAccountRepository;

/**
 * @author chaudhsi
 *
 */
@RestController
public class SampleController {

	@Autowired
	RemoteAccountRepository accountRepository;
	
	@GetMapping
	public Account getDetails() {
		System.out.println("Out ==> "+accountRepository.getAccountDetails());
		return accountRepository.getAccountDetails();
	}
	
}
