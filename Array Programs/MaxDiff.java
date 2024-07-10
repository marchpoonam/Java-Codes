/* 7 9 5 6 13 2

 7 9 -> 2
 7 13 -> 6
 9  13 -> 4
 5  6  -> 1
 5  13 -> 8 
 6  13 ->7

7 9 5 6 13 2
*/  dis max=0, p,q;
  for(int i=0;i<size;i++)
  {
      for(int j=i+1;j<size;j++)
       {
             if(a[i]<a[j])   //7<9
             {
                dis=a[i]-a[j]; //2
             }
                if(dis>max)  //2>0
                {
                   max = dis; //2
                   p=a[i]; //7
                   q=a[j]; //9
               }
      }
  }