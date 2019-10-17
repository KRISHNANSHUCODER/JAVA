class Hcf
{
	public static void main(String args[])
	{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int hcf = (n1>n2) ? n2:n1;
		while(true)
		{
			if(n1%hcf==0 && n2%hcf==0)
			{
				System.out.println(hcf);
				break;
			}
			hcf--;
		}
	}
}