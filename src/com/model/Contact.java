package com.model;

public class Contact {

	private Integer id;
	private String name;
	private String address;
	private String email;
	private Integer accountId;

	public Contact(Integer id, String name, String address, String email, Integer accountId) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.accountId = accountId;
	}

	public Contact(String name, String address, String email, Integer accountId) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.accountId = accountId;
	}

	public Contact() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", accountId="
				+ accountId + "]";
	}

}
