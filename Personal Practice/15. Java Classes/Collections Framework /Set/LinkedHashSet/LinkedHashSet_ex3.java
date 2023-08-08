package Collection_Framework;

// In this example, we'll use a LinkedHashSet to implement an LRU (Least Recently Used) cache.
// LRU Cache with LinkedHashSet ::

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ex3 {
	 public static void main(String[] args) {
	        int capacity = 3; // Capacity of the cache
	        Set<Integer> cache = new LinkedHashSet<>(capacity, 0.75f);

	        // Adding elements to the cache
	        cache.add(10);
	        cache.add(20);
	        cache.add(30);

	        // Accessing element 10 (promotes it to the end)
	        cache.contains(10);

	        // Adding a new element, causing eviction
	        cache.add(40);

	        // Printing the contents of the cache (in order of access)
	        System.out.println("LRU Cache: " + cache);
	    }
	}

/* In this scenario, 
 * we use a LinkedHashSet to implement an LRU cache. 
 * By setting the access-order mode to true during initialization, 
      the LinkedHashSet keeps track of the access order. When an element is accessed or added, 
      it's promoted to the end, allowing us to implement an LRU cache where the least recently 
      used elements are evicted when the capacity is exceeded. */




