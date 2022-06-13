//find the average of 'n' positive integers, raising a user-defined exception for each negative input


import java.util.Scanner;

class InvalidE extends Exception
{

  public InvalidE (String msg)
  {
    super (msg);
  }

}


class CheckPositive
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

    int sum = 0, n, num, i = 0;
    float avg;

      System.out.println ("Enter how many numbers in list: ");
      n = sc.nextInt ();

    while (i < n)
      {
	System.out.println ("Enter a number: ");
	num = sc.nextInt ();
	try
	{
	  if (num < 0)
	    {
	      throw new InvalidE ("Negative integers not allowed");
	      
	    }
	  else
	    {
	      sum += num;
	      i++;
	    }
	}
	catch (InvalidE ex)
	{
	  ex.printStackTrace ();
	    continue;
	}

      }

    avg = sum / n;
    System.out.println ("The average of numbers is " + avg);





  }

}

