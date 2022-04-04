import java.util.*;
class matrix
{
  public static void main(String args[])
  {
    int i,j,m,n;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number of rows in matrix");
    m=in.nextInt();
    System.out.println("enter the number of columns in matrix");
    n=in.nextInt();
    int mat1[][]=new int[m][n];
    int mat2[][]=new int[m][n];
    int mat3[][]=new int[m][n];
    System.out.println("enter the first matrix elements");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
           mat1[i][j]=in.nextInt();
       }
    }
    System.out.println("enter the second matrix elements");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
           mat2[i][j]=in.nextInt();
       }
    }
    System.out.println("after addition");
    for(i=0;i<m;i++)
    {
       for(j=0;j<n;j++)
       {
           mat3[i][j]=mat1[i][j]+mat2[i][j];
           System.out.println(" "+ mat3[i][j] + " ");
       }
       System.out.println(" ");
    }
    }
}
    
           
