interface Computer
{
    public abstract void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code : compile : run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code : compile : run : faster");
    }
}
class Developer
{
    public void devApp(Laptop lap)
    {
        lap.code();
    }
}


public class Demo {
    public static void main(String args[]) 
    {
        Laptop obj=new Laptop();
        Computer desk=new Desktop();
   

        Developer abhi=new Developer();
        abhi.devApp(desk);

    }
}
