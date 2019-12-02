class ReverseOrder {
    public static void main (String[]args) {
        int[] val = {4, 5, 6, 7}; 
        int temp;
 
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        temp=val[0];
        val[0]=val[3];
        val[3]=temp;
        
        temp=val[1]; 
        val[1]=val[2]; 
        val[2]=temp;  
        
        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}