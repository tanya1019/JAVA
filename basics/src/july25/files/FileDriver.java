package july25.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDriver {

	public static void main(String[] args) {
		
		
		// to create the file
		try 
		{
			File myObj = new File("file1.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created" + myObj.getName());
			}
			else {
				System.out.println("File created");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error in creating");
			e.printStackTrace();
		}
		
		
		
		// to write in the file
		try 
		{
			FileWriter myWriter = new FileWriter("file1.txt");
			myWriter.write("This is file text1");
			myWriter.write("This is the second line");
			myWriter.close();
		}
		catch(IOException e) {
			System.out.println("Error in writing");
			e.printStackTrace();
		}
		
		
		// to read the file
		try
		{
			File myReader = new File("file1.txt");
			Scanner fileReader = new Scanner(myReader);
			while(fileReader.hasNextLine()) 
			{
				System.out.println(fileReader.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error in reading");
			e.printStackTrace();
		}
		
		
			File deleteObj = new File("file1.txt");
			if(deleteObj.delete()) {
				System.out.println("File Deleted");
			}
			else {
				System.out.println("File failed to delete");
			}
			
		
		
		

	}

}
