interface X
{
    void show();
    void config();
}
interface Y
{
    void drive();
}

class A implements X,Y
{
    public void show() 
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void drive()
    {
        System.out.println("In drive");
    }

}




public class Demo {
    public static void main(String args[]) 
    {
        A obj=new A();
        obj.show();
        obj.drive();

    }
}
