package dataStructures;
import java.util.*;

public class Hashmaps {
	public static void main(String[] args) {
		HashMap<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Andrew", "5555");
		phonebook.put("John", "4567");
		phonebook.put("Alice", "9999");
		
		
		
		System.out.println("Size of the hashmap is " + phonebook.size());
		for (@SuppressWarnings("rawtypes") Map.Entry contact: phonebook.entrySet()) {
			System.out.println(contact.getKey() + " " + contact.getValue());
		}
		String key = "John";
		System.out.println("John's number is " + phonebook.get(key)); 
	}
}
