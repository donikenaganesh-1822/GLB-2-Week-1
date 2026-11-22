//NumberOfOneBit
public class NumberOfOneBit {
    public int hammingWeight(int n) {
        int count = 0;

        // Check each binary digit of n by repeatedly dividing by 2
        while (n > 0) {
            if (n % 2 == 1) {
                count++; // Found a '1' bit
            }
            n = n / 2;   // Move to the next bit
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfOneBit sol = new NumberOfOneBit();

        int n = 11; // Example 1
        System.out.println(sol.hammingWeight(n)); // Output: 3
    }
}