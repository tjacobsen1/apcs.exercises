class ThreeArrays {
    public static void main (String[]args) {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};

        sum[0] = valB[0] + valA[0]; 
        sum[1] = valB[1] + valA[1]; 
        sum[2] = valB[2] + valA[2];
        sum[3] = valB[3] + valA[3];  

        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
    }
}