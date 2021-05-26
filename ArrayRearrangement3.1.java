import java.util.*;
class RearrangeArray
{
	RearrangeArray(int arr[],int n)
	{
		int neg = 0;
		int pos = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] < 0)
			{
				neg++;
			}
			else
			{
				pos++;
			}
		}
		int positive[] = new int[pos];
		int negative[] = new int[neg];
		int k = 0;
		int l = 0;
		System.out.println("Number of positive and negative integers in an array are " + pos + " and " + neg + " respectively");
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
			{
				positive[k] = arr[i];
				++k;
			}
			else
			{
				negative[l] = arr[i];
				++l;
			}
		}
		System.out.println("Positive integers in an array are :");
		for(int i=0;i<pos;i++)
		{
			System.out.println(positive[i]);
		}
		System.out.println("Negative integers in an array are :");
		for(int i=0;i<neg;i++)
		{
			System.out.println(negative[i]);
		}
		k = 0;
		l = 0;
		if(pos<neg)
		{
			for(int i=0;i<n-pos;i=(i+2))
			{
				arr[i] = positive[k];
				++k;
			}
			for(int i=1;i<n;i=(i+2))
			{
				arr[i] = negative[l];
				++l;
			}
		}
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
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of elements you want to enter :");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		RearrangeArray r1 = new RearrangeArray(arr,n);
	}
}