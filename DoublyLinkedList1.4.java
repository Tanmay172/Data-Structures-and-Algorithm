import java.util.*;
class DoublyLinkedList
{
	Node head;
	class Node						//Declaration of node in Doubly Linked List
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	void addNode(int new_data)				//Function to add the nodes in the Doubly Linked List
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
	}

	Node lastNode(Node last)				//We need the last node as it is going to be the pivot element around which the partion will take place
	{
		while(last != null)
			last = last.next;
		return last;
	}

	void quickSort(Node first)				//This function is just going to give call to the main function of quick sort who will further give call to partition()
	{
		Node last = lastNode(first);			//This will give the last node a point to last element which will be pivot and later be stored in high in quicksort()
		quickSortMainFunction(first,last);
	}

	void quickSortMainFunction(Node low,Node high)		//Main funtion of quick sort who will do the further partitioning
	{
		if(high !=null && low != high && low != high.next)
		{
			Node temp = partition(low,high);	/*This will perform the partion() and return the value to temp variable of type node storing the pivot element in the correct 								position*/
			quickSortMainFunction(low,temp.prev);	//This will again call the quick sort function but now it will take the first half i.e. elements on left side of pivot
			quickSortMainFunction(temp.next,high);	//This will again call the quick sort function but now it will take the second half i.e. elements on right side of pivot
		}
	}

	Node partition(Node low,Node high)
	{
		int pivot = high.data;				//This pivot variable of type int will store the data of the last node and is the pivot element around which the partitiion()
		Node i = low.prev;				//Similar to i = low - 1 in array
		for(Node j=low; j!=high; j=j.next)
		{
			if(j.data <= pivot)
			{
				i = (i==null) ? low : i.next;	//Similar to i++ in array
				int temp = i.data;		//now we will swap the values of i and j nodes if the condition satisfies
				i.data = j.data;
				j.data = temp;
			}
		}
		i = (i==null) ? low : i.next;			//Again similar to i++ in array
		int temp = i.data;				//Now we will swap the last pivot element with the i+1 element to place the pivot element to its correct position
		i.data = high.data;
		high.data = temp;
		return i;
	}
	
	void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}

class mainClass
{
	public static void main(String arg[])
	{
		DoublyLinkedList List = new DoublyLinkedList();
		List.addNode(3);
		List.addNode(15);
		List.addNode(9);
		List.addNode(10);
		List.addNode(2);
		List.addNode(12);
		System.out.println("Created Doubly Linked List:");
		List.printList(List.head);
		System.out.println("Sorted Doubly Linked List:");
		List.quickSort(List.head);
		List.printList(List.head);
	}
}