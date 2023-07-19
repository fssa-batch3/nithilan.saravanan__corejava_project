<<<<<<< HEAD
package day08.misc;

import java.util.Map;
import java.util.TreeMap;

public class HashMapSolved {
	public static void main(String[] args) {
		String arr[] = {"prathiusha","naresh","prathiusha","vishali","nithilan","prathiusha","vishali"};
		Map<String, Integer> countMap = new TreeMap<String, Integer>();
		for(int i =0; i < arr.length; i++) {
			if(countMap.get(arr[i])==null) {
				countMap.put(arr[i], 1);
			}else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i],count);
			}
		}
		System.out.println(countMap);
	}
=======
package day08.misc;

import java.util.Map;
import java.util.TreeMap;

public class HashMapSolved {
	public static void main(String[] args) {
		String arr[] = {"prathiusha","naresh","prathiusha","vishali","nithilan","prathiusha","vishali"};
		Map<String, Integer> countMap = new TreeMap<String, Integer>();
		for(int i =0; i < arr.length; i++) {
			if(countMap.get(arr[i])==null) {
				countMap.put(arr[i], 1);
			}else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i],count);
			}
		}
		System.out.println(countMap);
	}
>>>>>>> b4a9a9f8f32134ef21e6f65267938e9fd3159aff
}