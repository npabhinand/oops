class A
{
    int age;
    public void show()
    {
       System.out.println("in show");
    }
    class B
    {
        public void config() 
        {
            System.out.println("in config") ;   
        }
    }
}
public class Demo 
{
    public static void main(String args[]) 
    {
        A obj=new A()                        
            {
                public void show()                    //anonymous inner class
                {
                    System.out.println("in show Demo");
                } 
            };
        obj.show();
        A.B obj1=obj.new B();
        obj1.config();
       
    }
}
