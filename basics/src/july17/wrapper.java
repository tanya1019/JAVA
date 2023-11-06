package july17;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primitiveData = 100;   // primitive data type
		
		Integer wrapperData = 12345678; // auto boxing [converting primitive into wrapper object]  WRAPPER CLASS
		
		String intString = wrapperData.toString(); // into String
		
		System.out.println("length of 200 --->" + intString.length()); // length of String
		
		System.out.println(wrapperData.byteValue()); //byte
		
		primitiveData = wrapperData; //auto unboxing
		
		System.out.println( "Primitive Data Type " + primitiveData  );
		
		int a = 1;
		int b = 2;
		
		int c = Integer.compare(b,a);
		System.out.println(c);
		
		double doubleData = 124.56D;
		Double wrapperDoubleData = doubleData; 
		doubleData = wrapperDoubleData;
		
		
		// data widening( byte >short >char >int >long > float)
		wrapperData = primitiveData;
		
		//data narrowing type casting is necessary
		primitiveData = (int) wrapperData;
		System.out.println("======"+primitiveData);
		
		String stringNumber = "2023";
		Integer integerNumber = Integer.parseInt(stringNumber) ;
		System.out.println(integerNumber);
		
		//boxing
		Integer integerValue =  (int) 255.5D;
		System.out.println(integerValue); 
		
		//we cannot type cast wrapper to wrapper so we use value()
		Short shortValue =integerValue.shortValue(); 
		System.out.println(shortValue);
		
		
		// convert float wrapper to integer wrapper
		Float floatWrapper  = 3.14f ;  
		Integer integerWrapper = floatWrapper.intValue();
		System.out.println(integerWrapper);
		
		// into byte
		Byte byteValue = integerValue.byteValue();
		System.out.println(byteValue);

		
		
		
		
		
		
	}

}
