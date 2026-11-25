public class AbsandPoly {
    public static void main(String[] args) {
        // Abstraction
        /*Shape s1 = new Circle();
        s1.area(22);
        Shape s2 = new Square();
        s2.area(16);*/

        /*Payment p1 = new UPI();
        p1.pay(35999.99);
        Payment p2 = new CARD();
        p2.pay(65932.47); */

        // Interface
        /*Remote r1 = new TV();
        r1.turnOn();
        Remote r2 = new AC();
        r2.turnOff();*/

        /*Notification n1 = new Email();
        n1.showNotifications();
        Notification n2 = new Whatsapp();
        n2.showNotifications();*/

        // Polymorphism
        /*Appliances a1 = new Refrigerator();
        a1.start();
        Appliances a2 = new WashingMachine();
        a2.start(); */

        /*Calculator c1 = new Calculator();
        System.out.println(c1.add(9230, 770));
        System.out.println(c1.add(22, -44, -77));
        System.out.println(c1.add(66.745, -128.309));*/

        // Static, Private & Final Methods
        /*int sq = MathHelper.square(27);
        System.out.println("Square of given number is " + sq);*/

        /*Passwords p1 = new Passwords();
        p1.checkPass("Harsh@123");*/

        /*Machine m1 = new LatheMachine();
        m1.showSafetyInstructions();*/
    }
}
// Abstraction
abstract class Shape {
    abstract void area(int n);
}
class Circle extends Shape {
    void area(int n) {
        System.out.println("The are of given Circle is " + (n * n * 3.14) + " sq units.");
    }
}
class Square extends Shape {
    void area(int n) {
        System.out.println("The area of given Square is " + (n * n) + " sq units.");
    }
}

abstract class Payment {
    abstract void pay(double amount);
}
class UPI extends Payment {
    void pay(double amount) {
        System.out.println(amount + " $ is paid by UPI.");
    }
}
class CARD extends Payment {
    void pay(double amount) {
        System.out.println(amount + " $ is paid using a Card.");
    }
}

// Interface
interface Remote {
    void turnOn();
    void turnOff();
}
class TV implements Remote {
    public void turnOn() {
        System.out.println("TV is turning on.");
    }
    public void turnOff() {
        System.out.println("TV is turning off.");
    }
}
class AC implements Remote {
    public void turnOn() {
        System.out.println("AC is turning on.");
    }
    public void turnOff() {
        System.out.println("AC is turning off.");
    }
}

interface Notification {
    void showNotifications();
}
class Email implements Notification {
    public void showNotifications() {
        System.out.println("You have a new Mail from Linkedin.");
    }
}
class Whatsapp implements Notification {
    public void showNotifications() {
        System.out.println("You have got 4 new messages.");
    }
}

// Polymorphism
class Appliances {
    void start() {
        System.out.println("Appliance starts.");
    }
}
class Refrigerator extends Appliances{
    @Override 
    void start() {
        System.out.println("Refrigerator starts..." + " set temperature for freezer.");
    }
}
class WashingMachine extends Appliances {
    @Override 
    void start() {
        System.out.println("Washing Machine starts..." + " select mode to use.");
    }
}

class Calculator {
    int add(int x, int y) {
        return (x + y);
    }
    int add(int x, int y,int z) {
        return (x + y + z);
    }
    double add(double x, double y) {
        return (x + y);
    }
}

// Static, Private & Final Methods
class MathHelper {
    static int square(int n) {
        return (n * n);
    }
}

class Passwords {
    private void validate(String pass) {
        if(pass.length() >= 8) {
            System.out.println("Your password is validated");
        } else {
            System.out.println("Your password is not valid.");
        }
    }

    public void checkPass(String pass) {
        validate(pass);
    }
}

class Machine {
    final void showSafetyInstructions() {
        System.out.println("Showing safety instructions....");
    }
}
class LatheMachine extends Machine {
}