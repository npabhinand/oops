class A
{
    public A()
    {
        super();                            
        System.out.println("this is A"); 
    }
    public A(int n)
    {
        super();
        System.out.println("this is A int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("this is B");
    }
    public B(int n)
    {
       this();                               //using super we can call constructor of super class
        System.out.println("this is B int");
    }
}

public class Eg 
{
    public static void main(String a[])
    {
        B obj=new B(5);
    }
}
