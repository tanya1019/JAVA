package july18;

public class StaticDriver {

	public static void main(String[] args) {
	
		// static data arre the shared data that is been used in the same class where every body in the same class can access the data
		// all static data belongs to the class
		
		Static a = new Static();
		a.data = 100;
		System.out.println(a.data);
		
		Static b = new Static();
		 b.data = 100;
		System.out.println(b);
		
		
	
		
		
		
		
	}
	

}
