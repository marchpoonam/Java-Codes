import java.util.*;
public class EvenOddSumArray
{
	public static void main(String x[])
	{
		int i,j=0,k=0;
		int evensum=0,oddsum=0;
		int a[]=new int[5];
		int even[]=new int[5];
		int odd[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.printf("Display Array:");
		for(i=0;i<a.length;i++)
		{
		System.out.printf("%d\t",a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evensum=evensum+a[i];
			}
			else
			{
				oddsum=oddsum+a[i];
			}
		}
		System.out.printf("\nSum of Even Elements is:%d",evensum);
		
		System.out.printf("\nSum of Odd Elements is:%d",oddsum);
		
		
	}
}