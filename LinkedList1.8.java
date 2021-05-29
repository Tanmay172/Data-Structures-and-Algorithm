/*******************
Given a singly linked list, find the middle of the linked list. For example, if the given linked list is 1->2->3->4->5 then the output should be 3. 
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. For example, if given linked list is 1->2->3->4->5->6 then the output should be 4. 
Approach:
1) First get the length of linked list
2) Then find the position of nodes
	a) If length is even, pos = length/2
	b) If length is odd, pos = (length-1)/2
3) Then as usual get the middle node
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
	int getMiddleNode()
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
		int position = 0;
		if(count % 2 != 0)
			position = ((count-1)/2);//if count = 5 then pos = 3 i.e 3rd element but in linnked list indexing start from 0 so technically index 2 is the 3rd element
		if(count % 2 == 0)
			position = (count/2);//If count = 6 and we ant 2nd element of the middle element then pos = 4 i.e. (6/2) + 1 but 0 is the first index in LL so (6/3) is the required position
		while(current != null)
		{
			if(temp == position)
				return current.data;
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
		System.out.println("The middle node of the linked list is " + llist.getMiddleNode());
	}
}