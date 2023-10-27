package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Account;

public interface AccountDAO {

	final static String getAllAccounts = "SELECT * FROM account;";

	List<Account> getAllAccounts() throws SQLException;

}
