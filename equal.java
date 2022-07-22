import java.util.Scanner;
class equal{
public static void main(String arg[])
{
int a=new Scanner(System.in).nextInt();
int b=new Scanner(System.in).nextInt();
int x=2;
if(x>1)
x=a/b;
switch (x)
{
case 1:
 System.out.println("equal");
 break;
default:
 System.out.println("not equal");
 break;
}}}