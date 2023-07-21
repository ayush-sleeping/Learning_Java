package Iterable_Collection_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSet<E> extends HashSet<E> {
    private LinkedHashSet<E> linkedHashSet;

    public LinkedHasSet() {
        linkedHashSet = new LinkedHashSet<>();
    }

    @Override
    public boolean add(E e) {
        boolean added = linkedHashSet.add(e);
        super.add(e);
        return added;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = linkedHashSet.remove(o);
        super.remove(o);
        return removed;
    }

    // Override other methods from HashSet as needed

    // Additional methods specific to LinkedHasSet

    public void printOrder() {
        System.out.println(linkedHashSet);
    }
}