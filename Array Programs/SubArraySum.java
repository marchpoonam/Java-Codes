/*20) Write a program in C to find a subarray with given sum from the given array?
Expected Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }
*/
import java.util.*;
public class SubArraySum
{
  public static void main(String x[])
 {
   int []a=new int[]{3,4,-7,1,3,3,1,-4};
   int i,j,k,sum=0;
   int temp=7;
   System.out.printf("The given array is:");
   for(i=0;i<a.length;i++)
   {
	   System.out.printf("%d\t",a[i]);
   }
   System.out.println();
   for(i=0;i<a.length;i++)
   {
	   sum=a[i];
	   for(j=i+1;j<a.length;j++)
	   {
		   sum=sum+a[j];
		   if(sum==temp)
		   {
			   for(k=i;k<=j;k++)
			   {
				   //System.out.printf("%d\t",k);
				   System.out.printf("%d\t",a[k]);
			   }
			   System.out.println();
		   }
	   }
   }
}
}