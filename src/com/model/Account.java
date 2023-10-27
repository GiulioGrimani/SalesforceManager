package com.model;

public class Account {

	private Integer id;
	private String name;
	private Industry industry;
	private String address;
	private String description;

	public Account(Integer id, String name, Industry industry, String address, String description) {
		this.id = id;
		this.name = name;
		this.industry = industry;
		this.address = address;
		this.description = description;
	}

	public Account(String name, Industry industry, String address, String description) {
		this.name = name;
		this.industry = industry;
		this.address = address;
		this.description = description;
	}

	public Account() {
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

	public Industry getIndustry() {
		return industry;
	}

	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", industry=" + industry + ", address=" + address
				+ ", description=" + description + "]";
	}

}
