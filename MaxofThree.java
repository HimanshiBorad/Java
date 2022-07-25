// Program to give maximum out of three numbers using conditional opreator
import java.util.Scanner;

class MaxofThree
{
	public static void main(String[] args)
	{
		int a, b, c, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		max = (a > b) ? ((a > c)?a:c) : ((b > c)?b:c);
		System.out.println("Maximum of three numbers is " +max);
	}
}
