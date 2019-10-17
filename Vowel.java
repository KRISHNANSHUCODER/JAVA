//--------vowel of not-----------//

import java.util.*;

class Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if(s == 'a' || s == 'A' || s == 'e' || s == 'E' || s == 'i' || s == 'I' || s == 'o' ||  s == 'O' || s == 'u' || s == 'U')
		{
			System.out.println("Vowle");
		}
		else
			System.out.println("Not Vowle");
	}
}	