class product
{
String pcode,pname;
int price;

	void read(String p,String n,int pi)
	{
		pcode = p;
		pname = n;
		price = pi;
	}
}
class product_details
{
	public static void main(String args[])
	{
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		p1.read("PQR123","pen",10);
		p2.read("ABC456","book",50);
		p3.read("XYZ890","box",100);
		
		if(p1.price < p2.price && p1.price < p3.price)
		{
			System.out.println("The lowest price is: "+p1.price);
		}
		else if (p2.price < p3.price)
	 	{
			System.out.println("The lowest price is: "+p2.price);
		}
		else
		{
			System.out.println("The lowest price is: "+p3.price);
		}
	}
}
