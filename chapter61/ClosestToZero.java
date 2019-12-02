class ClosestToZero {
    public static void main (String[]args) {
        int[] data = {3, -1, 5, 7, 4, 12, -3, 8, -2};
     
        // declare and initialize variables
        int curr = 0;    
        int near = data[0];
        // find the element nearest to zero
        for ( int i=0; i < data.length; i++  )
        {
            curr = data[i] * data[i];     
            if ( curr <= (near * near) )
            {     
                near = data[i]; 
            }     
        }
        
        // write out the element nearest to zero
        System.out.println( near);
    }
}