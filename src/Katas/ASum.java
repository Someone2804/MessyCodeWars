package Katas;

public class ASum {

    public static long findNb(long m) {
        // your code
        long mcheck = 0;
        for (int n = 1; mcheck < m; n++) {
            mcheck += Math.pow(n, 3);
            if (mcheck == m) {
                return n;
            }
        }
        return -1;
    }
}