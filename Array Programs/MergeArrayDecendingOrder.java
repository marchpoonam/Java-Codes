/*8) . Write a program in C to merge two arrays of same size sorted in decending order.
Test Data :
Input the number of elements to be stored in the first array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Input the number of elements to be stored in the second array :3
Input 3 elements in the array :
element - 0 : 1
element - 1 : 2
element - 2 : 3
Expected Output :
The merged array in decending order is :
3 3 2 2 1 1
*/
import java.util.*;
public class MergeArrayDecendingOrder
{
 public static void main(String x[])
 {
   int first[],second[],third[],i,temp,j;
   first=new int[5];
   second=new int[5];
   Scanner sc=new Scanner(System.in);
   System.out.println("Length of First Array:"+first.length);
   System.out.println("Length of Second Array:"+second.length);
   third=new int[first.length+second.length];
   int index=0;
   System.out.println("Enter First Array Elements:");
   for(i=0;i<first.length;i++)
	{
		first[i]=sc.nextInt();
	}
	   System.out.println("Enter Second Array Elements:");
	for(i=0;i<second.length;i++)
	{
		second[i]=sc.nextInt();
	}
	//copy First array elements in third array
   for(i=0;i<first.length;i++)
   {
	   third[index]=first[i];
	   index++;
	}
	//copy Second array elements in third array
	for(i=0;i<second.length;i++)
   {
	   third[index]=second[i];
	   index++;
	}
	System.out.println("Merged Array:");
	for(i=0;i<first.length+second.length;i++)
   {
	   System.out.println(third[i]);
   }
   //Decending Order Logic
   for(i=0;i<third.length;i++)
   {
	   for(j=i+1;j<third.length;j++)
	   {
		   if(third[i]<third[j])
		   {
			   temp=third[i];
			   third[i]=third[j];
			   third[j]=temp;
		   }
	   }
   }
   System.out.println("The merged array in decending order is :\t");
   for(i=0;i<first.length+second.length;i++)
   {
	System.out.printf("%d\t",third[i]);
   }
   
 }
}