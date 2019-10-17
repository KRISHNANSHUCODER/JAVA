class Square
{
	public static void main(String args[])
	{
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		double d = Math.pow(m,n);
		int res = (int)d;
		System.out.println(res);
		
	}
}