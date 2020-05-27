import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n,i;
   int a[]= new int [10000];
   int max,val;
   int b[]=new int[10000];
   n=sc.nextInt();
   for(i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   b[0]=-1;
   //b[1]=a[0];
   for(i=1;i<n;i++)
   {
      val=a[i];
      max=-1;
      for(int j=0;j<i;j++)
      {
          if(a[j]<val && a[j]>max)
          {
           max=a[j];
         
          }
      }
        if(max==-1)
          {
           max=-1;
          }
         
      b[i]=max;
   }
   for(i=0;i<n;i++)
   {
       System.out.print(b[i]+" ");
   }
   
   

}
}


Shaifa Shala
4:31 PM (35 minutes ago)
---------- Forwarded message --------- From: Jasmine Joyline <joyline237@gmail.com> Date: Wed, 27 May 2020 at 6:08 PM Subject: Given an array arr[] of the posit

Shaifa Shala <shaifashala@gmail.com>
4:31 PM (35 minutes ago)
to ranimd141998@gmail.com




---------- Forwarded message ---------
From: Shaifa Shala <shaifashala@gmail.com>
Date: Wed, 27 May 2020 at 7:01 PM
Subject: Fwd: Given an array arr[] of the positive integers of size N, the task is to find the largest element on the left side of each index which is smaller than the element present at that index. Note: If no such element is found then print -1.
To: habibsana1999@gmail.com <habibsana1999@gmail.com>, nayakpreethi0@gmail.com <nayakpreethi0@gmail.com>, ravalip73@gmail.com <ravalip73@gmail.com>, sdisha741@gmail.com <sdisha741@gmail.com>, vidyakc111@gmail.com <vidyakc111@gmail.com>




---------- Forwarded message ---------
From: Jasmine Joyline <joyline237@gmail.com>
Date: Wed, 27 May 2020 at 6:08 PM
Subject: Given an array arr[] of the positive integers of size N, the task is to find the largest element on the left side of each index which is smaller than the element present at that index. Note: If no such element is found then print -1.
To: <shaifashala@gmail.com>, srilathakkamath25@gmail.com <srilathakkamath25@gmail.com>, <rousha321@gmail.com>, ANUSHA DEVADIGA <anushadevadiga2017@gmail.com>


import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n,i;
   int a[]= new int [10000];
   int max,val;
   int b[]=new int[10000];
   n=sc.nextInt();
   for(i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   b[0]=-1;
   //b[1]=a[0];
   for(i=1;i<n;i++)
   {
      val=a[i];
      max=-1;
      for(int j=0;j<i;j++)
      {
          if(a[j]<val && a[j]>max)
          {
           max=a[j];
         
          }
      }
        if(max==-1)
          {
           max=-1;
          }
         
      b[i]=max;
   }
   for(i=0;i<n;i++)
   {
       System.out.print(b[i]+" ");
   }
   
   

}
}
