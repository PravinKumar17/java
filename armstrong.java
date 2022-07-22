import java.util.Scanner;
class armstrong
{
 public static void main(String arg[])
 {
  int x,a,b,c=0,cnt=0;
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  int temp=a;
  if(a<1000)
  {
  while(a>0)
  {
   b=a%10;
   a=a/10;
   c=c+b*b*b;
  }
  }
  else if(a<10000)
  {
  while(a>0)
  {
   b=a%10;
   a=a/10;
   c=c+b*b*b*b;
  }
  }
 if(c==temp)
 System.out.println(c);
 else
System.out.println("rong");
 }
}