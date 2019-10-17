import java.util.*;

class Fibo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1; 
		int c;
		System.out.print(a + " " + b);
		for(int i = 1 ; i<n-1; i++)
		{
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(" " + c);
		}
	}
}
		
		
