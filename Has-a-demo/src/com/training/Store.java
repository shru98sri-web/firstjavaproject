package com.training;

public class Store {

	private Product prod;
	private int id;
	private String storeName;
	private Address address;
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(Product prod, int id, String storeName, Address address) {
		super();
		this.prod = prod;
		this.id = id;
		this.storeName = storeName;
		this.address = address;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Store [prod=" + prod + ", id=" + id + ", storeName=" + storeName + ", address=" + address + "]";
	}
	
	}
