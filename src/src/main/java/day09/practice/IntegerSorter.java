<<<<<<< HEAD
package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        // Iterate over each number string entered by the user986754
        for (String numberString : numberStrings) {
            // Convert the number string to an integer
            int number = Integer.parseInt(numberString);
            // Add the integer to the ArrayList
            numbers.add(number);
        }

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        System.out.print("Sorted list: ");
        // Iterate over the sorted list and print each number
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

=======
package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        // Iterate over each number string entered by the user986754
        for (String numberString : numberStrings) {
            // Convert the number string to an integer
            int number = Integer.parseInt(numberString);
            // Add the integer to the ArrayList
            numbers.add(number);
        }

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        System.out.print("Sorted list: ");
        // Iterate over the sorted list and print each number
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

>>>>>>> b4a9a9f8f32134ef21e6f65267938e9fd3159aff
