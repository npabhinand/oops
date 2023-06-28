enum Status{
    Running,Failed,Pending,Success
}

class Demo{
    public static void main(String args[]) 
    {
        // Status s=Status.Failed;
        // System.out.println(s.ordinal());

        Status s=Status.Failed;
        if(s==Status.Running)
        {
            System.out.println("All good");
        }
        else if(s==Status.Failed)
        {
            System.out.println("Try Again");
        }
        else if(s==Status.Pending)
        {
            System.out.println("Please wait");
        }
        else if(s==Status.Success)
        {
            System.out.println("Done");
        }


    }
}