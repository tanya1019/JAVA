package Aug3Exam;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {

        int inputSize; // 
        Scanner input=new Scanner(System.in);  
        System.out.print("Enter the size of the list -->  ");  
       
        inputSize=input.nextInt();  
        
        ArrayList<Integer> list = new ArrayList<>(); 
        System.out.println("Enter the elements of the array -->  ");  
        for(int i=0; i<inputSize; i++)  
        {  
     
       list.add(input.nextInt()); 
        }  
        
        System.out.println("List before removing values --> "+ list);
        removeMaxMin(list);
        
       
	}
	 public static void removeMaxMin(ArrayList<Integer> scores) {
         Integer max = scores.get(0);
         Integer min = scores.get(0);

        // min max of the array
         for(Integer i=0;i<scores.size();i++) {
                  if(scores.get(i)>max) {
                       max = scores.get(i);
                  }
                  if(scores.get(i)<min) {
                       min = scores.get(i);
                  }
         }
        
         // removing min max of array
         scores.remove(min);
         scores.remove(max);
         System.out.println("list after removing values --> "+scores);
    }

}
