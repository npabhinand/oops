package Threads_using_thread_class;
// import javax.sound.sampled.SourceDataLine;

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
    {
        System.out.println("this is A");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    }
    
    
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("this is B");
        }
    }
}

public class Demo 
{
    public static void main(String args[])
    {
        A obj1=new A();
        B obj2=new B();
        // obj2.setPriority(Thread.MAX_PRIORITY);   //setting priority 
        obj1.start();
        obj2.start();

    }    
}
