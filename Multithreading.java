import java.util.*;

class Even implements Runnable{
int s, n;

public Even(int s, int n){
this.s=s;
this.n=n;
}

public void run(){

for(int i=s; i<=n; i++){
if (i%2==0){
System.out.println(""+i);
}
} 

}

}

class Fibonacci implements Runnable{
int n;

	public Fibonacci(int n){
		this.n=n;
	}

	public void run(){
		int a,b,c,i;
		a=c=i=0;
		b=1;


		while(i++<n){
			System.out.println(i+"th" +" Fib no: = "+a);
			c=a+b;
			a=b;
			b=c;
		}

	}
}

class Multithreading{

public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in);

System.out.println("Enter range:");
System.out.println("Starting: ");
int s=sc.nextInt();
System.out.println("End: ");
int n=sc.nextInt();

Thread t1 = new Thread(new Fibonacci(n));
Thread t2 = new Thread(new Even(s,n));

t1.start();
t2.start();

}

}
