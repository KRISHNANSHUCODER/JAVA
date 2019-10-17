//--------with using toBinaryString() method-------------//
class DtoBCLA
{
	public static void main(String args[])
	{
		int d =Integer.parseInt(args[0]);
		System.out.println("Decimal no: " + d);
		String b = Integer.toBinaryString(d);
		System.out.println("Binary no: " + b);
	}
}