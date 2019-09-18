import  java.util.Scanner;

public class Power
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    double x, answer=1; 
    int n; 

    System.out.print("Give X: " );
    x = scan.nextDouble();

    System.out.print("Give N: " );
    n = scan.nextInt();

    if ( x >= 0 )
    {
      while ( n > 0 )    
      {
        answer = answer * X;
        n = n - 1; 
      }
      System.out.println( X + " raised to that power is: " + answer );
    }
    else
    {
      System.out.println("N must be a positive integer.");
    }
  }
}