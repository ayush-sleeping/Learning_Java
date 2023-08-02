package Collection_Framework;

public class LinkedList_Overview {

	public static void main(String[] args) {
		/*
		 LinkedList, which is another important implementation of the List interface in 
		   the Java Collections Framework. A LinkedList is a doubly-linked list-based data structure, 
		   
		   where each element (node) in the list points to both its previous and next elements.
		 */

//-------------------------------------------------------------------------------------------------------------
				
		
		/* 
		 > Declaration and Initialization :
		 You can create a LinkedList by importing java.util.LinkedList and initializing it using the new keyword. 
		 The syntax for creating a LinkedList is as follows:
		 (
		 import java.util.LinkedList;

         LinkedList<DataType> listName = new LinkedList<>();
		 )
		 Replace DataType with the data type of elements you want to store in the list. 
		 For example, LinkedList<Integer> stores integers, LinkedList<String> stores strings, and so on.
		 */

//-------------------------------------------------------------------------------------------------------------
						
		
		/*
		 Some more important things about ArrayList :
		 
		 > Doubly-Linked List:
		 Unlike ArrayList, which uses an array, LinkedList uses nodes to store elements. 
		 Each node in the LinkedList contains the element value and two references: 
		 one to the previous node and another to the next node. 
		 This linked structure allows for fast insertion and deletion at both ends (front and back) of the list.

		 > Ordered Collection:
		 Similar to ArrayList, LinkedList also maintains the order of elements based on their insertion. 
		 When you iterate through a LinkedList, elements are retrieved in the same order as they were added.

		 > Duplicate Elements:
		 LinkedList allows duplicate elements, just like ArrayList. 
		 You can have multiple occurrences of the same element in the list.

		 > Common Methods:
		 LinkedList provides methods similar to ArrayList, such as 
		 add(E element), 
		 add(int index, 
		 E element), 
		 get(int index), 
		 remove(int index), 
		 size(), isEmpty(), and more. 
		 However, the underlying implementation of these methods is different in LinkedList.

		 > Performance:
		 LinkedList provides fast insertion and deletion at both ends (front and back) of the list, 
		 as well as fast deletion of elements in the middle of the list. 
		 However, accessing elements by index can be slower compared to ArrayList due to 
		 the need to traverse the list from the beginning or end.

         > Iterating through LinkedList:
         You can use various looping mechanisms to iterate through a LinkedList, similar to 
         how you would iterate through an ArrayList.
         
		 > Thread-Safety:
		 Like ArrayList, LinkedList is not synchronized by default. 
		 If you need a thread-safe version of LinkedList, 
		 you can use Collections.synchronizedList(new LinkedList<>()) to create one.

		 > Usage Considerations:
		 Use LinkedList when frequent insertions and deletions at both ends of the list are required.
		 Consider using LinkedList when you have a large number of elements to insert 
		 or delete in the middle of the list, as it provides faster performance than ArrayList in such cases.
		 If you need fast random access by index and less frequent insertions and deletions, 
		 ArrayList is generally a better choice.

//-------------------------------------------------------------------------------------------------------------
		

		 LinkedList is a versatile data structure that can be useful in certain scenarios 
		 where its fast insertion and deletion capabilities are beneficial. 
		 However, as with any data structure, the choice of LinkedList versus ArrayList 
		 should be based on the specific requirements of your application and the types of 
		 operations you need to perform on the list.
		 
		 */

	}

}
