import java.util.*;
public class deletearray
{
  public static void main(String args[])
  { 
    int a[],del,i,j,count=0;
    a=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Elements:");
	for(i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	System.out.println("Length of Array is:"+a.length);
	System.out.println("Enter Elements which you want to delete:");
	del=sc.nextInt();
	for(i=0;i<a.length;i++)
	   { 
         if(a[i]==del)
		 {
			 count++;
			 for(j=i;j<a.length-1;j++)
			 {
				 a[j]=a[j+1];
			 }
		 }
	  }  
	System.out.println("Array After Remove Element:");
    for(i=0;i<a.length-count;i++)
    {
		System.out.printf("%d\t",a[i]);
	}		
	}
}