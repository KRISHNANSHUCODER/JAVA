import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		year = sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("The year " + year + " is leap year");
		}
		else
		{
			System.out.println("The year " + year +" is not leap year");
		}
	}
}