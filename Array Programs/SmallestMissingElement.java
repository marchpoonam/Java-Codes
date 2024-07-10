import java.util.*;
class SmallestMissingElement
{
 public static void main(String []args)
 {
  int a[],i,j;
  a=new int[5];
  boolean b=false;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Elements:");
  for(i=0;i<a.length;i++)
  {
	  a[i]=sc.nextInt();
  }
  System.out.println("Display Array Elements:");
  for(i=0;i<a.length;i++)
  {
	  System.out.printf("%d\t",a[i]);
  }
  System.out.printf("\nSmallest Missing Element is:");
  for(i=0;i<a.length-1;i++)
  {
	  for(j=a[i]+1;j<a[i+1];j++)
	  {
		  System.out.printf("%d\t",j);
		  b=true;
		  break;
	  }
	  if(b)
	  {
		  break;
	  }
  }
 }
 }