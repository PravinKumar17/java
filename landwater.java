class landwater
{
 public int numland(int[][] arr1)
{
 int m=arr1.length;
 int n=arr1[0].length;
 int cnt=0; 
 for(int i=0;i<m;i++)
 {
  for(int j=0;j<m;j++)
  {
   if(arr1[i][j]=='1')
   {
    cnt++;
    merge(arr1,i,j);
   }
  }
 }
return cnt;  
}
public int merge(int[][] arr1,int i,int j)
{
 int m=arr1.length;
 int n=arr1[0].length;
 if(i<0 || i>=m || j<0 || j>=n || arr1[i][j]!='1')
 {
  return arr1;
 }
 arr1[i][j]='2';
 merge(arr1,i-1,j);
 merge(arr1,i+1,j);
 merge(arr1,i,j-1);
 merge(arr1,i,j+1);

}
 public static void main(String arg[])
{
 int n=3,m=3;
 int arr[][]={{1,0,1},{1,1,0},{0,0,1}};
 landwater ch=new landwater();
 System.out.print(numland(arr));
}
}