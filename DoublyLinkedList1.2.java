/*******************
Write a function to delete a given node in a doubly-linked list.
All three mentioned cases can be handled in two steps if the pointer of the node to be deleted and the head pointer is known:
1)If the node to be deleted is the head node then make the next node as head.
2)If a node is deleted, connect the next and previous node of the deleted node.
Algorithm:
->Let the node to be deleted be del.
->If node to be deleted is head node, then change the head pointer to next current head.
	if headnode == del then
      		headnode =  del.nextNode
->Set next of previous to del, if previous to del exists.
	if del.nextNode != none 
      		del.nextNode.previousNode = del.previousNode 
->Set prev of next to del, if next to del exists.
	if del.previousNode != none 
      		del.previousNode.nextNode = del.next
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
			head.prev = new_node;                    //Adding node for the first time head == null and it will raise an excption if we try to execute it without if block
		head = new_node;
	}
	void deleteNode(Node del)
	{
		if(head == del)                                 //If node to be deleted is head then just shift the head pointer to next of del
			head = del.next;
		if(del.next != null)				//If there exists a next node of del then connect the prev of del to next of del
			del.next.prev = del.prev;
		if(del.prev != null)
			del.prev.next = del.next;		//If there exists a prev of del then connect the prev of del to next of del
		return;
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
		System.out.println("Deleting firt node i.e. 5:");
		DLL.deleteNode(DLL.head);
		System.out.println("New List is:");
		DLL.printList();
		System.out.println("Deleting middle node i.e. 3:");
		DLL.deleteNode(DLL.head.next);
		System.out.println("New List is:");
		DLL.printList();
	}
}