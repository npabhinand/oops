package comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;



class Student
    {
        int age;
        String name;
        public Student(int age,String name)
        {
            this.name=name;
            this.age=age;
        }
        
       
        public String toString()
        {
            return "Student [age=" + age + ", name=" + name + "]";
        }
        

       
    }

    public class Demo 
{
    
    public static void main(String args[])
    {

        Comparator<Student> com=new Comparator<Student>() {
            public int compare(Student i,Student j)
            {
                if(i.age%10>j.age%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
           
        List<Student> stud=new ArrayList<>(); 
        stud.add(new Student(17, "abhi"));
        stud.add(new Student(28,"abhinand"));
        stud.add(new Student(19,"arjun"));
        stud.add(new Student(16,"nelwin"));
        Collections.sort(stud,com);
        
        for(Student s:stud)
            System.out.println(s);

    }
    
    
}




