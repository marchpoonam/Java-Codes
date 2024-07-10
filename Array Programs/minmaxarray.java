import java.util.*;
public class minmaxarray
{ 
public static void main (String x[])
{
	int a[],i;//Declaration or reference variable of 
	a=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.printf("Enter Array Elememts:");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	for(i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Maximum Element in array is:"+max);
	int min=a[0];
	for(i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Maximum Element in array is:"+min);
}
}
	