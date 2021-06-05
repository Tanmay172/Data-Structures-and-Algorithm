//Implementation of stack in Linked List

import java.util.*;
class StackUsingLinkedList
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
	void push(int data)				//In this function, we will push the elements into the stack and this function is similar to addNode() in linked list
	{
		Node new_node = new Node(data);
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			new_node.next = head;
			head = new_node;
		}
		System.out.println(data + " has been pushed on to the stack");
	}
	int pop()
	{
		int popElement;
		if(head == null)			//If head == null i.e. there is no element in the stack then there is nothing to pop
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			popElement = head.data;		//If head != null i.e. stack is not empty then we will store the last element entered in popElement because of LIFO
			head = head.next;		//Then shift the head to next node because we don't want the deleted node to appear in the stack
		}
		return popElement;
	}
	int peek()
	{
		if(head == null)			//If stack is empty then there is no topmost element
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			return head.data;
		}
	}
	void printStack()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n;
		StackUsingLinkedList s1 = new StackUsingLinkedList();
		System.out.println("Enter the number of elements you want to enter in the stack:");
		n = scan.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			int num = scan.nextInt();
			s1.push(num);
		}
		System.out.println("Elements pushed in the stack are as follows:");
		s1.printStack();
		System.out.println("Topmost element in stack before popping is: " + s1.peek());
		System.out.println(s1.pop() + " has been popped out");
		System.out.println("New elements in the stack after popping are as follows:");
		s1.printStack();
		System.out.println("Topmost element in stack after popping is: " + s1.peek());
	}
}