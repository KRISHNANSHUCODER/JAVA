class FibonachiCLA
{
	public static void main(String args[])
	{
		int a = 0, b = 1, temp;
		int n = Integer.parseInt(args[0]);
		System.out.print("the series is: " + a + " " + b);
		for(int i = 0; i<n; i++)
		{
			temp = a+b;
			a = b;
			b = temp;
			System.out.print(" " + temp);
		}	
	}
}