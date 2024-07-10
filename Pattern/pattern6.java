public class pattern6
{
    public static void main(String x[])
      {
             int i,j;
			 for(i=1;i<=5;i++)
			 {
			   for(j=1;j<=9;j++)
			   {
			   if(j>=i && j<=10-i)
			   {
			     System.out.print("*");
			   }
			   else
			   {
			      System.out.print(" ");
			   }
			   }
			   System.out.println();
			 }
     }
}