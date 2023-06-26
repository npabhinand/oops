class Calc
{
    public int add(int x,int y)
    {
        return x+y;
    }
}
class AdvCalc extends Calc
{
    public int add(int x,int y)
    {
        return x+y+1;
    }
}


public class Demo 
{
    public static void main(String a[]) 
    {
        AdvCalc obj=new AdvCalc();
        System.out.println(obj.add(4,6));

    }

}
