/*******************
Given a singly linked list and a position, delete a linked list node at the given position.

Example:  
Input: position = 1, Linked List = 8->2->3->1->7
Output: Linked List =  8->3->1->7
Input: position = 0, Linked List = 8->2->3->1->7
Output: Linked List = 2->3->1->7

Approach:
If the node to be deleted is the root, simply delete it. To delete a middle node, we must have a pointer to the node previous to the node to be deleted. So if positions are not zero, we run a loop position-1 times and get a pointer to the previous node.
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
	void addElement(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	void deleteNode(int position)
	{
		if(head == null)
		{
			System.out.println("As there is no node to delete");
			return;
		}
		Node temp = head;
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		for(int i=0;temp != null && i<(position-1);i++) // To find the previous node of a deleting node
		{
			temp = temp.next;
		}
		//When the loop ends, temp will have the prev node of the deleting node
		if(temp == null || temp.next == null)
			return;
		Node next = temp.next.next; //This next is storing the next node of deleting node
		temp.next = next; // At this point, the previous node will store the next node of the deleted node i.e. the link is broken 
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