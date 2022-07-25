import java.util.Scanner;

class IsPrime
{
	public static void main(String []args)
	{
		int number, i, j, flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		System.out.println("The prime numbers upto " +number+ " are:");
		for(i = 1; i <= number; i++)
		{	
			flag = 0;
			for(j = 1; j <= i; j++)
			{
				if (i % j == 0)	
					flag++;
			}
			if (flag == 2)
				System.out.println(i);
		}
	}		
}