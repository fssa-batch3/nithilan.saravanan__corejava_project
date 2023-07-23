package faceprep;

import java.util.Scanner;

public class m {

    // Recursive method to check if a number is prime
    private static boolean isPrime(int number, int divisor) {
        if (divisor <= 1) {
            return true;
        }
        
        if (number % divisor == 0) {
            return false;
        }
        
        return isPrime(number, divisor - 1);
    }

    // Wrapper method to call the recursive method
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Call the recursive method starting from the square root of the number
        return isPrime(number, (int) Math.sqrt(number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");

        int num = scanner.nextInt();

        // Check if the number is prime using the isPrime method
        boolean isNumPrime = isPrime(num);

        System.out.println(num + " is prime: " + isNumPrime);

        scanner.close();
    }
}
