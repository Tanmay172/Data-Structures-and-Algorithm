/*******************
Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x. 
Examples: 
Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.

Approach: A tricky approach to solve this problem can be to use the two-pointer technique. But for using two pointer technique, the array must be sorted. Once the array is sorted the two pointers can be taken which mark the beginning and end of the array respectively. If the sum is greater than the sum of those two elements, shift the right pointer to decrease the value of required sum and if the sum is lesser than the required value, shift the left pointer to increase the value of the required sum.
*******************/

import java.util.*;
class arraySumSearching
{
	arraySumSearching(int arr[],int low,int high,int key)
	{
		while(low < high)
			if((arr[low] + arr[high]) == key)
			{
				System.out.println(arr[low] + " and " + arr[high] + " are the required pair");
				break;
			}
			else if((arr[low] + arr[high]) > key)
				high--;
			else
				low++;
	}
}
class MainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n,temp;
		System.out.print("Number of elemets you want to enter :");
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted array :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the sum you want to search :");
		int key = scan.nextInt();
		arraySumSearching s1 = new arraySumSearching(arr,0,n-1,key);
	}
}