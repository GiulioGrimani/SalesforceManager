package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.dbtools.DBTools;
import com.model.Account;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public List<Account> getAllAccounts() throws SQLException {
		Connection connection = DBTools.getConnection();

		List<Account> accounts = new ArrayList<>();

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(getAllAccounts);

		while (rs.next()) {
			accounts.add(mapToAccount(rs));
		}
		DBTools.closeConnection(connection);
		return accounts;

	}

	private Account mapToAccount(ResultSet rs) throws SQLException {
		Integer id = rs.getInt("id");
		String name = rs.getString("name");
//		String industry = rs.getString("industry");
		String address = rs.getString("address");
		String description = rs.getString("description");
		return new Account(id, name, null, address, description);
	}

}
