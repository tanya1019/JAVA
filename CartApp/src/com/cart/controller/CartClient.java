package com.cart.controller;

import java.util.Collection;
import java.util.List;

import com.cart.pojo.Product;
import com.cart.service.CartService;
import com.cart.service.CartServiceImpl;

public class CartClient {

	public static void main(String[] args) {
	
		CartService cartService = new CartServiceImpl(); //loose coupling

		cartService.addProductToCart(new Product(1, "Dell Laptop", 65000.0, 1));
		
		Collection<Product> currentCartProducts =  cartService.getAllProductsFromCart();
		System.out.println(currentCartProducts);
		
		System.out.println(cartService.setproductQuantity(1, 2));
		System.out.println(currentCartProducts);
		
		cartService.deleteProductFromCart(1);
		
		System.out.println(cartService.getTotalCostOfCart());
	}

}
