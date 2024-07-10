/*27) Write a program in C to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
Expected Output:
The given array is:
2 3 3 5 3 4 1 7 7 7 7
The maximum repeating number is: 7
*/
import java.util.*;
class MaxOccuranceArray
{
public static void main(String x[])
{
	int a[],i,j,temp,maxElement=0;
	int maxCount=0;
	a=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Elements:");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//Sorting LogicalHandler
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
		   if(a[i]>a[j])
		   {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
		}
	}
	System.out.println("Display Sorted Array:");
	for(i=0;i<a.length;i++)
	{
		System.out.printf("%d\t",a[i]);
	}
	//Occurance Logic
	System.out.println();
	int count=1;
	for(i = 0; i< a.length; i++)   //For loop to hold each element
    {
        count = 1;
        for(j = i+1; j < a.length; j++)  //For loop to check for duplicate elements
        {
            if(a[i] == a[j])
            {
                count++; 
				if(count > maxCount)
                {
                    maxCount=count;
					maxElement = a[i];
					//System.out.println("-->"+count);
					//System.out.println("**"+a[i]);
                }
            }
        }
    }
	System.out.printf("\n Maximum Repeating Element : %d",maxElement); 
}
}
