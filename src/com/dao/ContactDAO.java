package com.dao;

import java.util.List;

import com.model.Contact;

public interface ContactDAO {
	final static String getAllContacts = "SELECT * FROM contact;";

	List<Contact> getAllContacts();

}
