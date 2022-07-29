// program to find whether number is palindrome or not

import java.util.Scanner;

class Palindrome 
{
	public static void main(String []args)
	{
		int number, rev = 0, rem, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		i = number;
		while (number > 0)
		{
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		if (i == rev)
			System.out.println(i+ " is palindrome!!");
		else
			System.out.println(i+ " is not palindrome!!");
	}
}