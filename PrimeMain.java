class PrimeMain
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		if(n<=1)
		{
			System.out.println(n + " not a prime no or a compoite");
		}
		else
		{
			int temp = 0;
			for(int i = 2; i<n; i++)
			{
				if(n%i == 0)
				{
					temp += 1;
				}
			}
			if(temp>0)
			{
				System.out.println("Not a prime no");
			}
			else
			{
				System.out.println("Prime no");
			}
		}
	}
}