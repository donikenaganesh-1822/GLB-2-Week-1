
class Pow {
    public double myPow(double x, int n) {
        long N = n; // Prevents integer overflow when n = -2147483648
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Pow sol = new Pow();

        System.out.printf("%.5f%n", sol.myPow(2.00000, 10)); // 1024.00000
        System.out.printf("%.5f%n", sol.myPow(2.10000, 3));  // 9.26100
        System.out.printf("%.5f%n", sol.myPow(2.00000, -2)); // 0.25000
    }
}