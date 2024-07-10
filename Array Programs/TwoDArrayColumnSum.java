import java.util.*;
public class TwoDArrayColumnSum
{
	public static void main(String x[])
	{
		int a[][],i,j;
		a=new int[3][3];
		int csum[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//Display array Elements in matrix form
		System.out.println("Display Array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		//Column elements sum logic
		 int sum=0;
         for(i=0;i<3;i++)
           {
             csum[i]=0;
	         for(j=0;j<3;j++)
		       {	
	 	           csum[i]=csum[i]+a[j][i];
	            } 
	        } 
    System.out.printf("\nAddition of columns:\n");
    for(j=0;j<3;j++)
    {
    	System.out.printf("%d\t",csum[j]);
	}
	System.out.printf("\n");
   }
}