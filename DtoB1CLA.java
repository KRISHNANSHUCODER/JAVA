class DtoB1CLA
{
	public static void main(String args[])
	{
		int n;
		String b = "";
		String binary = ""; 
		int decimal = Integer.parseInt(args[0]);
		System.out.println("Decimal no: " + decimal);
		while(decimal>0)
		{
			n = decimal % 2;
			b = b + n;	
			decimal = decimal/2;
		}
		for(int i = b.length()-1; i>=0; i--)
		{
			binary = binary + b.charAt(i);
		}
			
		System.out.println("Binary no: " + binary);	
	}
}