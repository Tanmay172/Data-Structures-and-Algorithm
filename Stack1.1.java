//Implementation of stack using array

import java.util.*;
class StackUsingArray
{
	final int MaxElements = 1000;		//This variable determine maiximum number of elements entered in the stack
	int top;				//This element will always have the last entered or topmost element in the stack
	int arr[] = new int[MaxElements];
	StackUsingArray()
	{
		top = -1;			//If the new stack is created i.e. stack should be empty and top should be initialized to -1
	}
	void push(int x)
	{
		if(top>=(MaxElements-1))	//Since top points to the last entered element or topmost element and if it is >= MaxElements the we can see that stack is full
		{
			System.out.println("Stack overflow");
		}
		else
		{
			arr[++top] = x;		//If stack is not full then increment top by 1 and store the entered value in it
		}
	}
	int pop()
	{
		if(top<0)			//If top<0 means that stack is empty and there is nothing to pop
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x = arr[top];	//But if top is not less than 0 means stack has elements so we will store the last element in var x
			top--;			//Then we will decremnt top by 1 because we doesn't want the deleted to still be in the Stack
			return x;		//Then we return the deleted element i.e. Stack
		}
	}
	void printStack()
	{
		System.out.println("Elements in the stack are as follows:");
		for(int i=0;i<=top;i++)		//We can see that the actual size of stack is always equal to the value of top whatever the maximum limit of stack is
		{
			System.out.println(arr[i]);
		}
	}
	void isEmpty()
	{
		if(top<0)
		{
			System.out.println("Yes, stack is empty");
		}
		else
		{
			System.out.println("No, stack contains elements");
		}
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		StackUsingArray s1 = new StackUsingArray();
		s1.isEmpty();
		System.out.println("Number of elements you want to push in a stack:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			s1.push(arr[i]);
		}
		s1.printStack();
		s1.isEmpty();
		System.out.println(s1.pop() + " has been deleted");
		s1.printStack();
	}
}