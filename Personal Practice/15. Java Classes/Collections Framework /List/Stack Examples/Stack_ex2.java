package Collection_Framework;
import java.util.Stack;

public class Stack_ex2 {
    public static void main(String[] args) {
        String expression = "((4 + 5) * (6 - 3))";
        boolean isBalanced = checkBalancedParentheses(expression);

        if (isBalanced) {
            int result = evaluateExpression(expression);
            System.out.println("Result of the expression: " + result); 
            // Output: Result of the expression: 27
        } else {
            System.out.println("The expression has unbalanced parentheses.");
        }
    }

    // Method to check if parentheses in the expression are balanced
    public static boolean checkBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Method to evaluate the expression with balanced parentheses
    public static int evaluateExpression(String expression) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        int index = 0; // Index to traverse the expression

        while (index < expression.length()) {
            char ch = expression.charAt(index);
            if (ch == ' ') {
                index++; // Skip whitespace characters
            } else if (Character.isDigit(ch)) {
                // Extract and push the number onto the numberStack
                int num = 0;
                while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                    num = num * 10 + (expression.charAt(index) - '0');
                    index++;
                }
                numberStack.push(num);
            } else if (ch == '(') {
                operatorStack.push(ch); // Push opening parenthesis onto the operatorStack
                index++;
            } else if (ch == ')') {
                // Evaluate the expression inside the parentheses and update numberStack and operatorStack
                while (operatorStack.peek() != '(') {
                    int result = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
                    numberStack.push(result);
                }
                operatorStack.pop(); // Remove the opening parenthesis from the operatorStack
                index++;
            } else if (isOperator(ch)) {
                // Evaluate higher precedence operators and update numberStack and operatorStack
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    int result = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
                    numberStack.push(result);
                }
                operatorStack.push(ch); // Push the current operator onto the operatorStack
                index++;
            } else {
                throw new IllegalArgumentException("Invalid character in expression: " + ch);
            }
        }

        // Evaluate remaining operators and update numberStack
        while (!operatorStack.isEmpty()) {
            int result = performOperation(numberStack.pop(), numberStack.pop(), operatorStack.pop());
            numberStack.push(result);
        }

        // The final result is the only element left in the numberStack
        return numberStack.pop();
    }

    // Method to perform arithmetic operation
    public static int performOperation(int num2, int num1, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Method to check if the character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    // Method to assign precedence to operators
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    /*
     This example demonstrates how to use a Stack to check balanced parentheses in an expression 
     and evaluate an arithmetic expression with balanced parentheses. 
     The Stack data structure is crucial for maintaining the order of operations and performing calculations 
     in the correct sequence.*/
}
