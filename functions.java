public class functions {
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
        System.out.println(v);*/

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

}
