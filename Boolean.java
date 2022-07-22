class Boolean
{
static boolean z;
public static void main(String[] arg)
 {
  int x,y;
  x=Integer.parseInt(arg[0]);
  y=Integer.parseInt(arg[1]);
  if (x++>10&&++y<8)
   z=true;
  System.out.println(x+" "+y+" "+z);
 }
}