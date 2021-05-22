/*Given an array, cyclically rotate the array clockwise by one. 
Examples: 
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
Following are steps. 
1) Store last element in a variable say x. 
2) Shift all elements one position ahead. 
3) Replace first element of array with x.*/

import java.util.*;
class CyclicRotation
{
	CyclicRotation(int n)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		int x;
		System.out.println("Enter the elements in an array arr[] :");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		x = arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		System.out.println("Just after the shifting to the array, the array will look like :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		arr[0] = x;
		System.out.println("Array after complete cyclic rotation will be as follows :");
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
		System.out.println("Enter the number of elements you want to enter : ");
		int n = scan.nextInt();
		CyclicRotation r1 = new CyclicRotation(n);
	}
}