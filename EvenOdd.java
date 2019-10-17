import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your value--> ");
		int n = sc.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("The no is EVEN");	
		}
		else
			System.out.println("The no is ODD");
	}
}