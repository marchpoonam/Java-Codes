/*37) Write a program in Java for subtraction of two Matrices.
Test Data :
Input the size of the square matrix (less than 5): 2
Input elements in the first matrix :
element - [0],[0] : 5
element - [0],[1] : 6
element - [1],[0] : 7
element - [1],[1] : 8
Input elements in the second matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The First matrix is :
5 6
7 8
The Second matrix is :
1 2
3 4
The Subtraction of two matrix is :
4 4
4 4
*/
import java.util.*;
public class TwoDArrayMultiplication
{
	public static void main(String x[])
	{
		int a[][],b[][],c[][],i,j,k,sum=0;
		 a=new int[2][2];
	     b=new int[2][2];
		 c=new int[2][2];
		Scanner sc=new Scanner(System.in);
		//input 1st array
		System.out.println("Enter First Array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//input 2nd array
		System.out.println("Enter Second Array elements:");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		//display 1st array
		System.out.println("Display First Array elements:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		//display 2nd array
		System.out.println("Display Second Array elements:");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.printf("%d\t",b[i][j]);
			}
			System.out.println();
		}
		//multiplication logic
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				sum=0;
				for(k=0;k<c.length;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
			System.out.println();
		}
		//display after addition
		System.out.println("After Addition Matrix array:");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}