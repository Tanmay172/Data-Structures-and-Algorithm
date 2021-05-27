//Creating a singly linked list and inserting a node at the front, middle and at the end of the list

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
	void insertBeginning(int new_data)
	{
		Node new_node = new Node(new_data);
		{
			new_node.next = head;
			head = new_node;
		}
	}
	void insertMiddle(Node prev_node,int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("Previous node should be there to insert the node in the middle");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	void insertEnd(int new_data)
	{
		Node new_node = new Node(new_data);		
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = new_node;
		return;
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
}
class mainClass
{
	public static void main(String arg[])
	{
		LinkedList llist = new LinkedList();
		//1 ---> null
		llist.insertBeginning(1);
		//2 ---> 1 ---> null
		llist.insertBeginning(2);
		//2 ---> 1 ---> 3
		llist.insertEnd(3);
		//2 ---> 1 ---> 3 ---> 4	
		llist.insertEnd(4);
		/* Insert 5 after 1
			2 ---> 1 ---> 5 ---> 3 --->4
		*/
		llist.insertMiddle(llist.head.next,5);
		llist.printList();
	}
}