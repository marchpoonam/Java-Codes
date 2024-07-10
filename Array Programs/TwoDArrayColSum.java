import java.util.*;
public class TwoDArrayColSum
{
	public static void main(String x[])
	{
		int a[][],i,j,csum=0;
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
			for(j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		//Column sum logic
		  int sum=0;
          for(i=0;i<3;i++)
           {
             csum=0;
	            for(j=0;j<3;j++)
		          {   	
		            csum=csum+a[j][i];
	              } 
		          System.out.printf("%d\t",csum);     
            } 
            System.out.println();
	}
}