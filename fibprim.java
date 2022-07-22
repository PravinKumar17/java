class fibprim
{
public static void main(String arg[])
 {
  int a=6,flag=0;
  int a1=-1,b1=1,sum=0;
  for(int i=2;i<a;i++)
  {
   if(a%i==0)
   {
    flag=1;
   }
  }
  if(flag==1)
  {
   for(int i=0;i<a+1;i++)
   {
    sum=a1+b1;
    a1=b1;
    b1=sum;
    if(sum==a)
     {
      flag=2;
     }
   } 
  }
if(flag==1)
  System.out.print(a);
else if(flag==2)
  System.out.print("not");
 }
}