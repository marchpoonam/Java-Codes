import java.util.*;
public class FloorCeil
{
   public static void main(String []x)
   {
	   int a[],i,j,temp,number,floor=0,ceil=0;
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
	   System.out.println("Enter Number:");
	   number=sc.nextInt();
	   //Ceil and floor logic
	   for(i=0;i<a.length;i++)
	   {
		   if(a[0]>number)
		   {
			   floor=-1;
			   ceil=a[0];
		   }
		   else if(a[a.length-1]<number)
		   {
			   floor=a[a.length-1];
			   ceil=-1;
		   }
		   else if(a[i]<number && a[i+1]>number)
		   {
			   floor=a[i];
			   ceil=a[i+1];
		   }
		   else if(a[i]==number)
		   {
			   floor=a[i];
			   ceil=a[i];
		   }
	   }
	   System.out.println("Ceil="+ceil+"\t"+"floor="+floor);
   }
}
