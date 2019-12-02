import java.util.Scanner;

public class Combinations {
    
    public static int factorial(int num) {
        int answer = 1;
        for (int i = 0; i < num; i++) {
            answer = answer * (i + 1);
        }
        return answer;
    }
    
    
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int N, R = 0;

        System.out.println("Give N: ");
        N = scan.nextInt();
        System.out.println("Give R:");
        R = scan.nextInt();


        if (N > 20 || R > 20) {
            System.out.println("This is a severe restriction. ");
        } else {
            int answer = factorial(N) / (factorial(R) * factorial(N-R));
            System.out.println(answer);
        }
    }
}