class exception
{
public static void main(String arg[])
{
 String str=null;
 int a=10,b=0;
 int arr[]=new int[4];
 try
  {
  // System.out.print(str.length());
   System.out.print(a/b);
   int x=arr[4];
  }
 catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("Exception caugh :\n"+e);
  }
  catch(ArithmeticException e)
  {
   System.out.println("Exception caugh :\n"+e);
  }
  catch(NullPointerException e)
  {
   System.out.println("Exception caugh :\n"+e);
  }
 }
}