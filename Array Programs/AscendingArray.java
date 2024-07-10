import java.util.*;
public class AscendingArray
{
   public static void main(String []x)
   {
	   int a[],i,j,temp;
	   a=new int[5];
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Array Elements:");
	   for(i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   //Ascending logic
	   for(i=0;i<a.length;i++)
	   {
		   for(j=(i+1);j<a.length;j++)
		   {
			   if(a[i]>a[j])
			   {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
	   System.out.println("After Sorting Array Elements:");
	   for(i=0;i<a.length;i++)
	   {
		   System.out.printf("%d \t",a[i]);
	   }
   }
}
