package july14_practice;
import java.util.*;  
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a= sc.nextInt(); 
		int sum = 0;
		
		for(int i = 1; i<=a; ++i) 
		{
		
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		
		
	}

}
