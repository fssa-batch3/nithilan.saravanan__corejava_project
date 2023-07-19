<<<<<<< HEAD
package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepNameOfEmployees {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, List<String>> depMap = new HashMap<>();
		
		System.out.println("Enter Input Like: HR, Name");
//		HR,Ram
//
//		HR, Suresh
//
//		IT, Basker
//
//		IT, Joseph
//
//		Admin, Sundar
		int i =0; 
		
		while(sc.hasNext()) {
			
			String str = sc.nextLine();
			
			if("stop".equals(str)) {
				break;
			}
			
			
			if(str == null|| "".equals(str)) {
				throw new IllegalArgumentException("Input cann't be Empty or Null");
			}
			
			String[] arrDepName = str.split(",");
			
			if(arrDepName.length < 2 || arrDepName.length > 2) {
				throw new IllegalArgumentException("Input Must hava Department and the Employee Name");
			}

			
			if(depMap.get(arrDepName[0]) == null) {
				depMap.put(arrDepName[0], new ArrayList<>());
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}else {
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}
			
		}
		
//		System.out.println(depMap);
		
		for(Map.Entry<String, List<String>> e : depMap.entrySet()) {
			
			String depName = e.getKey();
			List<String> empNames = e.getValue();
			
			System.out.println(depName + ": " + empNames);
			
		}
		

		
		
		sc.close();
		
	}

=======
package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepNameOfEmployees {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, List<String>> depMap = new HashMap<>();
		
		System.out.println("Enter Input Like: HR, Name");
//		HR,Ram
//
//		HR, Suresh
//
//		IT, Basker
//
//		IT, Joseph
//
//		Admin, Sundar
		int i =0; 
		
		while(sc.hasNext()) {
			
			String str = sc.nextLine();
			
			if("stop".equals(str)) {
				break;
			}
			
			
			if(str == null|| "".equals(str)) {
				throw new IllegalArgumentException("Input cann't be Empty or Null");
			}
			
			String[] arrDepName = str.split(",");
			
			if(arrDepName.length < 2 || arrDepName.length > 2) {
				throw new IllegalArgumentException("Input Must hava Department and the Employee Name");
			}

			
			if(depMap.get(arrDepName[0]) == null) {
				depMap.put(arrDepName[0], new ArrayList<>());
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}else {
				depMap.get(arrDepName[0]).add(arrDepName[1]);
			}
			
		}
		
//		System.out.println(depMap);
		
		for(Map.Entry<String, List<String>> e : depMap.entrySet()) {
			
			String depName = e.getKey();
			List<String> empNames = e.getValue();
			
			System.out.println(depName + ": " + empNames);
			
		}
		

		
		
		sc.close();
		
	}

>>>>>>> b4a9a9f8f32134ef21e6f65267938e9fd3159aff
}