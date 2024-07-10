//Write a java program to find subarray of given sum
import java.util.*;
public class SubArray
{
  public static void main(String x[])
 {
   int a[],i,j,k,sum=0,sumtemp;
   a=new int[7];
   Scanner sc=new Scanner(System.in);
   System.out.printf("Enter Array Elements:");
   for(i=0;i<a.length;i++)
   {
	   a[i]=sc.nextInt();
   }
   System.out.printf("Display Array:");
   for(i=0;i<a.length;i++)
   {
	   System.out.printf("%d\t",a[i]);
   }
   System.out.println("Enter Sum Value:");
   sumtemp=sc.nextInt();
   for(i=0;i<a.length;i++)
   {
	   sum=a[i];
	   for(j=i+1;j<a.length;j++)
	   {
		   sum=sum+a[j];
		   if(sum==sumtemp)
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