package july26Exam;

import java.util.Scanner;

public class InflationRate {
	


	public static void main(String[] args) {
		
		

		Scanner input = new Scanner(System.in);
		   
        System.out.print("Enter cost ---> ");
        double cost = input.nextDouble();
 
        System.out.print("Enter years ---> ");
        int years = input.nextInt();
 
        System.out.print("Enter percent ---> ");
        double inflationRate = input.nextDouble();       
  
       

        Double calculateCost = calculateCost(cost, years, inflationRate);

        if(cost == 0 ) {
        	System.out.println("INVALID COST or YEARS or INFLATION");
        }
        else {
        	System.out.println(calculateCost);
        }
        
   

	}
	public static  Double calculateCost(double cost, int years, double inflationRate) {

		 inflationRate = inflationRate / 100 * 0.01;
		 
		for(int i = 1; i <= years; i++){
	        cost += cost * inflationRate;
	     }
		return cost;
		

	}

}
