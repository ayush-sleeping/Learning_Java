package Collection_Framework;

public class Vector_OverView {

	/*
	 Vector, which is another implementation of the List interface in the Java Collections Framework. 
	 Vector is similar to ArrayList in that it is a dynamic and resizable array-based data structure. 
	 However, Vector is synchronized, making it thread-safe for concurrent access. 
	 */

//-------------------------------------------------------------------------------------------------------------
			
	
	/* 
	 > Declaration and Initialization :
	 You can create a Vector by importing java.util.Vector and initializing it using the new keyword. The syntax for creating a Vector is as follows:
	 (
	 import java.util.Vector;

	 Vector<DataType> vectorName = new Vector<>();

	 )
	Replace DataType with the data type of elements you want to store in the vector. 
	For example, Vector<Integer> stores integers, Vector<String> stores strings, and so on.
	 */

//-------------------------------------------------------------------------------------------------------------
					
	
	/*
	 Some more important things about ArrayList :
	 
	 > Resizable Array:
	 Like ArrayList, Vector is a dynamic and resizable array-based data structure. 
	 It automatically resizes its internal array to accommodate new elements.

	 > Ordered Collection:
	 Vector maintains the order of elements based on their insertion. 
	 When you iterate through a Vector, elements are retrieved in the same order as they were added.
	 
	 > Duplicate Elements:
	Vector allows duplicate elements, just like ArrayList. 
	You can have multiple occurrences of the same element in the vector.

	 > Thread-Safety:
	One of the main differences between Vector and ArrayList is that Vector is synchronized, 
	which means it is thread-safe for concurrent access. 
	Multiple threads can safely access and modify a Vector without causing data corruption or inconsistency.

	 > Common Methods:
	 Vector provides methods similar to ArrayList, such as add(E element), 
	 add(int index, E element), get(int index), remove(int index), size(), isEmpty(), and more. 
	 Since it implements the List interface, it shares these common methods with other list implementations.

    > Performance:
    Due to its synchronized nature, Vector can be slower in single-threaded environments compared to ArrayList. 
    If thread safety is not a concern, ArrayList is generally preferred for better performance.
    
	 > Usage Considerations:
	Use Vector when you need a thread-safe collection and concurrent access from multiple threads 
	is a requirement.
	 If you are working in a single-threaded environment and do not need synchronization, 
	 consider using ArrayList for better performance.



//-------------------------------------------------------------------------------------------------------------
	

	 
	Vector is a legacy class, and with the introduction of ArrayList, 
	it is less commonly used in modern Java code. 
	In most cases, ArrayList is preferred for its better performance in single-threaded scenarios. 
	However, if you specifically require thread safety for concurrent access, Vector can still be a viable option.

	Keep in mind that if you are working in a multi-threaded environment, 
	there are other thread-safe collection options available in the Java Collections Framework, 
	such as Collections.synchronizedList(), which can be applied to any List implementation, including ArrayList.
	 */

}
