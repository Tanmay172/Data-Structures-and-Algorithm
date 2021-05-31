/*******************
Write a function to reverse a given Douby Linked List
Swap prev and next pointers for all nodes, change prev of the head (or start) and change the head pointer in the end.
*******************/

import java.util.*;
class DoublyLinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
		}
	}
	void addNode(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;
	}
	void reverseDLL()
	{
		Node current = head;
		Node temp =  null;
		while(current != null)
		{
			temp = current.next;
			current.prev = current.next;
			current.next = temp;
			current = current.next;
		}
		if(temp != null)
		{
			head = temp.prev;
		}
	}
	void printList()
	{
		Node last = head;
		while(last != null)
		{
			System.out.print(last.data + " ");
			last = last.next;
		}
		System.out.println();
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		
		DoublyLinkedList DLL = new DoublyLinkedList();
		DLL.addNode(1);
		DLL.addNode(2);
		DLL.addNode(3);
		DLL.addNode(4);
		DLL.addNode(5);
		System.out.println("Created List is:");
		DLL.printList();
		System.out.println("Reversed List is:");
		DLL.reverseDLL();
		DLL.printList();
	}
}