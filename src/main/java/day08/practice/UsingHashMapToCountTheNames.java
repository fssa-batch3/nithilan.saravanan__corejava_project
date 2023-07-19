<<<<<<< HEAD
package day08.practice;


import java.util.HashMap;

public class UsingHashMapToCountTheNames {
	
	public static void main(String[] args) {
		
		// Input string containing names
		String strNames = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
		
		// Splitting the string into an array of names
		String[] arrNames = strNames.split(", ");
		
		// Creating a HashMap to store names as keys and counts as values
		HashMap<String, Integer> namesMap = new HashMap<>();
		
		// Iterating through each name in the array
		for(String e : arrNames) {
			
			// Checking if the name already exists in the map
			if(namesMap.get(e) == null) {
				// If it doesn't exist, add it with a count of 1
				namesMap.put(e, 1);
			} else {
				// If it exists, increment the count by 1
				int count = namesMap.get(e) + 1;
				namesMap.put(e, count);
			}
		}
		
		// Printing the name and count for each entry in the map
		for(HashMap.Entry<String, Integer> entry : namesMap.entrySet()) {
			String name = entry.getKey();
			int count = entry.getValue();
			System.out.println(name + ": " + count);
		}
	}
}
=======
package day08.practice;


import java.util.HashMap;

public class UsingHashMapToCountTheNames {
	
	public static void main(String[] args) {
		
		// Input string containing names
		String strNames = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
		
		// Splitting the string into an array of names
		String[] arrNames = strNames.split(", ");
		
		// Creating a HashMap to store names as keys and counts as values
		HashMap<String, Integer> namesMap = new HashMap<>();
		
		// Iterating through each name in the array
		for(String e : arrNames) {
			
			// Checking if the name already exists in the map
			if(namesMap.get(e) == null) {
				// If it doesn't exist, add it with a count of 1
				namesMap.put(e, 1);
			} else {
				// If it exists, increment the count by 1
				int count = namesMap.get(e) + 1;
				namesMap.put(e, count);
			}
		}
		
		// Printing the name and count for each entry in the map
		for(HashMap.Entry<String, Integer> entry : namesMap.entrySet()) {
			String name = entry.getKey();
			int count = entry.getValue();
			System.out.println(name + ": " + count);
		}
	}
}
>>>>>>> b4a9a9f8f32134ef21e6f65267938e9fd3159aff
