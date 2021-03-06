import java.util.Scanner;
import java.time.LocalDateTime;
public class TimeExercise
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;

        int currenthour;
        int currentmins;
        int currentsec;

        int hrleft;
        int minleft;
        int secleft;

        System.out.println("Enter the hours in the future: ");
        hours = scan.nextInt();
        System.out.println("Enter the minutes: ");
        minutes = scan.nextInt();
        System.out.println("Enter the seconds: ");
        seconds = scan.nextInt();

        currenthour = LocalDateTime.now().getHour();
        currentmins = LocalDateTime.now().getMinute();
        currentsec = LocalDateTime.now().getSecond();
        
        if (currenthour >= 12) {
           currenthour = currenthour - 12;
        }
        
        hrleft = hours - currenthour;
       
        // System.out.println("Hours left: " + hrleft);
        // System.out.println("Hours: " + hours);
        // System.out.println("Current hour: " + currenthour);
        minleft = minutes - currentmins;
        secleft = seconds - currentsec;
        
        System.out.println("You have " + Math.abs(hrleft) + " hours ");
        System.out.println("You have " + Math.abs(minleft) + " minutes ");
        System.out.println("You have " + Math.abs(secleft) + " seconds ");


        LocalDateTime time = LocalDateTime.now();
        // System.out.println(time);
    }
}