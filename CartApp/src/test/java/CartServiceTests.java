package test.java;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.cart.pojo.Product;
import com.cart.service.CartService;
import com.cart.service.CartServiceImpl;

// there is no guarantee order of execution of test cases

@TestInstance(Lifecycle.PER_CLASS)
public class CartServiceTests {
	
	CartService cartService = new CartServiceImpl();
	
	@BeforeAll
	 void beforeAll(){
		System.out.println("Before All Execution");
		
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each execution");
	}
	
	@AfterAll
	 void afterAll() {
		System.out.println("After All test cases");
	}
	
	@AfterEach
	 void afterEach() {
		System.out.println("After each test cases");
	}
	
	@Test
	//delete test case
	void deleteProductFromCart() {
		try {
			this.cartService.deleteProductFromCart(1);
			assertTrue(this.cartService.getAllProductsFromCartById(1) == null);
			}
		catch(Exception e){
				System.out.println(e.getMessage());
			}
	}
	
	
	@Disabled
	@Test
	 void DemoTest() {
		assertTrue(false);
	}
	
	
	@Test
	 void addProductsToCartTest() {
		try {
			Product newProd = new Product(7, "Prod1", 2100.0, 3);
			assertTrue(this.cartService.addProductToCart(newProd) );
//			assertEquals(true, this.cartService.addProductToCart(newProd));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//write test case for total cost
	@Test
	public void totalCostTest() {
		try {
			Collection<Product> costProd = this.cartService.getAllProductsFromCart();
			Optional<Double> costOpt = costProd.stream().map(p -> p.getPrice()* p.getQuantity()).reduce((a,b) -> a+b);
			assumeTrue(costOpt.isPresent());
			assertEquals(costOpt.get(), this.cartService.getTotalCostOfCart());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}



