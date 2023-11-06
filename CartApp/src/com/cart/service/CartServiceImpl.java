package com.cart.service;

import java.util.Collection;
import java.util.List;
import com.cart.dao.CartDao;
import com.cart.dao.CartDaoDBImpl;
import com.cart.dao.CartDaoMapImpl;
import com.cart.exception.CartException;
import com.cart.pojo.Product;

public class CartServiceImpl implements CartService {

//	private CartDao cartDao = new CartDaoMapImpl(); //loose coupling
	private CartDao cartDao = new CartDaoDBImpl();
	
	
	@Override
	public Boolean addProductToCart(Product newProduct) {
		return this.cartDao.addProductsToCart(newProduct);
	}

	@Override
	public String deleteProductFromCart(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer setproductQuantity(Integer productId, Integer quantity) {
		
		return this.cartDao.updateProductQuantity(productId, quantity);
	}

	@Override
	public Collection<Product> getAllProductsFromCart() {
		
		return this.cartDao.getAllProducts();	
		}

	@Override
	public Double getTotalCostOfCart() {
		
		Collection<Product> prod = this.cartDao.getAllProducts();
		Double cost = 0.0;
		for(Product prods : prod) {
			cost = cost + prods.getPrice()* prods.getQuantity();
			
		}
		return cost;
	}

	@Override
	public Product getAllProductsFromCartById(Integer productId) throws CartException {
		Product foundproduct = this.cartDao.getProductFromCartById(productId);
		
		if(foundproduct != null) {
			return  foundproduct ;
		}
		else {
			return null;
		}
		
	}



}
