package Lambda_Expressions;

/* A lambda expression is a short block of code which takes in parameters and returns a value. 
   Lambda expressions are similar to methods, but they do not need a name 
          and they can be implemented right in the body of a method. 
          
   A functional interface is an interface that has only one abstract method. 
   Lambda expressions allow you to treat functions as method arguments, or code as data. 
   They make your code more readable and reduce the need for boilerplate code.       */


//  example of a Comparator for sorting a list of integers in ascending order using lambda expressions : 

import java.util.*;
public class LambdaExpressions_Overview {
    public static void main(String[] args) {
    	
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 3);
        Collections.sort(numbers, (a, b) -> a.compareTo(b));
        System.out.println(numbers); // Output: [1, 2, 3, 5, 9]
        
    }
}

/* Advantages of Lambda Expressions:
   Concise and readable code: Lambda expressions reduce the amount of boilerplate 
           code needed for simple functions, making the code more concise and readable.
           
   Improved use of functional programming: Lambda expressions enable functional programming 
           paradigms in Java, making it easier to work with functions as first-class citizens.
           
   Enhanced collections and stream APIs: Lambda expressions work well with Java's Stream API, 
           making it easier to perform complex operations on collections.
   
   
   Disadvantages of Lambda Expressions:
   Limited to functional interfaces: Lambda expressions can only be used with functional interfaces, 
   which might be limiting in certain scenarios.
   
   Difficulty with complex logic: Lambda expressions are best suited for simple functions. 
   More complex logic may require the use of traditional methods 
   or anonymous inner classes for better readability.*/




/* Overall, Java Lambda Expressions are a powerful feature that brings functional 
   programming capabilities to the Java language, 
   allowing developers to write more concise and expressive code. */

