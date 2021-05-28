/*******************
Write a function to count the number of nodes in a given singly linked list.
For example, the function should return 5 for linked list 1->3->1->2->1.

Iterative Solution:
1) Initialize count as 0 
2) Initialize a node pointer, current = head.
3) Do following while current is not NULL
     a) current = current -> next
     b) count++;
4) Return count
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
	void printList()
	{
		Node tnode = head;
		while(tnode != null)
		{
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	int countNodes()
	{
		int count = 0;
		Node current = head;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		return count;
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
		System.out.println("The number of nodes in a linked list are: " + llist.countNodes());
		System.out.println("Data in a linked list is as follows:");
		llist.printList();
	}
}