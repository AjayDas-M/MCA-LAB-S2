class computer
{
	int price = 20000;

	class processor
	{
		int nocores = 8;
		String manuf = "amd";
		
	}
	public static void main(String a[])
	{
		computer c = new computer();
		computer.processor p =c.new processor();
		
		System.out.println(p.nocores);
		
		
	}
}