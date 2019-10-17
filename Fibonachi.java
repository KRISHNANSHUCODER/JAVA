import java.util.Scanner;
class Fibonachi
{
	public static void main(String args[])
	{
		int a = 0, b = 1, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range--> ");
		int n = sc.nextInt();
		System.out.print("the series is: " + a + " " + b);
		for(int i = 0; i<n; i++)
		{
			temp = a+b;
			a = b;
			b = temp;
			System.out.print(" " + temp);
		}	
	}
}