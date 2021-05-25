/*******************
Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
Examples: 
Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
Output : 4 5 2 6 1 8 1 8

In thisprogra, I have sorted the array in ascending order and if the length of array is odd then number of even and odd positions will be (n-1)/2 and (n+1)/2 else it will be n/2. Then we will make two arrays even and odd and store largest e number of values in even array and smallest o number of values in odd array and then we will place the even array in even places of original array in ascending arder and odd array in odd places of original array in descending order
o ---> number of odd ositions
e ---> number of even positions
*******************/
import java.util.*;
class RearrangeArray
{
	RearrangeArray(int arr[],int n)
	{
		int temp,e,o;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		if(n%2 == 0)
		{
			e = o = n/2;
		}
		else
		{
			o = (n+1)/2;
			e = (n-1)/2;
		}
		int even[] = new int[e];
		int odd[] = new int[o];
		int k=0;
		if(n%2 != 0)
		{
			for(int i=(n-e);i<n;i++)
			{
				even[k] = arr[i];
				++k;
			}
			for(int i=0;i<=(n-o);i++)
			{
				odd[i] = arr[i];
			}
		}
		else
		{
			for(int i=(n/2);i<n;i++)
			{
				even[k] = arr[i];
				++k;
			}
			for(int i=0;i<(n/2);i++)
			{
				odd[i] = arr[i];
			}
		}
		System.out.println("Elements in even and odd array are as follows :");
		for(int i=0;i<e;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println();
		for(int i=0;i<o;i++)
		{
			System.out.println(odd[i]);
		}
		k=0;
		for(int i=1;i<n-1;i=i+2)
		{
			arr[i] = even[k];
			++k;
		}
		k=o-1;
		for(int i=0;i<n;i=i+2)
		{
			arr[i] = odd[k];
			--k;
		}
		System.out.println("Rearranged array :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		RearrangeArray r1 = new RearrangeArray(arr,n);
	}
}