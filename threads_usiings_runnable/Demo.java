
// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<10;i++)
//     {
//         System.out.println("this is A");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
//     }
    
    
// }
// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<10;i++)
//         {
//             System.out.println("this is B");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Demo 
{
    public static void main(String args[])
    {


        //  Runnable obj1=new A();
        // Runnable obj2=new B();
        // Thread t1=new Thread(obj1);
        // Thread t2=new Thread(obj2);
        // t1.start();
        // t2.start();




        Runnable obj1=()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("this is A");
                try {
                    Thread.sleep(10);
                } 
                catch (InterruptedException e) 
                {
            // TODO Auto-generated catch block
                e.printStackTrace();
                }
            }
        };
        Runnable obj2=()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("this is B");
                try {
                    Thread.sleep(10);
                } 
                catch (InterruptedException e) 
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
       
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }    
}
