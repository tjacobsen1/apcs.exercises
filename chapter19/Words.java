import java.util.Scanner;

public class Words
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String word1, word2;
        int dots;

        System.out.println("Enter First word:");
        word1 = scan.nextLine();

        System.out.println("Enter Second word:");
        word2 = scan.nextLine();

        dots = 30 - (word1.length() + word2.length());

        System.out.print(word1);

        while (dots > 0)
        {
            System.out.print(".");
            dots -= 1;
        }
            System.out.print(word2);
    }
}