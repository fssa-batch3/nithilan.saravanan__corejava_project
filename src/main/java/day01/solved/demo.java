package day01.solved;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];

		System.out.println("Enter Yout Input: ");

		for(int i=0; i<a.length; i++){

		    for(int j=0; j<a[i].length; j++){
			
			a[i][j] = sc.nextInt();
			System.out.print(a[i][j]+" ");
			
		    } 

		}
		for(int i=0; i<2; i++)
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(a));

		
	}

}
