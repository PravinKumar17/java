class addevenarray
{
 public static void main(String arg[])
 {
  int temp;
  int arr[]={3,4,1,7,9};
  int arr1[]=new int[3];
  int arr2[]=new int[2];
  for(int i=0,j=0;i<5;i=i+2,j++)
  {
   arr1[j]=arr[i]; 
  }
  for(int i=1,j=0;i<5;i=i+2,j++)
  {
   arr2[j]=arr[i];
  }
  for(int i=0;i<arr1.length;i++)
  {
   for(int j=i;j<arr1.length;j++)
   {
    if(arr1[i]>arr1[j])
    {
     temp=arr1[i];
     arr1[i]=arr1[j];
     arr1[j]=temp;
System.out.print(arr1[i]);
    }
   }
  }
  for(int i=0;i<arr2.length;i++)
  {
   for(int j=1;j<arr2.length;j++)
   {
    if(arr2[j]>arr2[j])
    {
     temp=arr2[i];
     arr2[i]=arr2[j];
     arr2[j]=temp;
    }
   }
  }
  if(9==arr1[(arr1.length-1)])
  {
  int a=0;
  a=arr1[arr1.length-1]+arr2[arr2.length-1];
 // System.out.print(arr1[1]);
  }
  else
  {
  int a=0;
   a=arr1[arr1.length-1]+arr2[arr2.length-2];
  //System.out.print(arr1[2]);
  }
 }
}