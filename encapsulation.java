class Human1
{
     private String name;
     private int age;
    public String getName() {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }
    

     
}

public class encapsulation 
{
public static void main(String a[])
{
     Human1 obj=new Human1();
     obj.setName("abhinand");
     obj.setAge(14);
     System.out.println(obj.getAge());
     System.out.println(obj.getName()
     );
    
}
   
    
    
}
