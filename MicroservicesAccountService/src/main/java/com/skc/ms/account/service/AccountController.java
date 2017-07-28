/**
 * 
 */
package com.skc.ms.account.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.ms.account.service.pojo.Account;

/**
 * @author chaudhsi
 *
 */
@RestController
@RequestMapping("/service")
public class AccountController {

	@GetMapping("/account")
	public Account getAccount() {
		return new Account("sitakant", "11111111");
	}
	
}
