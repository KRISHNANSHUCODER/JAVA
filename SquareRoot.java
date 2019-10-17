import java.util.Scanner;
class SquareRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no: ");
		int n = sc.nextInt();
		System.out.println("The Square root of " + n + " is: " + Math.sqrt(n));
	}
}	