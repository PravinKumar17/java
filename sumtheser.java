class sumtheser
{
 public static void main(String arg[])
{
int a=1234,b,sum=0,i;
for(i=0;a>0;i++)
{
  b=a%10;
  sum=sum+b;
  a=a/10;
}
System.out.println(sum);
}
}