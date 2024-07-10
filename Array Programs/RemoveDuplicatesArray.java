/*34)Remove duplicates from unsorted array using Set data structure
Given an unsorted array of integers, print the array after removing the duplicate elements from it. 
We need to print distinct array elements according to their first occurrence.
Examples:
Input: arr[] = { 1, 2, 5, 1, 7, 2, 4, 2}
Output: 1 2 5 7 4
Explanation: {1, 2} appear more than one time.
Input: arr[] = { 3, 3, 4, 1, 1}
Output: 3 4 1
*/
import java.util.*;
public class RemoveDuplicatesArray
{
	public static void main(String x[])
	{
		int a[],i,j,count=0,k=0,length=0;
		a=new int[8];
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		//Input array
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//Display array
		System.out.println("Display Array Elements:\t");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		length=a.length;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(a[i]==a[j])
				{
					for(k=j;k<length-1;k++)
					{
						a[k]=a[k+1];
					}
					length--;
					j--;
				}
			}
		}
		System.out.printf("Display Array After Remove duplicate:");
		for(i=0;i<length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}