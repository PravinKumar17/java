class squareRoot
{
 public static void main(String arg[])
 {
  int a=36925,sum,b=0,c,i,n=0;
   while(a%10!=0)
    {
     n=n*10+a%10;  //1234
     a=a/10;
    }
   a=n;
   while(a>0)
   {
    b=b*10+(a%10);
    a=a/10;
    if(b>9 && b<100)
     sum=b;
    for(i=1;i<10;i++)
    {
     c=i*i;
     if(b==c)
     {
      System.out.println(b);
     }
     else
     {
     break;
     }
    }
   }
 }
}