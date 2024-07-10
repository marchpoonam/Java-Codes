import java.util.*;
class SumArray
 {
   public static void main(String args[])
   { 
       int a[],i;
	   a=new int[5];
	   Scanner sc=new Scanner(System.in);
	   System.out.printf("Enter Array Elements:");
	   for(i=0;i<a.length;i++)
	   { 
	      a[i]=sc.nextInt();
	   }
	   
	   int sum=0;
	   System.out.println("Array Elements are:");
	   for(i=0;i<a.length;i++)
	   {
		   sum=sum+a[i];
		   System.out.printf("%d\t",a[i]);
	   }
	   System.out.printf("\nSum of all elements in array is:%d",sum);
   }
 }
