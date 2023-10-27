package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.AccountDAO;
import com.dao.AccountDAOImpl;
import com.model.Account;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO = new AccountDAOImpl();

	@Override
	public List<Account> getAllAccounts() {
		try {
			return accountDAO.getAllAccounts();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
