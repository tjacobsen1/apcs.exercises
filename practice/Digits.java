public class Digits {
    private int[] digitList;

    // Part A
    public Digits(int num) {
        int next = num / 10;
        int length = 1;
        while(next > 0) {
            length++
            next = next / 10;
        }

        digitList = new int[length];
        next = num;

        int i = 0;
        while( i < length) {
            digitList[length - i - 1] = next % 10;
            next = next / 10;
            i++;
        }
        System.out.println("Setting up my new computer");
    }

    // Part B
    public boolean isStrictlyIncreasing() {
        
        for (int i=0; i < digitList.length 0 1; i++) {
            if (digitList[i] > digitList[i + 1]) {
                return false;
            }
        }
    return true;
    }

    
}