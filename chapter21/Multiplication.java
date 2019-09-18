import java.util.Scanner;
import java.util.Random; 

public class Multiplication
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    Random random = new Random();
    int answer, runs = 9; 
    int num1 = random.nextInt(10)+1; 
    int num2 = random.nextInt(10)+1; 

    System.out.print( "What is "+num1+"*"+num2+"?" );
    answer = scan.nextInt();
    if (answer == num1 * num2)
    {
        System.out.println("Right!" );
      while (runs > 0)    
      {
        int numb1 = random.nextInt(10)+1; 
        int numb2 = random.nextInt(10)+1; 

        System.out.print( "What is" + numb1 + "*" + numb2 + "?" );
        answer = scan.nextInt();
        runs -= 1; 
        System.out.println("Right!" );
      }
      System.out.println("Right!" );
    }
    if (answer != num1 * num2 || answer != numb1 * numb2){
        System.out.println("Wrong." + num 1 + "*" + num2 + " is " + num1 * num2);
        while (runs > 0)    
        {
            int numbe1 = random.nextInt(10) + 1; 
            int numbe2 = random.nextInt(10) + 1; 
          System.out.print( "What is" + numbe1 + "*" + numbe2 + "?" );
          answer = scan.nextInt();
          runs -=1; 
        }
    }
    else
    {
      System.out.println("You got 7/10 right");
    }
  }
}