interface A
{
    void show(int i,int j);
}


public class Lamda 
{
    public static void main(String args[]) 
    {
        
    A obj=(int i, int j)->{
        System.out.println("this shows"+ (i+j));

    };

    obj.show(5,6);
    }
}
