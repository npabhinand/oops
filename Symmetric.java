import java.util.Scanner;
class Symmetric
{
public static void main(String args[])
	{
		int n,i,j,flag=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of row and column of the square matrix:");
		n = in.nextInt(); 
		int mat[][] = new int[n][n];
		int trans[][] = new int[n][n];
		System.out.println("Enter the matrix elements:");
		for (i=0 ; i<n ; i++)
			for (j=0; j<n; j++)
				mat[i][j] = in.nextInt();
		for(i=0;i<n;i++)
			{for (j=0; j<n; j++)
				{
				trans[i][j] = mat[j][i];
				System.out.print(" "+ trans[i][j]+ " ");
				}
			System.out.println();
			}
		for(i=0;i<n;i++)
			{
				for (j=0; j<n; j++)
				{
				if(trans[i][j] != mat[i][j])
				 	flag = 1;
					 break;
				}
			}
		if(flag==1)
			System.out.println("Matrix is not Symmetric");
		else
			System.out.println("Matrix is Symmetric");
	}
}

