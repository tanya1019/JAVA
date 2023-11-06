package july25.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import july18.Employee;
import july24.generics.EmployeeSalaryComaprator;

public class MapDriver {

	public static void main(String[] args) {
		
		// the contents are not in the same order
		// the values are not sorted
		// you will always have a unique key 
		// when you want a large amount of data then only use the map
		// frequent searches are there in your logic then only we use the map
		
		Map<Integer, String> countryCode = new HashMap<>(); 
		
		countryCode.put(91, "India");
		countryCode.put(92, "Pakistan");
		countryCode.put(54, "Argentina");
		countryCode.put(306, "Canada");
		countryCode.put(55, "Brazil");
		countryCode.put(49, "Germany");
		countryCode.put(50, "Germany"); // can have duplicate values but no duplicate keys
		countryCode.put(101, null); // can have multiple null value
		countryCode.put(102, null);
		countryCode.put(null, "Other Country");
//		countryCode.put(null, "Another Country"); //no multiple null key values	
		System.out.println(countryCode);

		System.out.println(countryCode.containsKey(306));
		
		System.out.println("contains value -----> " + countryCode.containsValue("India"));
		
		Set <Integer> CountryCodes = countryCode.keySet();
		System.out.println("set of all keys---> " + CountryCodes);
		
		Collection<String> CountryList = countryCode.values();
		System.out.println("Country List ---> " + CountryList);
		
		
		System.out.println("replace ------> " + countryCode.replace(306, "USA"));
		
		System.out.println(countryCode.entrySet());
		
		System.out.println("remove ----> " + countryCode.remove(92, "Pakistan"));
		System.out.println("remove ----> " + countryCode.remove(102));
		System.out.println("remove ----> " + countryCode.remove(101));
		System.out.println("remove ----> " + countryCode.remove(null));
		
		
		System.out.println("size of map ----> " + countryCode.size());
		
		System.out.println("get values ----->" + countryCode.get(91));
		
		//iteration 
		for(Map.Entry<Integer, String> mapEntry: countryCode.entrySet()) {
			System.out.println("all values ----> " + mapEntry);
			System.out.println("Values are ---> " + mapEntry.getValue());
			System.out.println("Keys are ---> " + mapEntry.getKey());
		}
		
		List <Integer> countryCodeList = new ArrayList<>(CountryCodes);
		Collections.sort(countryCodeList);
		
		for(Integer code : countryCodeList) {
			System.out.println( countryCode.get(code));
		}

		TreeMap<Integer, String> treeCountryMap = new TreeMap<>(countryCode);
		System.out.println(treeCountryMap);
		
		// user defined classes data type
		// CRUD operation on Employee
		
		// create
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(101, new Employee(101, "Tanya", 1000.0f));
		employeeMap.put(102, new Employee(102, "Akanksha",2000.0f));
		employeeMap.put(103, new Employee(103, "Soniya", 3000.0f));
		System.out.println(employeeMap);
		
		
		//read	
		Integer key = 102;
		Employee empRef = employeeMap.get(key);
		if(employeeMap.containsKey(key)) {
			System.out.println(employeeMap.get(key));
		}
		
		
		// update
		Integer key1 = 101;
		if(employeeMap.containsKey(key1)) {
			Employee getKey = employeeMap.get(key1);
			getKey.setName("tanisha");
			System.out.println(employeeMap.get(key1));
		}
		
		
		// delete
		Integer key3 = 101;
		if(employeeMap.containsKey(key3)) {
			employeeMap.remove(key3);
			System.out.println("---> " + employeeMap);
		}
		
		List<Employee> employeeArray = new ArrayList<>();
		employeeArray.add( new Employee(1, "Tanya", 1000.0f));
		employeeArray.add( new Employee(2, "Akanksha", 2000.0f));
		employeeArray.add( new Employee(3, "Soniya", 3000.0f));
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Tanya");
		nameList.add("Akanksha");
		nameList.add("Indra");
		nameList.add("Tanisha");
		nameList.add("Sakshi");
		nameList.add("Soniya");
		
		Collections.sort(nameList);
		Object names[] = nameList.toArray();
		
		
		int foundPosition = Arrays.binarySearch(names, "Sakshi");
		
		if(foundPosition >= 0) {
			System.out.println("Found At : " + foundPosition);
		}
		else { 
			System.out.println("Not Found");
		}
		
		// Assignment
		
		
		

		Map<Integer, Products> productsMap = new HashMap<>();
		
		System.out.println("1 ---> Add Product");
		System.out.println("2 ---> Read Product");
		System.out.println("3 ---> Update Product");
		System.out.println("4 ---> Delete Product");
		System.out.println("5 --->Display Product");

		
		Scanner sc=new Scanner(System.in); 
		
		
		do {
			int choice;
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				productsMap.put(105, new Products(105, "Product5", 2200.0f));
				productsMap.put(100, new Products(100, "Product1", 100.0f));
				productsMap.put(101, new Products(101, "Product2", 1200.0f));
				productsMap.put(102, new Products(102, "Product3", 130.0f));
				productsMap.put(103, new Products(103, "Product4", 140.0f));
				productsMap.put(104, new Products(104, "Product5", 5000.0f));
				
				break;
			
			case 2 : 
				int readItem= sc.nextInt(); 
				
				if(productsMap.containsKey(readItem)) {
					System.out.println(productsMap.get(readItem));
				}
				break;
				
			case 3 : 
				
				int updateItem= sc.nextInt();
				
				if(productsMap.containsKey(updateItem)) {
					Products prodKey =  productsMap.get(updateItem);
					prodKey.setProductname("Added Product name");
				}
				break;
				
			case 4 : 
				
				int deleteItem= sc.nextInt();
				
				if(productsMap.containsKey(deleteItem)) {
					productsMap.remove(deleteItem);
				}
				break;
				
			case 5:
				for(Map.Entry<Integer, Products> entry:productsMap.entrySet()) {
					System.out.println(entry.getValue());
				}
		    break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			
			
		}while(true);
		
		
		
		
		
	
		
		
		
	
		
		
		
 		
		
		
	}

}
