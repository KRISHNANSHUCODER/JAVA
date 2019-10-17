import java.util.*;
class Coin1
{
	public static void main(String args[])
	{
		int n, five, two, temp, total;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the amount-->");
		n = sc.nextInt();
		five = n/5;
		temp = n % 5;
		//System.out.println("Five--> " + five);
		//System.out.println("temp--> " + temp);
		if(five>1)
		{
			five = 1;
			temp = n - 5;
			
		}
		//System.out.println("Five--> " + five);
		//System.out.println("temp--> " + temp);
		two = temp / 2;
		temp = temp % 2;
		System.out.println("Five--> " + five);
		System.out.println("two--> " + two);
		System.out.println("temp--> " + temp);
		if(two>2)
		{
		
			temp = temp + (2*(two-2));
			two = 2;
		}
		if(temp>2)
		{
			two = 3;
			temp = temp-2;
		}
		total = five + two + temp;
		System.out.println("Total no of coins--> " + total);
		System.out.println("Total no of Five ruppie coins--> " + five);
		System.out.println("Total no of two ruppie coins--> " + two);
		System.out.println("Total no of Five ruppie coins--> " + temp);
	}
}
			