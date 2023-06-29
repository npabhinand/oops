class EgException extends Exception
{
    public EgException(String string)
    {
        super(string);                          
    }
}

public class Demo 
{
    public static void main(String args[])
    {

        try {
            Class.forName("calc");
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("class not found");
        }



        int i=20,j=0;
        try
        {
            j=18/i;
            if (j==0)
            throw new EgException("don't show zero"); //message
        }
        catch(EgException e)
        {   
            j=18/1;
            System.out.println(e);  
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
         System.out.println(j);

    }    
}
