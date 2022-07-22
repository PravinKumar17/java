class Island
{
 public static void main(String[] args) 
 {
  int i,j,count=0;
  int arr[][]={{1,1,0,0},{0,0,0,0},{0,0,0,0},{1,1,1,1}};
  for (i=0;i<arr.length;i++)
  {
   for(j=0;j<arr.length;j++)
   {
    if(arr[i][j]==1)
    {
     Island.island(arr,i,j);
     count++;
    }
   }
  }
  System.out.print(count);
 }
 static void island(int ar[][],int i,int j)
 {
  if(i<0 || j<0 ||i>=ar.length || j>=ar.length || ar[i][j]!=1)
  return;
  ar[i][j]=2;
  Island.island(ar,i+1,j);
  Island.island(ar,i-1,j);
  Island.island(ar,i,j+1);
  Island.island(ar,i,j-1);
 }
}
