import java.util.Scanner;
class Palin
{
	public static void main(String args[])
	{
		String s = new String();
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter your input--> ");
		s = sc.nextLine();
		String s1 = new String();
		s1 ="";
		for(int i = s.length()-1; i>=0; i--)
		{
			s1 = s1 + s.charAt(i);
		}
		System.out.println("The reverse string is: " + s1);
		if(s1.equals(s)==true)
			System.out.println("PALIN");
		else
			System.out.println("NOT PALIN");
		
	}
}