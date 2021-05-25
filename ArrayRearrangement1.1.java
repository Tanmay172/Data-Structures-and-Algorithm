/*******************
Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
Examples: 
Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
Approach(Naive Approach):
1) Navigate the numbers from 0 to n-1.
2) Now navigate through array.
3) If (i==a[j]) , then replace the element at i position with a[j] position.
4) If there is any element in which -1 is used instead of the number then it will be replaced automatically.
5) Now, iterate through the array and check if (a[i]!=i) , if it s true then replace a[i] with -1.
*******************/

import java.util.*;
class fixArray
{
	fixArray(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[j] == i)
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					break;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(arr[i] != i)
			{
				arr[i] = -1;
			}
		}
		System.out.println("Array after rearranging : ");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of elements you want to enter :");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		fixArray a1 = new fixArray(arr,n);
	}
}