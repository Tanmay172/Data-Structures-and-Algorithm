/*******************
Write a function that searches a given key ‘x’ in a given singly linked list. The function should return true if x is present in linked list and false otherwise.
For example, if the key to be searched is 15 and linked list is 14->21->11->30->10, then function should return false. If key to be searched is 14, then the function should return true.

Iterative Solution:
2) Initialize a node pointer, current = head.
3) Do following while current is not NULL
    a) current->key is equal to the key being searched return true.
    b) current = current->next
4) Return false

Recursive Solution:
bool search(head, x)
1) If head is NULL, return false.
2) If head's key is same as x, return true;
2) Else return search(head->next, x)
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
	boolean searchNode(int key)
	{
		Node current = head;
		while(current != null)
		{
			if(current.data == key)
			{
				return true;
			}
			else
			{
				current = current.next;
			}
		}
		return false;
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
		int m = 5;
		System.out.println("The key " + n + " is present in the list: " + llist.searchNode(n));
		System.out.println("The key " + m + " is present in the list: " + llist.searchNode(m));
	}
}