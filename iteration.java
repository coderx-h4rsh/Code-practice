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
      }*/

     // printing a right triangle of numbers 

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            } System.out.println();
        } 
    }
}