import java.util.Scanner;
class sum
{
  public static void main(String[]args)
 {
  int n,m;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  m=s.nextInt();
  int pri=0;
  for(int i=n;i<m;i++)
  {
    int flag=0;
   for(int j=2;j<=i/2;j++)
    {                   //prime number in given range:
   if(i%j==0)
     flag++;    
}
   if(flag==0)
    pri++;
if(pri==10)
{System.out.println(i);
}
  }
  
 }
} 




/*
 armstrong:
 a=n;
 c=d%10;
 b=b+(c*c*c);
 a=a/10;
-------------------------------
palindrome:
  a=n;
  b=b*10+(a%10);
   a=a/10; 
------------------------------------
 a=109;
 b=a%10;
 while(a>0)  //add first and last:
 c=c*10+b;
 a=a/10;
 d=c%10;
 s.o.p(b+a);

or


   a=109;
   b=a%10;
   while(a>9)
  a=a/10;
  System.out.print(b+a);
-------------------------------
int flag=1;
  for(int i=2;i<n;i++)
  {
     if(n%i==0)
     flag++;            //prime number:
   }
   if(flag==1)
    System.out.print("prime");
   else
    System.out.print("not prime");
-----------------------------------
 for(int i=n;i<m;i++)
  {
    flag=0;
   for(int j=2;j<=i/2;j++)
    {                   //prime number in given range:
   if(i%j==0)
     flag++;    
}
   if(flag==0)
    System.out.println(i);
  }
---------------------------------------------
int n;
int a=0;
int b=1;
int c;
for(i=0;i<n;i++)
{                //fibonacci series:
 s.o.p(a);       //in given range:
c=a+b;
a=b;
b=c;
}
----------------------------------------------
*/














