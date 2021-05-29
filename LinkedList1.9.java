/*******************
Given a singly linked list and a key, count the number of occurrences of the given key in the linked list. For example, if the given linked list is 1->2->1->2->1->3->1 and the given key is 1, then the output should be 4.

Approach:
1. Initialize count as zero.
2. Loop through each element of linked list:
     a) If element data is equal to the passed number then
        increment the count.
3. Return count.
*******************/

import java.util.*;
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
class LinkedList
{
	Node head;
	void addNode(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	int numberOftimes(int key)
	{
		Node current = head;
		int count = 0;
		while(current != null)
		{
			if(current.data == key)
			{
				count++;
				current = current.next;
			}
			else
			{
				current = current.next;
			}
		}
		return count;
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		
		LinkedList llist = new LinkedList();
		llist.addNode(1);
		llist.addNode(2);
		llist.addNode(1);
		llist.addNode(2);
		llist.addNode(1);
		llist.addNode(3);
		llist.addNode(1);
		System.out.println("The number of times 1 appeared in linked list is " + llist.numberOftimes(1));
	}
}