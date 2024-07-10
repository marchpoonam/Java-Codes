/*
29) Write a program in C to find a pair with the given difference
Expected Output:
The given array is:
1 15 39 75 92
The given difference is: 53
The pair are: (39, 92)
*/
import java.util.*;
public class MinDiffArrayElement
{
	public static void main(String x[])
	{
		int a[];
		int diff,i,j,distance=0;
		a=new int[5];
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
		System.out.printf("\nThe given difference is:");
		diff=sc.nextInt();
         for(i=0;i<a.length;i++)
             {
                 for(j=i+1;j<a.length;j++)
                    {
		               distance=a[j]-a[i];
			           if(distance==diff)
					     { 
				              System.out.printf("\nThe pair are:Index[%d %d]--->Elements{%d,%d}",i,j,a[i],a[j]);
				               break;
			             }
						
	                 }
                }
				
  }
}