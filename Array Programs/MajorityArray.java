import java.util.*;
class MajorityArray
{
public static void main(String x[])
{
	int a[],i,j,temp;
	a=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Elements:");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//Sorting LogicalHandler
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
		   if(a[i]>a[j])
		   {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
		}
	}
	System.out.println("Display Sorted Array:");
	for(i=0;i<a.length;i++)
	{
		System.out.printf("%d\t",a[i]);
	}
	//Occurance Logic
	System.out.printf("\nOccurance of Every Elements are:");
	System.out.println();
	int majority=a.length/2;
	int count=1,flag=0;
	for(i=0;i<a.length;i++)
	{
		if((i!=a.length-1)&&(a[i]==a[i+1]))
		{
			count++;
		}
		else
		{
		   if(count>majority)
		   {
		     flag=1;
			 System.out.println("mojority Element is:"+a[i]);
			 break;
		   }
		}
	}
}
}
