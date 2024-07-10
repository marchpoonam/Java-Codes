import java.util.*;
public class arraysimple1
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
	System.out.println("Array Elements are:");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}