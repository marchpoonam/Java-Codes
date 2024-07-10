import java.util.*;
public class EvenOddArray
{
	public static void main(String x[])
	{
		int i,j=0,k=0;
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
				even[j]=a[i];
				j++;
			}
			else
			{
				odd[k]=a[i];
				k++;
			}
		}
		System.out.printf("\nEven Elements in array:");
		for(i=0;i<j;i++)
		{
			System.out.printf("%d\t",even[i]);
		}
		System.out.printf("\nOdd Elememnts in Array:");
		for(i=0;i<k;i++)
		{
			System.out.printf("%d\t",odd[i]);
		}
		
	}
}