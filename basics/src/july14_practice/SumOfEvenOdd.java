package july14_practice;

public class SumOfEvenOdd {

	public static void main(String[] args) {
	
		Integer n = 123456;
		Integer even = 0;
		Integer odd = 0;
		while (n!=0) {
			int a = n%10;
			if (a%2==0) {
				even = even +a;
			}
			else {
				odd = odd+a;
			}
			n = n/10;
		}
		
System.out.println("Even number is"+ even);
System.out.println("Odd number is"+ odd);
	}

}
