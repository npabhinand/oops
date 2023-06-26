class Student{
    int roll_no;
    String name;
}

public class student {
    public static void main(String a[]){

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.roll_no=1;
        s1.name="Abhinand";
        s2.roll_no=4;
        s2.name="Nelwin";
        s3.roll_no=7;
        s3.name="Sachin";
        Student Students[]=new Student[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;
        for(Student stud:Students)
        {
            System.out.println(stud.name+" : "+stud.roll_no);
        }
    }
    
    
}