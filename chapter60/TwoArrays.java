class TwoArrays {
    public static void main(String[]args) {
        int[] val = {13, -4, 82, 17}; 
        int[] dval;
    
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        dval=new int[val.length];
    
        dval[0]=val[0]*2;
        dval[1]=val[1]*2; 
        dval[2]=val[2]*2; 
        dval[3]=val[3]*2; 

        System.out.println("New Array: " + dval[0] + " " + dval[1] + " " + dval[2] + " " + dval[3]);
    }
}