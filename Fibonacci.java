public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long[] fibonaccci = new long[n + 1];
        fibonaccci[0] = 0;
        fibonaccci[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonaccci[i] = fibonaccci[i - 1] + fibonaccci[i - 2];
            System.out.print(fibonaccci[i] + " ");
        }
        System.out.println("The final value is = " + fibonaccci[n]);
    }
}
// It is call Dynamic programing, like memorization
