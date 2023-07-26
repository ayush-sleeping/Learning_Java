package ThursdayLab_20July;

/* Q)Write a program to add elements to the HashMap given the key as integer and value data type is String? */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyValueHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a KeyValueHashMap to store Integer keys and String values ::
        Map<Integer, String> keyValueHashMap = new HashMap<>();

        // Get the number of elements to add ::
        System.out.print("So how many number of elements you want to add: ");
        int numberOfElements = sc.nextInt();

        
        // Add elements to the KeyValueHashMap ::
        // ----------------------------------------------------------------------------------------
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter key (integer): ");
            int key = sc.nextInt();

            System.out.print("Enter value (string): ");
            String value = sc.next();

            // Add the key-value pair to the KeyValueHashMap ::
            keyValueHashMap.put(key, value);
        }

        
        // Display the elements in the KeyValueHashMap ::
        // -----------------------------------------------------------------------------------------
        System.out.println("\nKeyValueHashMap contents:");
        for (Map.Entry<Integer, String> entry : keyValueHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        // Check if a specific key exists in the KeyValueHashMap ::
        // -----------------------------------------------------------------------------------------
        System.out.print("\nEnter a key to check if it exists: ");
        int keyToCheck = sc.nextInt();
        if (keyValueHashMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists with value: " + keyValueHashMap.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the KeyValueHashMap. Try Remember again ...");
        }

        
        // Remove a specific key-value pair from the KeyValueHashMap ::
        // -----------------------------------------------------------------------------------------
        System.out.print("\nEnter a key to remove: ");
        int keyToRemove = sc.nextInt();
        if (keyValueHashMap.containsKey(keyToRemove)) {
            keyValueHashMap.remove(keyToRemove);
            System.out.println("Key " + keyToRemove + " removed successfully.");
        } else {
            System.out.println("Key " + keyToRemove + " does not exist in the KeyValueHashMap. Can't perform the removal action...");
        }

        
        // Display the updated contents of the KeyValueHashMap ::
        // -----------------------------------------------------------------------------------------
        System.out.println("\nOk I have Updated the KeyValueHashMap contents:");
        for (Map.Entry<Integer, String> entry : keyValueHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        sc.close();
    }
}
