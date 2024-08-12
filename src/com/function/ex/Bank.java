package com.function.ex;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private int id;
	private String customerName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", customerName=" + customerName + "]";
	}
	public Bank(int id, String customerName) {
		super();
		this.id = id;
		this.customerName = customerName;
	}
	

}
