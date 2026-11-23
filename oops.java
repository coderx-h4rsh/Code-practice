public class oops {
    public static void main(String[] args) {
        /*BankAccount b1 = new BankAccount();
        b1.accHol = "Harsh";
        b1.accNum = 436518;
        b1.bal = 229.74;
        b1.branch = "SBI Bundi";

        b1.deposite();
        b1.print();

        Car c1 = new Car("Ford", "Mustang GT", 2025, 293743.887);
        //Car c1 = new Car();
        c1.carSpecs();
        c1.engineCheck();

        Smartphone s1 = new Smartphone("Vivo", "S2", 36000.00);
        Smartphone.storage = 8;
        Smartphone.camera = 50;
        s1.print(); */   

        Product p1 = new Product("Lamp", 67590, 423.896, 2);
        //Product.website = "Blinkit";
        //Product.tax = 18;
        p1.invoice();
    }    
}

class BankAccount {
    String accHol;
    int accNum;
    double bal;
    String branch;

    void deposite() {
        System.out.println("Amount Deposited Succesfully.");
    }

    void print() {
        System.out.println(accHol + " , " + accNum + " , " + bal + "$ , " + branch);
    }
}

// constructor overloading and chaining 
class Car {
    String brand;
    String model;
    int year;
    double price;

    Car() {
        this("Unknown");
        System.out.println("This is constructor first");
    }

    Car(String brand) {
        this(brand, "Unknown");
        System.out.println("This is second constructor");
    }

    Car(String brand, String model) {
        this(brand, model, 0);
        System.out.println("This is third constructor");
    }

    Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
        System.out.println("This is fourth constructor");
    }

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        System.out.println("This is the main Constructor");
    }

    void engineCheck() {
        System.out.println("Engine Starts...");
    }

    void carSpecs() {
        System.out.println(brand + " , " + model + " , " + year + " , " +  price + "$");
    }
}

class Smartphone{
    String brand;
    String model;
    static int storage;
    static int camera;
    double price;

   Smartphone(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    }

    void print(){
        System.out.println(brand + " , " + model + " , " + storage + "GB, " + camera + "Mp, " + price + "$");
    }
}

class Product {
    String name;
    int id;
    double price;
    int qty;
    static String website;
    static final int tax = 18;

    Product(String name, int id, double price,  int qty) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty; 
    }

    //Static Block
    static {
        Product.website = "Amazon";
    }

    void invoice() {
        System.out.println(name + " , " + "Product ID#" + id + " , " + price + "$, " + qty + "pieces, " + website + " , " + tax + "% GST");
    }
}