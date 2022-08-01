import java.util.Scanner;

class SortArray
{
	public static void main(String[] args)
	{
		int i, j, tmp;
		int []a = new int[10];  
		Scanner sc = new Scanner(System.in);      
		System.out.println("Enter the elements in array:");
		for(i = 0; i < 5; i++)
		{
			a[i] = sc.nextInt();
		}	
		for(i = 0; i < 5; i++)
		{
			for(j = i; j < 5; j++)
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
		for(i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}	
	}
}