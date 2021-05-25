/*******************
Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
Examples: 
Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
Output : 4 5 3 6 2 7 1

Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
Output : 4 5 2 6 1 8 1 8

Approach:
The idea to solve this problem is to first create an auxiliary copy of the original array and sort the copied array. Now total number of even position in array with n elements will be floor(n/2) and remaining is the number of odd positions. Now fill the odd and even positions in the original array using the sorted array in the below manner: 
1) Total odd positions will be n – floor(n/2). Start from (n-floor(n/2))th position in the sorted array and copy the element to 1st position of sorted array. Start traversing the sorted array from this position towards left and keep filling the odd positions in the original array towrds right.
2) Start traversing the sorted array starting from (n-floor(n/2)+1)th position towards right and keep filling the original array starting from 2nd position.
*******************/
import java.util.*;
import java.lang.*;
class ArrayRearrange{
    public static void rearrangeArr(int arr[],int n)
    {
        int evenPos = n / 2;
        int oddPos = n - evenPos;
        int[] tempArr = new int [n];
        for (int i = 0; i < n; i++)
            tempArr[i] = arr[i];
        Arrays.sort(tempArr);
        int j = oddPos - 1;
        for (int i = 0; i < n; i += 2) {
            arr[i] = tempArr[j];
            j--;
        }
        j = oddPos;
        for (int i = 1; i < n; i += 2) {
            arr[i] = tempArr[j];
            j++;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    } 
    public static void main(String argc[]){
        int[] arr = new int []{ 1, 2, 3, 4, 5, 6, 7 };
        int size = 7;
        rearrangeArr(arr, size);        
    }
}