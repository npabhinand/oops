import java.util.*;
class multiplication extends Thread
{
public void run()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+"*"+5+"="+(i*5));
	}
}
}

class prime extends Thread
{
int n;
public prime(int n)
{
this.n =n;
}

public void run()
{
	for(int i=1;i<=n;i++)
	{
		int flag=0;
		for (int j = 1; j <= i ; j++) 
		{
			if (i % j == 0)
			{
			flag += 1;
			}
		}
		if(flag<=2)
		{
			System.out.println(i);
		}
	}
}
}

class Thread_class
{
public static void main(String[] args)
{
Thread m = new Thread(new multiplication());
System.out.println("Multiplication Table of 5:");
m.run();
Scanner sc = new Scanner(System.in);

System.out.println("\nEnter the range for prime numbers:");
int r = sc.nextInt();

Thread p = new Thread(new prime(r));
System.out.println("Prime numbers upto "+r);
p.run();
}
}
