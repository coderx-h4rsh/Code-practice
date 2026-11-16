   
// Selection statement Questions

   public class selection {
   public static void main(String[] args) {

       // leap year calculator

       /*int year = 2008;

       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year + " is a leap year.");
       } else {
           System.out.println(year + " is not a leap year.");
       }*/

      // Otp verfication

      /*int otp = 101108;
      int time = 24;

      if(otp == 101108 && time <= 30) {
           System.out.println("Access Granted.");
      } else {
           System.out.println("Access Denied.");
           System.out.println("Check your Otp and try again or try to fill it before 30 seconds.");
      }*/

       // Tax evaluator

      /*int income = 425610;
      double tax;
      if (income < 100000) {
        tax = income * 0;
      } else if (income > 100000 && income < 400000) {
           tax = income * 0.10;
      } else if (income > 400000 && income < 800000) {
           tax =  3000 + (income * 0.20);
      } else {
           tax = 11000 + (income * 0.30);
      }
       System.out.println("Tax = " + tax + "$");*/


       // E-commerce Price calculator

       /*int weight = 187;
       int volume = 24;
       String destination = "Regional";

       int wtPrice = weight * 2;
       int volPrice = volume * 3;
       int basePrice = wtPrice + volPrice;
       double finalPrice = 0.0;

       if (destination == "Local") {
           finalPrice = basePrice * 1.0;
       } else if (destination == "Regional") {
           finalPrice = basePrice * 2.0;
       } else if (destination == "International") {
           finalPrice = basePrice * 5.0;
       } else {
           System.out.println("Invalid Zone");
       }
       System.out.println("Final Shipping Price is $" + finalPrice);*/

       // Month name finder

       /*int mnth = 11;

       switch(mnth) {
           case 1 :
               System.out.println("January");
               break;
           case 2 :
               System.out.println("February");
               break;
           case 3 :
               System.out.println("March");
               break;
           case 4 :
               System.out.println("April");
               break;
           case 5 :
               System.out.println("May");
               break;
           case 6 :
               System.out.println("June");
               break;
           case 7 :
               System.out.println("July");
               break;
           case 8 :
               System.out.println("August");
               break;
           case 9 :
               System.out.println("September");
               break;
           case 10 :
               System.out.println("October");
               break;
           case 11 :
               System.out.println("November");
               break;
           case 12 :
               System.out.println("December");
               break;
       }*/

      // Restaurent Menu Ordering System

      /*int order = 4;

      switch(order) {
           case 1 :
               System.out.println("You ordered a Cold Coffee.");
               break;
           case 2 :
               System.out.println("You ordered French Fries.");
               break;
           case 3 :
               System.out.println("You ordered a Burger.");
               break;
           case 4 :
               System.out.println("You ordered a Pizza.");
               break;
      }

     // practice question

     int n = 3;
     if (n % 2 != 0) {
       System.out.println("Weird");
     } else if ((n % 2 == 0) && n<5) {
       System.out.println("Not Weird");
     } else if ((n % 2 == 0) && (n >= 6 && n < 20)) {
       System.out.println("Weird");
     } else {
       System.out.println("Not Weird");
     }*/

    // November 16, 2026

    /*int n = 33;
    if(n%2 == 0) {
        System.out.println("The given number is Even.");
    } else {
        System.out.println("The given number is Odd.");
    }*/

    /*int age = 18;
    if(age >= 18) {
        System.out.println("You are eligible to Vote.");
    } else {
        System.out.println("You are not eligible to Vote.");
    }*/

    /*int p = 96;
     int c = 95;
     int m = 98;

     int avg = (p + c + m) / 3;

        if(avg >= 40) {
            System.out.println("You are PASSED.");
        } else {
            System.out.println("You are FAILED.");
        }*/

     /*float pt = 94.17f;
      
     if(pt > 90) {
        System.out.println("Grade A+");
     } else if (pt < 89 && pt >= 80) {
        System.out.println("Grade A");
     } else if (pt < 79 && pt >= 70) {
        System.out.println("Grade B");
     } else if (pt < 69 && pt >= 60){
        System.out.println("Grade C");
     } else if (pt < 59 && pt >= 50) {
        System.out.println("Grade D");
     } else {
        System.out.println("Failed");
     }*/

        /*int u = 28;
        int b = 0;

        if (u <= 100) {
            b = u*5;
        } else if (u > 100 && u <= 200) {
            b = ((u-100)*7) + 500;
        } else if (u > 200) {
            b = ((u-200)*10) + 1200;
        }
            System.out.println("Your Electricity Bill is " + b + "$"); */

        /*int x = 2;
        int y = -3;

        if (x > 0 && y > 0) {
            System.out.println("The given point lies in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The given point lies in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The given point lies in the third quadrant.");
        } else if (x > 0 && y <0) {
            System.out.println("The given point lies in the fourth quadrant.");
        } else if (x == 0) {
            System.out.println("The given point lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("The given point lies on the x-axis.");
        } else {
            System.out.println("The given point is on the origin.");
        } */

        /*int day = 1;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thrusday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
                                        default:
                                            System.out.println("The number is invalid.");
                                            break;
        }*/

        /*int x = 2;
        int y =17;
        int z = 0;

        int op = 66;
        switch(op) {
            case 1:
                z = x+y;
                break;
                case 2:
                    z = x-y;
                    break;
                    case 3:
                        z = x*y;
                        break;
                        case 4:
                            z = x/y;
                            break;
                            case 5:
                                z = x%y;
                                break;
                                default:
                                    System.out.println("Invalid Operation.");
                                    break;
        }
        System.out.println(z);*/
    }
}
