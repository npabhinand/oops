class Student{
    int roll_no;
    String name;
}

public class Array {
    public static void main(String a[]){
    //     int nums [][]=new int[3][4];
    //     for(int i=0;i<3;i++)
    //     {
    //         for (int j=0;j<4;j++)
    //         {
    //             nums[i][j]=(int)(Math.random()*10);
    //         }
    //     }
    //    for (int n[]:nums)
    //    {
    //         for(int m:n)
    //         {
    //             System.out.print(m+" ");
    //         }
    //         System.out.println();
    //    }


    //   int arr[][]=new int[3][];
    //   arr[0]=new int[3];
    //   arr[1]=new int[6];
    //   arr[2]=new int[4];
    // for(int i=0;i<arr.length;i++)
    // {
    //     for (int j=0;j<arr[i].length;j++)
    //     {
    //         arr[i][j]=(int)(Math.random()*100); //jagged array
    //     }
    // }
    // for (int n[]:arr)
    // {
    //     for(int m:n)
    //     {
    //         System.out.print(m+" ");
    //     }
    //     System.out.println();
    // }

        
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
