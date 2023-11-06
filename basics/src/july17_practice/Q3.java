package july17_practice;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// program to remove duplicate values
		
		Integer []duplicateArray = { 1,2,3,4,3};
		Integer []uniqueArray  = new Integer[duplicateArray.length];
		Integer k = 1;
		uniqueArray[0] = duplicateArray[0];
		
		for (int i=1; i< duplicateArray.length; i++) 
			
		{
			
			for( int j=0; j< duplicateArray.length; j++) 
				
			{
				
				if(duplicateArray[i]!=duplicateArray[j]) 
				{
					
					uniqueArray[k] = duplicateArray[j];
					k++;
					
				}
				
			
			}
			
		}
		for(Integer uniqueValueArray : uniqueArray) {
			System.out.println(uniqueValueArray);
		}
		
		
	}
	
}