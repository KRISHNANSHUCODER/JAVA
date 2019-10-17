class FiboMain
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b);
		for(int i = 1; i<n-1; i++)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}
}
			