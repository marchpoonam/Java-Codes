import java.util.*;
class InsertArray
{
   public static void main(String []x)
   {
	   int a[],i;
	   a=new int[6];
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Array Elememts:");
	   for(i=0;i<a.length-1;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   System.out.println("Array Elements are:");
	   for(i=0;i<a.length;i++)
	   {
		  System.out.println(a[i]); 
	   }
	   int insertval,index;
	   	   System.out.printf("\nEnter index:");
		   index=sc.nextInt();
	   System.out.printf("\nEnter value to be inserted:");
	  insertval=sc.nextInt();
      for(i=a.length-1;i>=index;i--)
	  {
		  a[i]=a[i-1];
	  }	
    a[index]=insertval;
     System.out.println("After Inserting array elements are:");
 	 for(i=0;i<a.length;i++)
	 {
		 System.out.printf("%d\t",a[i]);
	 }
	   
   }
}