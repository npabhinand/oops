package comparable;

import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age % 10 > that.age % 10) {
                    return 1;
                } else {
                    return -1;
                }
       
    }

}

public class Demo {

    public static void main(String args[]) {

        // Comparator<Student> com = ( i, j)->i.age > j.age?1:-1;
         

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(17, "abhi"));
        stud.add(new Student(28, "abhinand"));
        stud.add(new Student(19, "arjun"));
        stud.add(new Student(16, "nelwin"));
        Collections.sort(stud);

        for (Student s : stud)
            System.out.println(s);

    }

}
