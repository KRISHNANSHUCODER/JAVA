import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a , b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st no: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd no: ");	
		b = sc.nextInt();
		
		/*c = a;  //using third variable
		a = b;
		b = c;*/

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("1st: " + a);
		System.out.println("2nd: " + b);	
	}
}

/*
a = 2
b = 3

a = 2 + 3 = 5

b = a - b = 5 - 3 = 2
a = a - b = 5 - 2 = 3
*/