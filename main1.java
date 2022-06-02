import java.util.*;
interface calc
{
	void perimeter(int x,int y);
	void area(int x,int y);
}
class circle implements calc
{
	public void perimeter(int x,int y)
	{
	  System.out.println(2*3.14*x); 
	}
	public void area(int x,int y)
	{
	  System.out.println(3.14*x*x); 
	}
}
class rect implements calc
{
	public void perimeter(int x,int y)
	{
	  System.out.println(2*(x+y)); 
	}
	public void area(int x,int y)
	{
	  System.out.println(x*y); 
	}
}
class main1
{
	public static void main(String args[])
	{
	   int rad,l,b;
	   Scanner s=new Scanner(System.in);
	   rect r=new rect();
	   circle c=new circle();
	   System.out.println("enter r,l,b");
	   rad=s.nextInt();
	   l=s.nextInt();
	   b=s.nextInt();
	   System.out.println("area and perimeter of circle:");
	   c.area(rad,rad);
	   c.perimeter(rad,rad);
	   System.out.println("area and perimeter of rect:");
	   r.area(l,b);
	   r.perimeter(l,b);
	}
}
	

