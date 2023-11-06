package july14_practice;

public class reverse {

	public static void main(String[] args) {
		
		Integer number = 123456;
		
		Integer reverse = 0; 
		
		while(number != 0 ) {
			int a  = number % 10;
			System.out.println(a);
			reverse = reverse * 10 + a;
			number = number/10;
			
		}
		
		System.out.println( reverse);

	}

}
