import java.util.Scanner;
class boss
{
public static void main(String arg[])
{
 int flag=0;
 String str="good";
 String str1="Hey! How are you?";
 String str2="I am good, how about you?";
 String str3="I am good too.";
 for(int i=0;i<str1.length();i++)
 if(str1.charAt(i)==str.charAt(0))
  {
   int a=i;
   for(int j=0;j<str.length();j++)
   if(str1.charAt(a)==str.charAt(j))
   {
    flag++;
   }
   a++;
   if(flag>1)
   {
    System.out.println(str1);
    flag=0;
    break;
   }
  }
  for(int i=0;i<str2.length();i++)
  if(str2.charAt(i)==str.charAt(0))
  {
   int a=i;
   for(int j=0;j<str.length();j++)
   if(str2.charAt(a)==str.charAt(j))
   {
    flag++;
   }
   a++;
   if(flag>1)
   {
    System.out.println(str2);
    flag=0;
    break;
   }
  }
  for(int i=0;i<str3.length();i++)
  if(str3.charAt(i)==str.charAt(0))
  {
   int a=i;
   for(int j=0;j<str.length();j++)
   if(str3.charAt(a)==str.charAt(j))
  {
   flag++;
  }
  a++;
  if(flag>1)
  { 
   System.out.println(str3);
   flag=0;
   break;
  }
 } 
}
}