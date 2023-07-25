package Regular_Expression;

/* 
 A regular expression is a sequence of characters that forms a search pattern. 
 When you search for data in a text, you can use this search pattern to describe what you are searching for.

 A regular expression can be a single character, or a more complicated pattern.
 Regular expressions can be used to perform all types of text search and text replace operations.

 
 Java does not have a built-in Regular Expression class, 
      but we can import the java.util.regex package to work with regular expressions. 
 The package includes the following classes:
    
    Pattern Class - Defines a pattern (to be used in a search)
                    The Pattern class represents a compiled regular expression. 
                    It allows us to define a regex pattern and compile it into a Pattern object.
                    
    Matcher Class - Used to search for the pattern
                    The Matcher class is used to match a pattern against a specific input text. 
                    It provides methods for finding matches, extracting matched groups, and performing replacements.
    
    PatternSyntaxException Class - Indicates syntax error in a regular expression pattern 
 */

// -------------------------------------------------------------------------------------------------------------

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_OverView {
    public static void main(String[] args) {
        String input = "Hello, my name is Ayush. I am 25 years old.";

        // Define the regex pattern to match the word "Ayush"
        String regex = "\\bAyush\\b";

        // Compile the pattern and create a Matcher object
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Find and print all occurrences of "Ayush"
        while (matcher.find()) {
            System.out.println("Found at index " + matcher.start() +
                               ": " + matcher.group());
        }
    }
}


//-------------------------------------------------------------------------------------------------------------

/*
 Common Methods in Pattern Class:    
    compile(String regex): Compiles the given regex pattern into a Pattern object.
    matcher(CharSequence input): Creates a Matcher object for matching the input text against the compiled pattern.
 
 
 Common Methods in Matcher Class:
    matches(): Attempts to match the entire input sequence against the pattern.
    find(): Attempts to find the next subsequence that matches the pattern.
    group(): Returns the input subsequence that matches the last successful match.
    start(): Returns the start index of the last successful match.
    end(): Returns the end index of the last successful match.
*/


//-------------------------------------------------------------------------------------------------------------


/* 
 Advantages of Regular Expressions:
    Compact and powerful: Regular Expressions allow us to express complex patterns in a concise 
                          and efficient manner.
    Flexibility: They can be used for a wide range of text processing tasks, 
                 from simple validations to complex text manipulations.
    Widely used: Regular Expressions are a standard feature in many programming languages 
                 and text editors, making them widely known and used.

 
 Disadvantages of Regular Expressions:
    Complexity: Regular Expressions can be difficult to read and understand, 
                especially for complex patterns.
    Performance: Some regular expressions can be computationally expensive, 
                 leading to performance issues with large input data.
 
 
 Conclusion:
    Regular Expressions are a powerful tool for text processing and manipulation in Java. 
    They provide a flexible and concise way to work with text patterns, 
    making them an essential skill for Java developers working with strings and text data. 
 With practice, you can become proficient in using Regular Expressions to handle 
     various text-related tasks in Java.
 */



//-------------------------------------------------------------------------------------------------------------
