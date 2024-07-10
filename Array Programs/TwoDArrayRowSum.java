import java.util.*;
public class TwoDArrayRowSum
{
	public static void main(String x[])
	{
		int a[][],i,j,rowsum;
		a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Display Array elements:");
		for(i=0;i<a.length;i++)
		{ 
	        rowsum=0;
			for(j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
				rowsum=rowsum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("="+rowsum);
		
	}
}