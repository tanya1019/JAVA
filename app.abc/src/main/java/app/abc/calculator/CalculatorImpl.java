package app.abc.calculator;

public class CalculatorImpl implements CalculatorService {

	
	@Override
	public Integer add(Integer data1, Integer data2) {
		return data1 + data2;
	}

	@Override
	public Integer sub(Integer data1, Integer data2) {
		return data1 - data2;
	}

	public Double mul(Double data1, Double data2) {
		return data1 * data2;
	}

	@Override
	public Double div(Double data1, Double data2) throws CalculatorException {
		
		if(data2 == 0.0) {
			throw new CalculatorException("Divide by zero!");
		}
		else {
			return data1/data2;
		}
		
		
	}

	


}
