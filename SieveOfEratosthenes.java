public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100; // Change this to the desired upper limit
        boolean[] isPrime = new boolean[n + 1];
        
        // Initialize the boolean array with 'true' values
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // Mark non-prime numbers
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
