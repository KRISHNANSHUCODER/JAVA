import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your no--> ");
		int n = sc.nextInt();
		if(n <=1)
			System.out.println(n + " is not a prime no nor a composite");
		else
		{ 
			for(int i = 2; i<=n-1; i++)
			{
				if(n%i==0)
				{
					temp = temp + 1;
				}
			}
			if(temp>0)
				System.out.println(n + " is not a prime no");
			else
				System.out.println(n + " is prime no");
		}
	}
}