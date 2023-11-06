package app.abc.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest  {
	
	
	CalculatorService calculatorService = new CalculatorImpl();
	

	@Test
	public void addTest() {	
		assertEquals(10, calculatorService.add(5, 5));
	}

	
	@Test
	public void subTest() {
		assumeTrue(calculatorService != null);
		assertEquals(0, calculatorService.sub(5, 5));
	}
	
	
	@Test
	public void mulTest() {
		assertEquals(25, calculatorService.mul(5.0, 5.0));
	}
	
	
	@Test
	public void divTest() throws CalculatorException{
		assertThrows(CalculatorException.class, () -> calculatorService.div(10.0, 0.0));
	}
	
	@Test
	public void divideByZeroThrowsExceptionWithMessage()  {
		try {
			calculatorService.div(10.0, 0.0);
		}
		catch (CalculatorException e){
			assertEquals("Divide by zero!", e.getMessage());
		}
	}
	

}
