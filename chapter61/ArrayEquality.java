import java.util.Arrays;

class ArrayEquality {
    public static boolean myEquals(int a[], int b[]) {
        int n =a.length; 
        int i; 
        for (i = 0; i < n; i++) 
        if (a[i] != b[i]) { 
            return false;
        } else { 
            return true; 
        }
        return true; 
    }

    public static void main (String[]args) {

        int[] arrayA = { 1, 2, 3, 4 };
        int[] arrayB = { 1, 2, 3, 4 };

        System.out.print("Arrays says: ");
        if ( Arrays.equals( arrayB, null ) ) {
            System.out.println( "Equal" );
        } else {
            System.out.println( "NOT Equal" );      
        }
        System.out.print("myEquals says: ");
        if ( Arrays.equals( arrayB, null ) )
            System.out.println( "Equal" );
        else {
            System.out.println( "NOT Equal" );      
        }
    }
}