class mobile 
{
    String brand;
    int price;
    static String name;  //static variable

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name+" ");
    }
    public static void show1(mobile obj)  // static method
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
public class phone
    {
        public static void main(String a[])
        {
            mobile obj1=new mobile();
            mobile obj2=new mobile();
            obj1.brand="samsung";
            obj1.price=130000;
            mobile.name="smart phone"; 
            
            obj2.brand="apple";
            obj2.price=140000;
            mobile.name="smart phone"; 
            obj1.show();
            obj2.show();

           mobile.show1(obj1);
        }

    }
