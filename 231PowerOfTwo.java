public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // Powers of two must be positive numbers
        if (n <= 0) {
            return false;
        }

        // Keep dividing n by 2 as long as it is divisible by 2
        while (n % 2 == 0) {
            n = n / 2;
        }

        // If n reduces all the way down to 1, it is a power of two
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();

        int n = 16; // Example 2
        System.out.println(sol.isPowerOfTwo(n)); // Output: true
    }
}