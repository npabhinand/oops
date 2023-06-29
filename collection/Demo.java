package collection;
import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String args[])
    {
        Collection<Integer> num=new ArrayList<Integer>();
        num.add(5);
        num.add(6);
        num.add(7);
        for(int n:num)
        {
             System.out.println(n);
        }
       

    }
    
}
