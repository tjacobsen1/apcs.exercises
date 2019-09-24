import java.util.Scanner;

public class OddInts {

    public static void main(String[]args) {
        int N, sum, i, j;
        int Nsquared, sumsquared;
        sumsquared =1;
        sum = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me N: ");
        N = scan.nextInt();

        for (i = 1; sum < N; ) {
            i++;
        }
        System.out.println("Final sum of all odd integers from 1 to " + N + ": " + sum);
        
        Nsquared = N * N;

        for (j = 1; sumsquared < Nsquared; ) {
            j++;
        }
        System.out.println("Final sum of " + N + " squared which is " + Nsquared + " is: " + sumsquared);
    }
}