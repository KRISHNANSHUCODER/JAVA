//----------BtoD CLA-------------------//
class BinaryToDesimal
{
	public static void main(String args[])
	{
		String b = args[0]; // base 2 as input
		int n = Integer.parseInt(b, 2); // convert base 2 to base 10
		System.out.println(b + " in Desimal: " + n); 
	}
}