package july14_operator;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		int data = 10;
		System.out.println(data);
		data++;
		System.out.println("Data ++" + data);
		data = -data;
		System.out.println("Data - " + data);

		data = 1234;
		System.out.println(data / 10 + "data/10");
		System.out.println(data / 100 + "data/100");

		data = 1234;
		System.out.println(data % 10 + "data%10");
		System.out.println(data % 100 + "data%100");

		
		data = 8 >> 1;
		System.out.println("right shift" + data);
		data = 8 << 1;
		System.out.println("left shift" + data);
		
		
		int a = 0b1000; // 8
		int b = 0b0111; // 7
		int c = a | b; // or
		int d = a & b; // and
		int e = a ^ b; // xor 
		System.out.println(c);
		
		
		data = 10;
		int f=0 , g=0;
		c = data> 10 ? (f=10) : (g=20);
		System.out.println(c);
		
		
		//short hand operator
		int aa = 10;
		int bb = 20;
		bb += aa;
		System.out.println(bb);
		System.out.println(10_3);
		
		int aaa = 10;
		int bbb = 20;
		String ccc;
		ccc = (aaa>bbb)?"Greater":"Lesser";
//		 (aaa>bbb) ? (System.out.println("greater");) :( System.out.println("smaller"));
System.out.println(ccc);	

		int outerBlock = 10;
		{
			int innerBlock = 20;
			System.out.println(innerBlock);
			System.out.println(outerBlock);
			
			{
				int block1 = 30;
				System.out.print(block1);
				System.out.print(innerBlock);
				System.out.print(outerBlock);		
			}
		}
		//System.out.print(innerBlock);
		//System.out.print(block1);
		System.out.print(outerBlock);
	
		
		

	}

}
