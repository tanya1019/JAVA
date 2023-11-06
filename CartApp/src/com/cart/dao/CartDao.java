package com.cart.dao;

import java.util.Collection;
import java.util.List;

import com.cart.pojo.Product;

public interface CartDao {
	
	
	Boolean addProductsToCart(Product newProduct);
	
	String removeProductFromCart(Integer productId);
	
	Integer increaseProductQuantity(Integer productId, Integer quantity);
	
	Integer updateProductQuantity(Integer productId, Integer quantity);
	
	Collection<Product> getAllProducts();
	
	Product getProductFromCartById(Integer productId);
	
	
}
