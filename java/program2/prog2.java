import java.util.Scanner;
class product
{
	int pid;
	String pname;
	double price;
	double details()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product id : ");
		pid = sc.nextInt();
		
		System.out.print("Enter Product Name : ");
		pname = sc.nextLine();
		pname = sc.nextLine();
		
		System.out.print("Enter Product Price : ");
		price = sc.nextDouble();

		
		return price;
	
	}
	
	void show()
	{
		System.out.println("Product id = "+pid);
		System.out.println("Product Name = "+pname);
		System.out.println("Product price = "+price);
	}
}
class prog2
{
	public static void main(String args[])
	{
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		
		double price1 = p1.details();
		double price2 = p2.details();
		double price3 = p3.details();
		
		System.out.println("*****************LOWEST PRICE****************");
		if(price1 < price2 && price1 < price3)
		{
			p1.show();
		}
		else if(price2 < price1 && price2 < price3)
		{
			p2.show();
		}
		else if(price3 < price1 && price3 < price2)
		{
			p3.show();
		}
	}
}
