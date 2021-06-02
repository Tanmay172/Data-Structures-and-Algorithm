/*******************
Write a function to swap the Kth node from the tarting and end ina linked list

Example: 
Input: 1 -> 2 -> 3 -> 4 -> 5, K = 2
Output: 1 -> 4 -> 3 -> 2 -> 5 
Explanation: The 2nd node from 1st is 2 and 
2nd node from last is 4, so swap them.
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
	void swapKthNode(int k)
	{
		int j = 0;
		int temp;
		Node current = head;
		Node last = head;
		while(last != null)
		{
			last = last.next;
		}
		while(j != k)
		{
			current = current.next;
			last = last.prev;
			j++;
		}
		temp = current.data;
		current.data = last.data;
		last.data = temp;
	}
	void printList()
	{
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		DoublyLinkedList List = new DoublyLinkedList();
		List.addNode(1);
		List.addNode(2);
		List.addNode(3);
		List.addNode(4);
		List.addNode(5);
		List.addNode(6);
		System.out.println("Created List:");
		List.printList();
		System.out.println("After swaping Kth node from beginning and end:");
		List.swapKthNode(1);
		List.printList();
	}
}