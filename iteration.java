public class iteration {
    public static void main(String[] args) {
        // continue --> skip   break --> terminate 

    /*  for (int i = 1, j = 100; i <= 25 && j >= 10; i++, j -= 5) {
            if (i % 5 == 0) continue;
            if (j == 45) break;
            System.out.println(i);
        }*/

       // finding the sum of all numbers from 1 to 20

        /*int sum = 0;
        for(int i = 1; i<=20; i++){
        sum += i;
        } 
        System.out.println("The sum of numbers from 1 to 20 is " + sum); */

       // printing numbers from 1 to 25 skipping multiples of 3

      /*for(int i = 1; i <= 25; i++){
        if(i % 3 == 0) continue;
        System.out.println(i);
       }*/

       // finding sum of all odd numbers from 1 to 50

        /*int sum = 0;
       for(int i = 1; i <= 50; i++) {
        if (i % 2 == 0) continue;
        sum += i;
       }
        System.out.println("The sum of all odd numbers from 1 to 50 is " + sum);*/

        // printing number from 1 to 100 till a number divisible by both 7&9 comes

      /*for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 9 == 0) break;
            System.out.println(i);
        }*/

        // finding if a number is prime or not

        /*int num = 11;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime == false) {
            System.out.println("The given number is not prime.");
        } else {
            System.out.println("The given number is prime.");
        }*/

       // printing even numbers from 1 to 50 and stop when sum exceeds 200

     /*int sum = 0;
       for (int i =1; i <= 50; i++) {
        if (i % 2 != 0) continue;
        System.out.println(i);
        sum += i;
        if (sum > 200) break;
       }*/

      // printing a right angled triangle of 10 rows

     /*for(int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        } System.out.println();
      }

     // printing a right triangle of numbers 

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            } System.out.println();
        } 

        // 17 november

        // printing sum of digits of a given number
        int n = 3346;
        int sum = 0;

        while(n>0) {
           int dig = n%10;
           sum = sum + dig;
            n/=10;
        }
         System.out.println(sum);

         // printing given number with reversed digits
        int num = 19112023;
        int dig = 0;

        while(num > 0) {
            dig = num % 10;
            num /= 10;
            System.out.print(dig);
        }

            // printing factorial of a given number
            int fac = 1;
        for(int i = 11; i > 0; i--) {
            fac = fac*i;
        }
        System.out.println(fac);
        // printing factors and number if factors of a given number
        int n = 18;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
                count++;}
        } System.out.println("The number of factors of the given number is " + count); 

        // printing a star square 
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 

            // printing a nummber triangle
            int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        } 

            // printing multiplication table of numbers from 1 to n
            int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<=10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

            // checking whether the number is prime or not
         int n = 19;
         boolean isP = true;

         for(int i = 2; i < n; i++) {
            if(n % i == 0){
                isP = false;
                break;
            }
         }

         if(isP == true) {
            System.out.println("The given number is a Prime Number.");
         } else {
            System.out.println("The given number is not Prime Number.");
         } 

            // printing numbers from 1 to 50 skkiping divisible of 3&5
            for(int i = 1; i <= 50; i++) {
                if(i % 3 == 0 || i % 5 == 0) continue;
                System.out.print(i + " ");
            }*/

    }
}