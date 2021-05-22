//A program to rotate an array of n elements by d elements with the help of temp array
import java.util.*;
class ArrayRotation
{
	ArrayRotation(int d,int n)
	{
		int k=0;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[n];
		int temp[] = new int[d];
		System.out.println("Enter the elements of arr[] :");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<d;i++)
		{
			temp[i] = arr[i];
		}
		System.out.println("Elements in array arr[] before any rotation are as follows :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Elements in array temp[] :");
		for(int i=0;i<d;i++)
		{
			System.out.println(temp[i]);
		}
		for(int i=0;i<n-d;i++)
		{
			arr[i] = arr[i+d];
		}
		for(int i=n-d;i<=n-1;i++)
		{
			arr[i] = temp[k];
			++k;	
		}
		System.out.println("Elements in array arr[] after any rotation are as follows :");
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