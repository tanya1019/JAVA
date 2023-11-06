package july14_practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a= sc.nextInt(); 
		
		int x = 0;
		int y = 1;
		int sum = 0;
		
		for (int i = 0; i < a; i++) {
			
			sum = x + y;
			System.out.println(sum);
			x = y;
			y = sum;
			
			
			
		}
		 
		
		
		
		
	}

}
