import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args)
	{
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		num = sc.nextInt();
		for(int i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num + " is prime!!");

		}
		else
		{
			System.out.println(num + " isn't prime!!");	
		}
	}
}