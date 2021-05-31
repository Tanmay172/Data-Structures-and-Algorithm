//Inserting a node in a Doubly Linked List at various positions

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
			next = null;
			prev = null;
		}
	}

	void addNodeAtFront(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;                     // Storing first node to which the head is pointing in the next of newly created node
		new_node.prev = null;                     // The prev of first node in DLL is always null;
		if(head != null)                          // if (head != null) i.e. when adding a new node there is another node exists
			head.prev = new_node;             // Storing new node in the prev of the former first node
		head = new_node;                          //Pointing head to the new node created
	}

	void addNodeAfterGivenNode(Node prev_node,int new_data)
	{
		if(prev_node == null)                     // if there is no previous node then there is no use of this function
		{
			System.out.println("There is no previous node to perform this function");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.prev = prev_node;                //Previous node will be stores in prev of new node created
		new_node.next = prev_node.next;           //next of previous node will be stored in next of new node created
		prev_node.next = new_node;                //Wel will change the next of previous node to new node
		if(new_node.next != null)                 //If next previous node is not null then new node will be stored in prev of new_node.next 
			new_node.next.prev = new_node;
	}

	void addNodeBeforeGienNode(Node next_node,int new_data)
	{
		if(next_node == null)                     //if there is no next node then there is no use of this function
		{
			System.out.println("Next node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);       
		new_node.next = next_node;                //The next node will be stores in the next of newly created node
		new_node.prev = next_node.prev;           //In previous of new node, the previous of next node will be stores
		next_node.prev =new_node;                 //We will change the prev of next node to new node
		if(next_node.prev != null)                //If previous node if next node is not null and later to be stored in prev of new node, then new node is stored in next prev node
			new_node.prev.next = new_node;
	}

	void addNodeAtEnd(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = null;                     //The next of last node is always null
		if(head == null)
		{
			new_node.prev = null;
			head = new_node;
		}
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	void printList(Node node)
	{
		Node last = null;
		System.out.println("Traversal in forward direction:");
		while(node != null)
		{
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction:");
		while(last != null)
		{
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}
}

class mainClass
{
	public static void main(String arg[])
	{
		DoublyLinkedList DLL = new DoublyLinkedList();
		DLL.addNodeAtFront(1);
		DLL.addNodeAtFront(2);
		DLL.addNodeAtFront(3);
		DLL.addNodeAfterGivenNode(DLL.head.next,4);
		DLL.addNodeBeforeGienNode(DLL.head.next,5);
		DLL.addNodeAtEnd(6);
		System.out.println("The complete list is:");
		DLL.printList(DLL.head);
	}
}