// program to print fibonacci series

import java.util.Scanner;

class Fibonacci
{	
	public static void main(String []args)	
	{
		int number, a=0, b=1, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i = 1; i <= number; i++)
		{
			c = a + b;
			System.out.print(" " +a);
			a = b;
			b = c;
		}	
	}
}