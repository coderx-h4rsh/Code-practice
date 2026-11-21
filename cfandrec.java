public class cfandrec {
    public static void main(String[] args) {
        /*  System.out.println(sumOfSquares(7, 12));
        int terms = 25;
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }

        printPrimrUpTo(30);*/
        //pn(335);
        //int result = a5(sq(12));
        //int result = pn(dn(34));
        //System.out.println(s10(mul(5, 89)));
        //System.err.println(display(grt(-889, -11)));
        //chk(sq(18));

        /*int finalPrice = discout(gst(1000));
        System.out.println("The final price of the item is " + finalPrice + "$");*/

        //System.out.println(chk(sum(1233)));
        //result("Harsh",percentage(total(95,96, 100)));

        //System.out.println(fib(35));
        //System.out.println(sum(5));
        //printNum(5);
        //System.out.println(fac(5));
        System.out.println(sumDig(1987));
    }
    /*static int square(int n) {
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

    // squaring and adding
    static int sq(int n) {
        return (n * n);
    }
    static int a5(int n) {
        return (n + 5);
    } 

    // doubling and print
    static int pn(int n){
        return n;
    }
    static int dn(int n) {
        return (n * 2);
    }

    // musltiplying and substract
    static int mul(int a, int b){
        return (a * b);
    }
    static int s10(int n) {
        return (n - 10);
    }
   
    // finding greatest and printing 
    static int grt(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    static int display(int n) {
        return n;
    }

    // Even or Odd
    static int sq(int n) {
        return (n * n);
    }
    static void chk(int n) {
        if(n % 2 == 0) {
            System.out.println("The given number is Even.");
        } else {
            System.out.println("The given number is Odd.");
        }
    } 

    // Calculate Final Price
    static int discout(int n) {
        return (n - (n/10));
    }
    static int gst(int n) {
        return (n + ((18 * n) / 100));
    } 

    // Finding sum of digits of a given number and verifying if it's even or not
    static int sum(int n) {
        int sum = 0;
        int dig = 0;
        while(n > 0) {
            dig = n % 10;
            sum += dig;
            n /= 10;
        }
        return sum;
    }
    static boolean chk(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    } 

    // examination result calculator
    static int total(int p, int c, int m) {
        return (p + c + m);
    }
    static double percentage(int n) {
        return (n/3);
    }
    static void result(String name, double d) {
        System.out.println(name + " got " + d + "%.");
    }
    // finding nth term of fibonacci series using recursion
    static int fib(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int x = fib(n-1);
        int y = fib(n-2);
        return (x+y);
    } 

    // base case --> to start recursion
    // recursive call --> moves towards base case 

    // print sum of first n natural numbers 
    static int sum(int n){
        if(n == 0) return 0;
        int x = sum(n-1);
        return (n + x);
    } 

    // printing numbers from n to 1
    static void printNum(int n) {
        if(n == 0) return;
        System.out.println(n);
        printNum(n-1);
    } 

    // factorial of number
    static int fac(int n) {
        if(n == 0) return 1;
        return (n * fac(n-1));
    }*/

    // finding sum of digits
    static int sumDig(int n) {
        if(n == 0) return 0;
        return (n % 10) + (sumDig(n/10));
    }
}
