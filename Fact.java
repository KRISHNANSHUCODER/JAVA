import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your no--> ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of " + n + " is: " + fact);
	}
}