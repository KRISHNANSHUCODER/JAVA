class PalinCLA
{
	public static void main(String args[])
	{
		String s = new String();
		s = args[0];
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