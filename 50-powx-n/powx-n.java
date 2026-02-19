class Solution {
    public double myPow(double x, int n) {
        // Using long to avoid overflow when n is Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1.0;
        }

        // Recursive call: Calculate x^(n/2) once
        double half = fastPow(x, n / 2);

        // If n is even: (x^n/2) * (x^n/2)
        if (n % 2 == 0) {
            return half * half;
        } 
        // If n is odd: (x^n/2) * (x^n/2) * x
        else {
            return half * half * x;
        }
    }
}