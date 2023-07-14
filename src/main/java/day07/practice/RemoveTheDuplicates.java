package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveTheDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList<Integer> with duplicate entries
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(1);

        // Create a HashSet<Integer> to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(num);

        // Display the unique values
        System.out.println("Unique values:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}
