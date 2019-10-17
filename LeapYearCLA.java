class LeapYearCLA
{
	public static void main(String args[])
	{
		int year = Integer.parseInt(args[0]);
		if((year%4==0 && year%100!=0) || year%4==0)
		{
			System.out.println("The year " + year + " is leap year");
		}
		else
		{
			System.out.println("The year " + year +" is not leap year");
		}
	}
}