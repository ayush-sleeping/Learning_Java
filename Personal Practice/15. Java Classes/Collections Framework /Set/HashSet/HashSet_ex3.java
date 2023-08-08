package Collection_Framework;

// In this example, we'll demonstrate how a HashSet can be used for efficient membership testing.
import java.util.HashSet;
import java.util.Set;

public class HashSet_ex3 {
    public static void main(String[] args) {
        // Create a HashSet of employee IDs
        Set<Integer> employeeIds = new HashSet<>();
        employeeIds.add(101);
        employeeIds.add(102);
        employeeIds.add(103);

        // Check if an employee ID is present
        int idToCheck = 102;
        boolean isEmployeePresent = employeeIds.contains(idToCheck);

        System.out.println("Employee with ID " + idToCheck + " is present: " + isEmployeePresent);
    }
}

/*
 In this scenario, 
 we use a HashSet to efficiently store a collection of employee IDs. 
 We can then quickly check whether a given employee ID is present in the HashSet using the contains method. 
 This approach is particularly useful when you have a large collection and need fast membership testing.


 In summary, 
 HashSet is a powerful choice when you need to efficiently manage collections with unique elements, 
 remove duplicates, or perform fast membership testing. 
 It's especially valuable in scenarios where maintaining uniqueness or checking for duplicates is a primary concern.
 */
