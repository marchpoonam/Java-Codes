import java.util.*;
class ReverseArray
{
	public static void main(String []args)
	{
		int a[],i,temp;
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Reverse Display Array Elements:");
         for(i=0;i<a.length;i++)
          {
	          System.out.printf("%d\t",a[i]);
         }
		 //Reverse Logic
		 for(i=0;i<a.length;i++)
		 {
			 if(i<a.length)
			 {
				 temp=a[i];
				 a[i]=a[a.length-1];
				 a[a.length-1]=temp;
				 a.length--;
			 }
		 }
		 System.out.println("After Reverse Display Array Elements:");
         for(i=0;i<a.length;i++)
          {
	          System.out.printf("%d\t",a[i]);
         }
	}
}