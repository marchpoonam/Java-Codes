/*
23) Write a program in C to move all zeroes to the end of a given array.
Expected Output :
The given array is : 2 5 7 0 4 0 7 -5 8 0
The new array is:
2 5 7 8 4 -5 7 0 0 0
*/
import java.util.*;
public class ZeroLastArray
{
	public static void main(String x[])
	{
		int a[],b[];
		int i,j,k=0;
		a=new int[10];
		b=new int[10];
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter"+a.length+"Array Elements:");
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
		//logic of all zero shifted to last
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[k++]=a[i];
			}
		}
		while(k<a.length)
		{
			b[k++]=0;
		}
		System.out.printf("\nAfter all zeros at last");
		for(i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
}