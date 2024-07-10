/*35) Write a program in Java for a 2D array of size 3x3 and print the matrix ?
Test Data :
Input elements in the matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [0],[2] : 3
element - [1],[0] : 4
element - [1],[1] : 5
element - [1],[2] : 6
element - [2],[0] : 7
element - [2],[1] : 8
element - [2],[2] : 9
Expected Output :
The matrix is :
1 2 3
4 5 6
7 8 9
*/
import java.util.*;
public class TwoDArrayDemo
{
	public static void main(String x[])
	{
		int a[][],i,j;
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
	}
}