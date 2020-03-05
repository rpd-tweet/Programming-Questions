import java.util.*;
class MazeRunner
{
	long findPathCount(long matrix[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			matrix[i][0]=1;
		}
		for(int i=0;i<n;i++)
		{
			matrix[m-1][i]=1;
		}
		for(int i=m-2;i>-1;i--)
		{
			for (int j=1;j<n;j++)
			{
				matrix[i][j]=(matrix[i+1][j]+matrix[i][j]+matrix[i][j-1])%100000000;
				
			}
		}
		
		return matrix[0][n-1];//%100000000;
	}
					
	
	public static void main(String rpd[])
	{
		MazeRunner mazerunner = new MazeRunner();
		Scanner sc=new Scanner(System.in);
		System.out.println("Rows and Columns :");
		int m=sc.nextInt();
		int n=sc.nextInt();
		long matrix[][]=new long[m][n];
		for(int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				matrix[i][j]=0;
			}
		}
		System.out.println("Path count :"+mazerunner.findPathCount(matrix,m,n));
	}
}
				