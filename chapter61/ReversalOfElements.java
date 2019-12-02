import java.io.*;


class ReversalOfElements {
    public static void main(String[]args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        // copy the data in reversed order to result
        for ( int j=0; j < result.length/2; j++)
        {
            int temp= result[j]; 
            result[j]=result[result.length-j-1]; 
            result[result.length-j-1]=temp; 
        }
        
        // write out the result
        //  for ( int j=0; j < result.length; j++)
        //{

        //}

        System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]+" "+data[5]+" "+data[6]+" "+data[7]+" "+data[8]+" "+data[9]+" "+data[10]+" "+data[11]+" "+data[12]+" "+data[13]); 
        System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]+" "+result[4]+" "+result[5]+" "+result[6]+" "+result[7]+" "+result[8]+" "+result[9]+" "+result[10]+" "+result[11]+" "+result[12]+" "+result[13]); 

    }
}