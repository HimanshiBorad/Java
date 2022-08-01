// program to sory array elements 
import java.util.Scanner;

class SortArray
{
	public static void main(String[] args)
	{
		int i, j, tmp, size;
		int []a = new int[20];  
		Scanner sc = new Scanner(System.in);      
		System.out.println("Enter the size of array:");
		size = sc.nextInt();
		System.out.println("Enter the elements in array:");
		for(i = 0; i < size+)
		{
			a[i] = sc.nextInt();
		}	
		for(i = 0; i < size; i++)
		{
			for(j = i; j < size; j++)
			{
				if (a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println("The sorted array:");
		for(i = 0; i < size; i++)
		{
			System.out.println(a[i]);
		}	
	}
}
