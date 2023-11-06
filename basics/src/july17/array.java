package july17;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array
		float cgpa = 100;
		float cgpaArray[] = { 9.1f, 9.2f, 6.5f, 7.4f };
		
		System.out.println("--->"+cgpaArray);
				
		// base address + ( index*size )
		
		//modify
		cgpaArray[0] = 9.0f;
		
		for(int i=0; i < cgpaArray.length ; i++ ) 
		{
			System.out.println( "cgpa index ["+ i +"] =  " + cgpaArray[i] );
			cgpaArray[i] = cgpaArray[i] * 0.002f;
			System.out.println("===>" + cgpaArray[i]);
			
		}
		
		//for each 
		for( float cgpaData : cgpaArray  ) 
		{
			System.out.println(cgpaData);
		}
		
		
		
		System.out.println( "hash code of array" + cgpaArray.hashCode()  );
		
		// to access data from array
		float lastCgpa = cgpaArray[3];
		System.out.println(lastCgpa);
		
		
		// wrapper array
		Float []floatArray = new Float[5];
		
		floatArray[0] = 5.1f;
		floatArray[1] = 5.2f;
//		floatArray[2] = 5.3f;
//		floatArray[3] = 5.4f;
		floatArray[4] = 5.5f;
		
		for(Float value : floatArray) {
//			if( value != null) {
				System.out.println(value);
//			}
			
		}
		

		
			
		}
		
		
		
	}


