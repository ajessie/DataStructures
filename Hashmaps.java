package dataStructures;
import java.util.*;

public class Hashmaps {
	public static void main(String[] args) {
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Andrew",   445);
		phonebook.put("John"  ,   306);
		phonebook.put("Alice" ,   206);
	    Scanner myObj = new Scanner(System.in);  						// Create a Scanner object
	    System.out.println("Enter Contact Name");						// Get user input
	    String userName = myObj.nextLine();      						// Read user input
	    
		if (phonebook.containsKey(userName)) {
			Integer a = phonebook.get(userName);
			System.out.println(userName + "'s number is:" + " " + a);
		    myObj.close();												// Close scanner
		} else {
			System.out.println("Not Found");
		}
	}
}
