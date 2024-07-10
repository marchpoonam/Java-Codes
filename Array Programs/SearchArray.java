import java.util.*;
class SearchArray
{
	public static void main(String []x)
	{
		int a[],i,search;
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter Array Elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.printf("Array Elements:");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("Enter Value to be Searched:");
		search=sc.nextInt();
		int flag=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		   System.out.println("Element is Found");
	    else
			System.out.println("Element is not Found");
	}
}