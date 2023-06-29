package enum1;

enum Laptop
{
    Tuff(60000),Legion,Macbook(200000);

    private int price;
    

    private Laptop() {
        this.price=50000;
    }

    private Laptop(int price)
    {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
public class Demo {
    public static void main(String args[])
    {
        // Laptop lap=Laptop.Legion;
        // System.out.println(lap+" : "+lap.getPrice());

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
