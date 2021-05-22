//A program to rotate an array of n elements by d elements with the help of temp element and shifting elements one by one to left
import java.util.*;
class ArrayRotation
{
	ArrayRotation(int d,int n)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		int temp;
		System.out.println("Enter the elements of arr[] :");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		leftRotate(arr,n,d);
		System.out.println("Elements in array arr[] after any rotation are as follows :");
		printArray(arr,n);
	}
	void leftRotate(int arr[],int n,int d)
	{
		for(int i=0;i<d;i++)
		{
			leftRotateByOne(arr,n);
		}
	}
	void leftRotateByOne(int arr[],int n)
	{
		int temp;
		temp = arr[0];
		for(int i=0;i<n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[n-1]=temp;
	}
	void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
class MainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n,d;
		System.out.println("Enter the size of array and by how much rotation should be done :");
		n=scan.nextInt();
		d=scan.nextInt();
		ArrayRotation r1 = new ArrayRotation(d,n);
	}
}