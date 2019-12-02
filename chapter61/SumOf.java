import java.io.* ;

class SumOf
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    
    int total= 0; 
    int evensum=0; 
    int oddsum=0; 
    int i=0; 
    // compute the sums
    for ( int index=0; index < data.length; index++) {
        total =  total + data[ index ]  ;

        while(data[i]<=data.length-1){
            if(data[i]%2==0){
            evensum=+data[i]; 
            System.out.println("Even Sum:" + evensum );
            data.length=-1; 
        }
    
        if(data[i]%2==1){
            oddsum=+data[i];
            System.out.println("odd Sum:" + oddsum );
            data.length=-1; 
        }

    }
    }
      
    // write out the three sums
    System.out.println("Total sum:"+ total );
    System.out.println("Even Sum:" + evensum );
    System.out.println("odd Sum:" + oddsum );

  }
}      