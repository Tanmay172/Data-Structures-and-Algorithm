//Deleting a node from the inked list using iterative method

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
	void addElement(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void deleteNode(int key)
	{
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp ==null)
		{
			System.out.println("There is nothing to delete");
			return;
		}
		prev.next = temp.next;
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
		llist.addElement(1);
		llist.addElement(2);
		llist.addElement(3);
		llist.addElement(4);
		llist.addElement(5);
		llist.printList();
		llist.deleteNode(3);
		llist.printList();
	}
}