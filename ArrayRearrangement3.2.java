import java.util.*;
class RearrangeArray
{
	int k=-1;
	int temp=0;
	RearrangeArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				k++;
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
		}
		int pos = k + 1;
		int neg = 0;
		while(pos<neg && neg<pos && arr[neg]<0)
		{
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg+=2;
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