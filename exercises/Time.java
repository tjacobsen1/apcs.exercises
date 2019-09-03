import java.util.Scanner;
import java.time.LocalDateTime;
public class Time
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;

        System.out.println("Enter a future time (hh:mm:ss) ");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        seconds = scan.nextInt();

        // LocalDate time = LocalDate.now();

        LocalDateTime.now().getHour();
        LocalDateTime.now().getMinute();
        LocalDateTime.now().getSecond();

        System.out.println("The time between the current time and the times you gave is " + (Hour - hours) + " hours, " + (Minute - minutes) + " minutes, and " + (Second - seconds) + " seconds. ");


    }
}