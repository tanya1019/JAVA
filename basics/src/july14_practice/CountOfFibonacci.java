package july14_practice;

import java.util.Scanner;

public class CountOfFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a= sc.nextInt(); 
		
		int x = 0;
		int y = 1;
		int sum ;
		int count= 2;
		System.out.println(x + " " + y);
		for (int i = 2; i < a; i++) {
			count++;
			sum = x + y;
			System.out.println(" " + sum);
			x = y;
			y = sum;
			
			
			
			
		}
		System.out.println("Count is" + count);
		 

	}

}
