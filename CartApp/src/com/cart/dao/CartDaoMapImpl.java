package com.cart.dao;

import java.util.Collection;
import java.util.List;

import com.cart.pojo.Cart;
import com.cart.pojo.Product;

public class CartDaoMapImpl implements CartDao {
	
	
	private Cart cart = new Cart();

	@Override
	public Boolean addProductsToCart(Product newProduct) {
		this.cart.getProducts().put(newProduct.getId(), newProduct);
		return true;
	}

	@Override
	public String removeProductFromCart(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer increaseProductQuantity(Integer productId, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateProductQuantity(Integer productId, Integer quantity) {
		Product updateproductQuantity = this.cart.getProducts().get(productId);
		updateproductQuantity.setQuantity(quantity);
		return updateproductQuantity.getQuantity();
	}

	@Override
	public Collection<Product> getAllProducts() {
//		this.cart.getProducts().get(cart);
		return (Collection<Product>) this.cart.getProducts().values();
	}

	@Override
	public Product getProductFromCartById(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
