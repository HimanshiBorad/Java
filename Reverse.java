// program to fine reverse of number 

import java.util.Scanner;

class Reverse 
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
		System.out.println("The reverse number of " +i+ " is " +rev+ "!!");
	}
}