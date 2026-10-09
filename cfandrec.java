public class cfandrec {
    public static void main(String[] args) {
       // System.out.println(sumOfSquares(7, 12));
        int terms = 25;
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int square(int n) {
        return (n * n);
    }   

    static int sumOfSquares(int a, int b) {
        return square(a) + square (b) ;
    }

    static int fib(int n) {
        if (n == 0) return 0;   // base case 1
        if (n == 1) return 1;   // base case 2
        return fib(n - 1) + fib(n - 2);
    }
}