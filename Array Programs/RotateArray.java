
import java.util.*;
class RotateArray
{
	public static void main(String x[])
	{
		int a[],i;
		int size=5;
		a=new int[size+1];
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter Array Elements:");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int index,temp,j;
		System.out.println("Enter Index:");
		index=sc.nextInt();
		//Rotation Logic 
		for(i=0;i<index;i++)
		{
			 temp=a[0]; // first element of array
             for (j = 0; j<size; j++)
                {
                   a[j]=a[j+1];
                }    
            a[size-1]=temp;//last element of array
		}
		 //Print the rotated array
    System.out.printf("The rotated Array\n");
    for (i = 0; i < size; i++)
    {
        System.out.printf("%d \t",a[i]);
    }
	}
}