import java.util.*;
class MatrixSubDiagonal
{
	public static void main(String args[])
	{
		int ar[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANGE OF THE MATRIX: ");
		int n=sc.nextInt();
		System.out.println("ENTER VALUES IN THE MATRIX: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("YOUR ORIGINAL MATRIX IS: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("SUB-DIAGONALS ARE: ");
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1)
				{
					
					System.out.print(ar[i][j]);
					sum=sum+ar[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("SUN OF SUB-DIAGONALS IS: "+sum);
	}
}