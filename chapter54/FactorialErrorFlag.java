import java.util.Scanner;

public class FactorialErrorFlag {
  public static void main (String[] args) {
    Scanner scan = new Scanner (System.in);

    System.out.println("Please enter a nonnegative number");
    int usrInput = scan.nextInt();

    if (usrInput < 0 || usrInput > 20){
        usrInput = -1; 
    }
    int remainder = usrInput % 2; 
    int remainder2 = 0;
    int dividend = usrInput ;
    String newRep;
    String binaryRep = "";
    System.out.println();
    while ( dividend != 0) {
        remainder = dividend % 2;
        dividend = dividend / 2;

        remainder2 = remainder2 + remainder; 
        
        System.out.println();

        
        newRep = binaryRep + remainder; 
        

        System.out.println( "Remainder          Dividend\n" +remainder + "                  " + dividend);
      }
      System.out.println();

    if (remainder2 % 2 == 1){
      System.out.println("The number you were given is an Odious Number");
    } else if(remainder2 % 2 == 0){ 
      System.out.println("The number you were given is an Evil Number");
    }
    
  }
}