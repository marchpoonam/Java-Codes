/*
19) Write a program in C to find two elements whose sum is closest to zero
Expected Output :
The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
The Pair of elements whose sum is minimum are:
[44, -46]
*/
import java.util.*;
public class SumClosestZeroArray
{
	public static void main(String x[])
	{
		int a[];
		int i,j,m=0,n=0,k=-274045,sum=0;
		a=new int[10];
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
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;i<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum<0)
				{
					if(sum>k)
					{
						k=sum;
						m=a[i];
						n=a[j];
					}
				}
			}
		}
		System.out.println(k);
		}
		}