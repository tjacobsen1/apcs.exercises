public class Example
{

    public static void main (String[]args)
    {
        int x = 40;
        long hoursWorked = x;
        double payRate = 10.0, taxRate = 0.10;
        System.out.println("Hours Worked:" + hoursWorked);
        System.out.println("pay Amount:" + (hoursWorked * payRate));
        System.out.println("tax Amount:" + (hoursWorked * payRate * taxRate));
    }
    
}