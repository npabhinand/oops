class perimeter
{
	int length,breadth;

	perimeter()
	{
		length = 10;
		breadth = 20;
	}

	perimeter(int x, int y)
	{
		length = x;
		breadth = y;
	}
	void cal_perimeter()
	{
		int peri;
		peri = 2 * (length + breadth);
		System.out.println("\nThe perimeter of the rectangle is: "+peri);
	}
}

class RectPerimeter
{
	public static void main(String args[])
	{
		perimeter p1 = new perimeter();
		perimeter p2 = new perimeter(5,10);
		p1.cal_perimeter();
		p2.cal_perimeter();
	}
}
