package app.abc.calculator;

public interface CalculatorService {
	
	Integer add(Integer data1, Integer data2);
	Integer sub(Integer data1, Integer data2);
	Double mul(Double data1, Double data2);
	Double div(Double data1 , Double data2) throws CalculatorException;


}
