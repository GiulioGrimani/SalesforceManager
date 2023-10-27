package com.main;

import com.service.AccountService;
import com.service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		AccountService ac = new AccountServiceImpl();

		ac.getAllAccounts().forEach(acc -> System.out.println(acc));

	}

}
