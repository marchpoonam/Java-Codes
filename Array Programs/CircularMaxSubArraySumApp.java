
/*Write a program in C to find the maximum circular subarray sum of a given array.
Expected Output :
The given array is : 10 8 -20 5 -3 -5 10 -13 11//34_-41
The maximum circular sum in the above array is: 29*/
public class CircularMaxSubArraySumApp 
{
       public static void main(String[] args) 
	   {
		int[] a = new int[] { 10, 8, -20, 5, -3, -5, 10, -13, 11 };
		int maxSum = -1;
		for (int i = 0; i < a.length; i++) 
		{
			int sum = 0;
			for (int j = i + 1; j < (a.length + i); j++) 
			{
				System.out.println(j);
               sum = sum + a[j % a.length];//
				maxSum = findMaxBetweenTwo(maxSum, sum);
			System.out.println("---->"+maxSum);
			System.out.println("***"+sum);
			}
		}
       System.out.println(maxSum);
	}

	public static int findMaxBetweenTwo(int a, int b) 
	{
		return a >= b ? a : b;
	}
}