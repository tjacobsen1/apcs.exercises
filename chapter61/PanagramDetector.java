import java.io.*;
import java.util.*;

class PanagramDetector {
    public static void main (String[]args) {
        boolean[] data = new boolean [25];
   
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a senetence:"); 
        String results= scan.nextLine();
        int index=0; 
        int flag=1; 

        for (int i = 0; i < results.length(); i++) 
            { if ('a' <= results.charAt(i) &&  
            results.charAt(i) <= 'z') 
                
            index = results.charAt(i) - 'a';}
            data[index]=true; 
            flag=1; 
        
        for( int i=0; i<25; i++){
            if ('a' != results.charAt(i) &&  
            results.charAt(i) != 'z') 
                if(data[i]==false)
                flag=0; 
        }
            System.out.print("String: " + results);

        if (flag == 1) {
            System.out.print("\nThe above string is a panagram.");
        } else {
            System.out.print("\nThe above string is not a panagram.");
        }
    }
}