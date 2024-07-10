/*18) Write a program in C to to print next greater elements in a given unsorted array. Elements for 
which no greater element exist, consider next greater element as -1.
Expected Output :
The given array is : 5 3 10 9 6 13
Next Bigger Elements are:
Next bigger element of 5 in the array is: 10
Next bigger element of 3 in the array is: 10
Next bigger element of 10 in the array is: 13
Next bigger element of 9 in the array is: 13
Next bigger element of 6 in the array is: 13
Next bigger element of 13 in the array is: -1
Next Bigger Elements Array:
10 10 13 13 13 -1
*/
import java.util.*;
public class NextBiggestArrayElement
{
	public static void main(String x[])
	{
		int a[];
		int i,j,next=0;
		a=new int[6];
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter"+a.length+"Array Elements:");
		//Input array
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//Display array
		System.out.println("Display Array Elements:\t");
		for(i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//next bigeest find logic
		for(i=0;i<a.length;i++)
		{
			next=-1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					next=a[j];
					break;
				}
			}
			System.out.printf("next biggest element of %d in the array is:%d\n",a[i],next);
			//System.out.printf("Next Elements Are:%d\t",next);
		}
	}
}