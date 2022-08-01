import java.util.Scanner;

class Matrix
{
	public static void main(String []args)
	{
		int [][]a = new int[10][10];
		int [][]b = new int[10][10];
		int [][]c = new int[10][10];
		int i, j, k, row, col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		row = sc.nextInt();
		System.out.println("Enter number of columns:");
		col = sc.nextInt();
		System.out.println("Enter the elements for array1:");
		for(i = 0; i < row; i++)
		{	
			for(j = 0; j < col; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements for array2:");
		for(i = 0; i < row; i++)
		{	
			for(j = 0; j < col; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array1:");
		for(i = 0; i < row; i++)
		{	
			for(j = 0; j < col; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Array2:");
		for(i = 0; i < row; i++)
		{	
			for(j = 0; j < col; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println("Matrix after multiplication:");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
			{
				c[i][j] = 0; 
				int l = 0;
				for(k = 0; k < row; k++)
				{
					if (l < col)
						c[i][j]+=a[i][l]*b[k][j];
					l++;
				}
				System.out.print(c[i][j]+" "); 
			}
			System.out.println(); 
		}
	}
}
