package com.cart.service;

import java.util.Collection;
import java.util.List;

import com.cart.exception.CartException;
import com.cart.pojo.Product;

public interface CartService {
	
	Boolean addProductToCart(Product newProduct);
	
	String deleteProductFromCart(Integer productId);
	
	Integer setproductQuantity(Integer productId , Integer quantity );
	
	Collection<Product> getAllProductsFromCart();
	
	Double getTotalCostOfCart();


	Product getAllProductsFromCartById(Integer productId) throws CartException;
	

}
