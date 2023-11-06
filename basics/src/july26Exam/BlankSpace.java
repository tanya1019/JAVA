package july26Exam;

import java.util.Scanner;

public class BlankSpace {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any String : ---> ");
		String inputValue = input.nextLine();

//		String inputValue = "Indian   Cricket   team   tour   to   Australia";
		String outputValue = eliminateExtraSpace(inputValue);
		System.out.println("The output is ---> " + outputValue);

	}

	public static String eliminateExtraSpace(String input) {

		String result = input.replaceAll("\\s+", " ");
		return result;

	}

}
