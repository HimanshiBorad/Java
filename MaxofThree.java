import java.util.Scanner;

class MaxofThree
{
	public static void main()
	{
		int a, b, c, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = sc.nextInt;
		b = sc.nextInt;
		c = sc.nextInt;
		max = (a > b) ? ((a > c)?a:c) : ((b > c)?b:c);
	}
}