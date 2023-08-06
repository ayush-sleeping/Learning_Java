package Collection_Framework;

import java.util.Stack;

public class Stack_ex3 {
    public static void main(String[] args) {
        String input1 = "{[()]()}";
        String input2 = "{[(])}";
        String input3 = "{{[[(())]]}}";

        // Checking if the symbols in input1 are balanced and printing the result
        System.out.println(input1 + " is balanced: " + checkBalancedSymbols(input1)); // Output: {[()]()} is balanced: true

        // Checking if the symbols in input2 are balanced and printing the result
        System.out.println(input2 + " is balanced: " + checkBalancedSymbols(input2)); // Output: {[(])} is balanced: false

        // Checking if the symbols in input3 are balanced and printing the result
        System.out.println(input3 + " is balanced: " + checkBalancedSymbols(input3)); // Output: {{[[(())]]}} is balanced: true
    }

    // Method to check if the symbols in the input string are balanced
    public static boolean checkBalancedSymbols(String input) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // If an opening symbol is found, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If a closing symbol is found, check if it matches the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or the top of the stack does not match the closing symbol, the symbols are not balanced
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty after processing all symbols, the symbols are balanced
        return stack.isEmpty();
    }

 // Helper method to check if a pair of symbols form a matching pair
    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    /*
     The example demonstrates how a Stack can be used to check for balanced symbols in a given string. 
     The program checks three example strings, and the output shows whether the symbols in each string 
     are balanced or not.*/
}
