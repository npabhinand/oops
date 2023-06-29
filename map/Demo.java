package map;
import java.util.HashMap;
import java.util.Map;

public class Demo 
{
    public static void main(String args[])
    {
        Map<String,Integer> students=new HashMap<>();

        students.put("abhi",6);
        students.put("arjun",50);
        students.put("nelwin",25);
        students.put("sachin",47);
        students.put("arjun",65);

        // System.out.println(students.values());
        System.out.println(students.keySet());
        for (String keys:students.keySet())
        {
             System.out.println(keys+" : "+students.get(keys));
        }

       


    }    
}
