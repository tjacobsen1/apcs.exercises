import java.io.*;

class TwoLargestElements {
    public static void main (String[]args) {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
        // declare and initialize variables for the two largest
        int max= data[0]; 
        int max2=data[1];  
        
        // compute the two largest
        for ( int index=0; index < data.length; index++)
        {
            if ( data[ index ] > max ) {
            max2=max;   // examine the current element
            max = data[ index ];    // if it is the largest so far, change max
            }

            else if ( data[ index] > max2 ){    // examine the current element
            max2 = data[ index];   }
        }
        
        // write out the two largest
        System.out.println( max );
        System.out.println( max2 );
    }
}