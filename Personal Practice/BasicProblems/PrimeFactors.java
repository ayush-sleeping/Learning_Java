package BasicProblems;

// Find the Prime Factors of a Number ::

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Prime factors of " + number + ": ");
        findPrimeFactors(number);
        
        scanner.close();
    }
    
    static void findPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}
/* 
 The findPrimeFactors method takes the number as a parameter and iterates from 2 up to the number itself.

 Inside the loop, it checks if the current number is a factor of the input number 
 using the condition number % i == 0. If it is, it means i is a potential prime factor.

 The program then enters a while loop, repeatedly dividing the input number by i as long as 
 it's divisible by i. This step is crucial for finding all occurrences of the prime factor i.

 Once the division is done, the loop moves on to the next value of i.

 After the loop completes, the prime factors are printed to the console.
 For example, if you enter the number 56, the prime factors will be calculated and printed as: "2 2 2 7". 
 This shows that 56 is equal to 2 × 2 × 2 × 7.

 */