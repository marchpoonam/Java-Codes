import java.util.*;
public class FibbonacciArray
{
	public static void main(String []x)
	{
		int a[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		a[0]=0;
		a[1]=1;
		for(i=2;i<a.length;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("fobbonacci Series:");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}