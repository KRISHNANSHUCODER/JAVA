//---------find gratest among three numbers----------//

import java.util.*;

class Gratest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();	
		int c = sc.nextInt();
	if(a>b && a>c)
	{
		System.out.println(a + " is grater than " + b + " and " + c);
	}
	else if(b>c && b>a)
	{
		System.out.println(b + " is grater than " + a + " and " + c);
	}
	else
		System.out.println(c + " is grater than " + a + " and " + b);
	}
}