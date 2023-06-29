
// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo 
{
    public static void main(String args[]) 
    {
        Set<Integer> nums=new TreeSet<>();   //tree set gives 
        nums.add(5);
        nums.add(6);
        nums.add(6);
        nums.add(2);

        System.out.println(nums);
    }    
}
