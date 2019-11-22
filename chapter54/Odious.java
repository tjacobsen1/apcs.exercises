import java.util.Scanner;

public class Odious {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Input a non-negative number: ");
        num = scan.nextInt();

        String binaryOfNum = "";
        int numToCheck;
        
        for(numToCheck = num; numToCheck != 0; numToCheck = numToCheck / 2) {
            int numToAdd = (numToCheck % 2);
            binaryOfNum = Integer.toString(numToAdd) + binaryOfNum;
        }

        int numOfIs = 0;
        
        for(int i = 0; i < binaryOfNum.length(); i++) {
            if(binaryOfNum.charAt(i) == '1') {
                numOfIs++;
            }
        }
        if (numOfIs % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}