import java.util.Scanner;

class InputArray {
    public static void main(String[]args) {
        int[] array;
        int   data;
        Scanner scan = new Scanner( System.in );

        // determine the size and construct the array
        System.out.print( "What length is the array? " );
        int size = scan.nextInt();

        array = new int[ size ]; 

        
        // input the data
        for ( int index=0; index < array.length; index++)
        {
        System.out.print( "enter an integer: " );
        array[ index ] = scan.nextInt();
        }
        
        // write out the data
        for ( int index=0; index < array.length; index++ ) {
        System.out.println( "array[ " + index + " ] = " + array[ index ] );
        }
    }
}