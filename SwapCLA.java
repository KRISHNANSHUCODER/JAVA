class SwapCLA
{
	public static void main(String args[])
	{
		int a , b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
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