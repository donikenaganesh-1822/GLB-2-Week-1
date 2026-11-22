//ClimbingStairs
public class ClimbingStairs {
    public int climbStairs(int n) {
        // Base cases: 1 step has 1 way, 2 steps have 2 ways
        if (n <= 2) {
            return n;
        }

        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int next = first + second; // Add ways from the previous two steps
            first = second;            // Move first to previous second
            second = next;             // Update second to current step
        }

        return second;
    }

    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();

        int n = 3; // Example 2
        System.out.println(sol.climbStairs(n)); // Output: 3
    }
}