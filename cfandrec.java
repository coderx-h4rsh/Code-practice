public class cfandrec {
    public static void main(String[] args) {
       // System.out.println(sumOfSquares(7, 12));
       /* int terms = 25;
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }*/

        printPrimrUpTo(30);
    }
    static int square(int n) {
        return (n * n);
    }   

    static int sumOfSquares(int a, int b) {
        return square(a) + square (b) ;
    }

        // Fibonacci Series
    static int fib(int n) {
        if (n == 0) return 0;   // base case 1
        if (n == 1) return 1;   // base case 2
        return fib(n - 1) + fib(n - 2);
    }

        // printing prime upto n
        static boolean isprime(int n) {
            if(n < 2) return false ;
            for(int i = 2; i*i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        static void printPrimrUpTo(int n) {
            for (int i =2; i < n; i++) {
                if(isprime(i)) System.out.println(i + " "); 
            }
        }

        // factorial and NcR
        static long factorial(int n) {
        long result = 1;
            for (int i = 2; i <= n; i++) result *= i;
                return result;
        }
        static long nCr(int n, int r) {
            return factorial(n) / (factorial(r) * factorial(n - r));
        }
        

}