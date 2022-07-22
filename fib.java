class fib
{
 public static void main(String arg[])
 {
  int a=0,b=1,n=5,i;
  System.out.print(a+""+b);
  for(i=0;i<n;i++)
  {
   int cunt=0;
   cunt=a+b;
   a=b;
   b=cunt;
   System.out.print(cunt);
  }
 }
}