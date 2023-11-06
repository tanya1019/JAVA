package com.cart.pojo;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<Integer, Product> products = new HashMap<>();
	
	//------------Getters and Setters-----------------
	
	public Map<Integer, Product> getProducts() {
		return products;
	}


	public void setProducts(Map<Integer, Product> products) {
		this.products = products;
	}


	//----------------toString----------------
	@Override
	public String toString() {
		return "Cart [products=" + products + "]";
	}


	//---------------Constructors--------------
	public Cart() {
		super();
	}
	
	

}
