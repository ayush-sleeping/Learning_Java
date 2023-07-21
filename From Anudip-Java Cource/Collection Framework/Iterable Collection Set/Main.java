package Iterable_Collection_Set;

public class Main {
    public static void main(String[] args) {
        LinkedHasSet<Integer> linkedHasSet = new LinkedHasSet<>();
        linkedHasSet.add(1);
        linkedHasSet.add(2);
        linkedHasSet.add(3);
        linkedHasSet.printOrder();  // Output: [1, 2, 3]

        linkedHasSet.remove(2);
        linkedHasSet.add(4);
        linkedHasSet.printOrder();  // Output: [1, 3, 4]
    }
}