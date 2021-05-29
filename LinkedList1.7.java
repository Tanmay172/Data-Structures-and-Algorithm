/*******************
Given a Linked List and a number n, write a function that returns the value at the n’th node from the end of the Linked List.
For example, if the input is below list and n = 3, then output is “B”
	A--->B--->--->C--->D
Approach:
1) Get the length of the linked list
2) Then get the position of the node from the beginning
3) Then get the value of node from the beginning
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
	int getNthNodeFromEnd(int position)
	{
		Node current = head;
		int count = 0;
		int temp = 0;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		current = head;
		System.out.println("The position of node we want from the starting: " + (count - position));
		while(current != null)
		{
			if(temp == (count-position))
			{
				return current.data;
			}
			else
			{
				temp++;
				current = current.next;
			}
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
		int n = 4;
		System.out.println("Position of the node we want from the end: " + n);
		int value = llist.getNthNodeFromEnd(n);
		System.out.println("Value of node at " + n + " position from the end: " + value);
	}
}