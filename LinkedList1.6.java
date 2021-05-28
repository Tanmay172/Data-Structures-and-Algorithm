/*******************
Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position.
Example: 
Input:  1->10->30->14,  index = 2
Output: 30  
The node at index 2 is 30

Algorithm: 
1. Initialize count = 0
2. Loop through the link list
     a. if count is equal to the passed index then return current
         node
     b. Increment count
     c. change current to point to next of the current.

Algorithm:
Algorithm
getnth(node,n)
1. Initialize count = 0
2. if count==n
     return node->data
3. else
    return getnth(node->next,n-1)
*******************/

import java.util.*;
class LinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	void addNode(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	int getNthNode(int key)
	{
		Node current = head;
		int count = 0;
		while(current != null)
		{
			if(count == key)
				return current.data;
			count++;
			current =current.next;
		}
		return 0;
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		LinkedList llist = new LinkedList();
		llist.addNode(12);
		llist.addNode(10);
		llist.addNode(8);
		llist.addNode(6);
		llist.addNode(4);
		llist.addNode(2);
		int n = 3;
		System.out.println("The data at position " + n + " : " + llist.getNthNode(n));
	}
}