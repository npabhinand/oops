abstract class Car
{
    abstract void drive();
    public void playMusic()
    {
        System.out.println("play music");
    }
}
class Audi extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class Demo 
{
    public static void main(String args[]) 
    {
        Car obj=new Audi();
        obj.drive();
    }
}
