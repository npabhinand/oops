import java.util.*;
class matrixsym
{
  public static void main(String args[])
   {
     int i,j,m,n;
     Scanner in=new Scanner(System.in);
     System.out.println("enter the number of rows in matrix");
     m=in.nextInt();
     System.out.println("enter the number of columns in matrix");
     n=in.nextInt();
      int mat[][]=new int[m][n];
     System.out.println("matrix is:");
     for(i=0;i<m;i++)
          for(j=0;j<n;j++)
             mat[i][j]=in.nextInt();
     int flag=0;
     for(i=0;i<m;i++)
     {
          for(j=0;j<n;j++)
          {
          if(i!=j){
           if(mat[i][j]==mat[j][i])
            {
              flag=1;
            }
            else
            {
            flag=0;
            }
            }
          }
      }
      if(flag==1)
      {
        System.out.println("The matrix is symmetric");
      }
      else
      {
        System.out.println("the given matrix is not symmetric");
      }
  }
}    
 
                
          
              
     
             
          
 
 
