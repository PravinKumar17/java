class Swapp
{
public static void main(String[] arg)
 {
  int x,y,temp;
  x=Integer.parseInt(arg[0]);
  y=Integer.parseInt(arg[1]);
  temp=x;
  x=y;
  y=temp;
  System.out.println(x+" "+y);
 }
}