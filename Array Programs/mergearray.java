import java.util.*;
public class mergearray
{
 public static void main(String x[])
 {
   int first[],second[],third[],i;
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
	
   
 }
}