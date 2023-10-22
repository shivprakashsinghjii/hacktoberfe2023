public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        long first = 0;
        long second = 1;

        System.out.print("Fibonacci Series (" + n + " numbers): ");

        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.print(first);
            else if (i == 1)
                System.out.print(", " + second);
            else {
                long next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
    }
}
