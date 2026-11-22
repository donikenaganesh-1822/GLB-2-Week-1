public class Fibonacci {
    public int fib(int n) {
        // Base cases: F(0) = 0 and F(1) = 1
        if (n <= 1) {
            return n;
        }

        int first = 0;  // F(0)
        int second = 1; // F(1)

        for (int i = 2; i <= n; i++) {
            int next = first + second; // Add the previous two numbers
            first = second;            // Move first to the previous second
            second = next;             // Update second to the new number
        }

        return second;
    }

    public static void main(String[] args) {
        Fibonacci sol = new Fibonacci();

        int n = 2;
        System.out.println(sol.fib(n));    }
}