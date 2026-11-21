/*public class functions {
    public static void main(String[] args) {

        // info();
        // div3();
        // EorO(5567);
        // table(17);
        /*int b = sum();
        System.out.println(b);*/
        /*double a = pi();
        System.out.println(a);*/ 
        /*int c = sq(33);
        System.out.println(c);*/
        /*int v = fac(5);
        System.out.println(v);

        //System.out.println(add(89, 93));
        //System.out.println(add(33.33, 87.904, 59.441));
        //System.out.println(area(23.47, 89.06));
        //System.out.println(area(5.77));
        System.out.println(area(22, 84));
    }

    // no input & no output


 // -> My info
    static void info() {
        System.out.println("Harsh Sharma");
        System.out.println("Computer Science Engineering");
        System.out.println("CTAE Udaipur");
    }

 // Numbers divisible by 3 
    static void div3() {
        for(int i = 1; i <= 20; i++) {
            if(i % 3 != 0) continue;
            System.out.println(i);
        }
    }

    // input but no output

 // Finding whether given number is Even or Odd
    static void EorO(int x) {
        if(x % 2 == 0) {
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number is Odd");
        }
    }

  // printing multiplication table of a given number
    static void table(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }   

    // output but no input

    // returning sum of first 100 natural numbers
    static int sum() {
        int z = 0;
        for(int i = 1; i <= 100; i++) {
            z += i;
        }
        System.out.println("The sum of all natural numbers till 100 is ");
        return z;
    }

    // returning value of pi 
    static double pi() {
        return 3.141592653589793;
    }

    // both input & output

    // returning square of given number
    static int sq(int s) {
        return(s*s);
    }

    //returning factorial of given number
    static int fac(int f) {
        int result = 1;
        for(int j = 2 ; j <= f; j++) {
            result *= j;
        } return result;
    }

    // function overloading

    // simple addition
    static int add(int p, int q) {
        return(p+q);
    }

    static double add(double t, double tt, double ttt) {
        return(t+tt+ttt);
    }

    // finding area 
    static double area (double length, double base) {
        return (base * length);
    }

    static double area (double radius) {
        return (3.14 * radius * radius);
    }

    static double area (int base, int height) {
        return ((base * height) /  2);
    }

}*/

public class functions {
    public static void main(String[] args) {
        //num(918);
        //comp(99, 42);
        //comp(29, 97, 43);
        //System.out.println(fac(6));
        //isPrime(17);
        //sum(89754);
        //rev(6754);
        //area(45);
        //area(13, 58);
        //area(7.77f);
        //chk(121);
    }

    /* finnding a number is either odd or even
    static void num(int n) {
        if( n % 2 == 0) {
            System.out.println("The given number is Even.");
        }
        else {
            System.out.println("The given numbber is Odd.");
        }
        return;

    // finding the greater number from a given set of integer
    static void comp(int x, int y) {
        if(x > y) {
            System.out.println("The greater Number is " + x);
        } else {
            System.out.println("The greater number is " + y);
        }
        return;
    } 
    
    static void comp(int x, int y, int z) {
        if(x > y && x > z) {
            System.out.println("The largest number is " + x);
        } else if (y > x && y > z) {
            System.out.println("The largest number is " + y);
        } else {
            System.out.println("The largest number is " + z);
        }
        return;
        } 

    // finnding factorial of a given number
    static long fac(int a) {
        long ans = 1;
        for(int i = a; i > 0; i--) {
            ans *= i;
        }
        //System.out.println("The factorial of given number is " + ans);
        return ans;
    } 
    // finding if the given number is prime or not 
    static void isPrime(int n) {
        boolean isp = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) 
            isp = false;
        }
        if(isp == false) {
            System.out.println("The given number is not a Prime Number.");
        } else {
            System.out.println("The given number is a Prime Number.");
        }
        return;
    } 

    // finding sum of digits of the given number
    static void sum (int n) {
       int sum = 0;

        while(n>0) {
           int dig = n % 10;
           sum = sum + dig;
           n /= 10;
        }
         System.out.println("The sum of all the digits of the given number is " + sum);
    } 

    // writing given number in reverse
    static void rev(int n) {
        int dig = 0;
        while(n > 0) {
            dig = n % 10;
            n /= 10;
            System.out.print(dig); 
        }
        System.out.println();
    }

    // area calculator(Function overloading)
    static void area(int n) {
        int area = (n * n);
        System.out.println("The area of square of sides " + n + " is " + area + " sq units.");
    }

    static void area(int l, int b) {
        int area = (l * b);
        System.out.println("The area of rectangle with length " + l + " and braedth " + b + " is " + area + " sq units.");
    }

    static void area(float r) {
        float area = (float)(3.14 * r * r);
        System.out.println("The area of circle with radius " + r + " is " + area + " sq units.");
    } 

    // checking whether the given number is a palindrome or not 
       static boolean chk(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;

        if (chk(num)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }*/
}