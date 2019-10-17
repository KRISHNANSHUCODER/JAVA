import java.util.Scanner;

class RevInt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		String rev = "";
		int l = s.length();
		s = sc.nextLine();
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev); // no in string 
		int num = Integer.parseInt(rev); // no in integer
		System.out.println(num);	
	}
}