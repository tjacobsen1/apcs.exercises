public class StringDemo2
{
    public static void main (String[] args)
    {
        String str;
        int len;
        
        str = new String("Elementary, my dear Watson! joe mama  hahaha");

        len = str.length(); // call the length() method of the object

        System.out.println("The length is: " + len);
    }

}