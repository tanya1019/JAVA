package july20.iinheritance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		
		// dynamic polymorphism

		BWTV b1 = new BWTV();
		ColorTv c1 = new ColorTv();
		
//		b1.display();
//		c1.display();
		
		BWTV tvRef;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Bw  2) Color");
		int choice = scanner.nextInt();
		
		if(choice == 1 ) {
			tvRef = b1;
		}
		else {
			tvRef = c1;
		}
		tvRef.display();

		
//		ColorTv voiceRef = new ColorTv();
//		voiceRef.voice() ;
//		
		
	}

	
	
}
