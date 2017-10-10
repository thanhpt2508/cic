package com.csetech.myspringmvc.entity;

import java.util.List;

public class RequestCicWrapper {
	ThamsoKetnoi tsKetnois;
	List<Customer> customers;
	public ThamsoKetnoi getTsKetnois() {
		return tsKetnois;
	}
	public void setTsKetnois(ThamsoKetnoi tsKetnois) {
		this.tsKetnois = tsKetnois;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	} 
		

}
