/* 
25) Write a program in C to find out the maximum difference between any two elements such that 
larger element appears after the smaller number.
Expected Output :
The given array is : 7 9 5 6 13 2
The elements which provide maximum difference is: 5, 13
The Maximum difference between two elements in the array is: 8
*/  
import java.util.*;
public class MaxDiffArrayElement
{
	public static void main(String x[])
	{
		int a[];
		int diff=0,max=0,element1=0,element2=0,i,j;
		a=new int[7];
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		//Input array
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//Display array
		System.out.println("Diaplay Array Elements:\t");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//Max Logic
  for(i=0;i<a.length;i++)
  {
      for(j=i+1;j<a.length;j++)
       {
             if(a[i]<a[j])   //7<9
             {
                diff=a[j]-a[i]; //2
             }
                if(diff>max)  //2>0
                {
                   max = diff; //2
                   element1=a[i]; 
                   element2=a[j]; 
               }
      }
  }
	System.out.printf("\nThe elements which provide maximum difference is: %d, %d",element1,element2);
	System.out.printf("\nThe Maximum difference between two elements in the array is:%d",max);
	}
	
}