package Collection_Framework;

// In this example, we'll use a HashSet to efficiently check if a collection contains duplicate elements.
import java.util.HashSet;
import java.util.Set;

public class HashSet_ex2 {
    public static void main(String[] args) {
        // Create a collection with potential duplicate elements
        String[] words = {"apple", "banana", "orange", "apple", "grape"};

        // Using HashSet to check for duplicates
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        // Printing duplicate words
        System.out.println("Duplicate Words: " + duplicateWords);
    }
}
/*
  In this scenario, 
  we want to check a collection for duplicate elements. 
  Using a HashSet, we can efficiently identify and collect the duplicate elements. 
  We maintain two HashSet instances: one to store unique words (uniqueWords) 
  and another to store duplicate words (duplicateWords). 
  
  As we iterate through the array of words, we add each word to the uniqueWords set. 
  If the add operation returns false, it means the word is a duplicate, and we add it to the duplicateWords set. 
  */
 
