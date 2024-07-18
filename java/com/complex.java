class num
{
	int real;
	int img;
	num(int n1, int n2)
	{
		real = n1;
		img = n2;
	}
	
}
class complex
{
	static void add(num com1, num com2)
	{
		int r,i;
		r = com1.real + com2.real;
		i = com1.img + com2.img;
		System.out.println(r+"+"+i+"i");
	}
	public static void main(String args[])
	{
		num c1 = new num(1,2);
		num c2 = new num(3,4);
		add(c1,c2);
		
	}
}
