import java.util.*;
class OccuranceArraySingle
{
public static void main(String x[])
{
	int a[],i,num;
	a=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Elements:");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.printf("\n Enter Number :");
	num=sc.nextInt();
	//Check given number occurance
	int count=0;
	for(i=0;i<a.length-1;i++)
	{
	  if(a[i]==num)
	  {
	    count++;
	  }
	}
	 System.out.println(num+"--------"+count+"times");
	  
}
}
	  