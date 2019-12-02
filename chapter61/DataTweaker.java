class DataTweaker {
    public static void main (String[]args) {
        double[] val = {13.0, 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9}; 
        double  n=val.length; 
        double sum=0; 
        for (int i = 0; i < n; i++) {
            sum += val[i]; 
        }
        double average= sum/n;

        System.out.println( "Average = " + average );
    }
}