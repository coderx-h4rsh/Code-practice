public class EnandIn {
    public static void main(String[] args) {

        // Encapsulation
        /*Employee E1 = new Employee();
        E1.setName("Harsh");
        E1.setId(101108);
        E1.setSalary(50000.69);

        System.out.println("Employee " + E1.getName());
        System.out.println(" with ID " + E1.getId());
        System.out.println(" has a salary of " + E1.getSalary() + "$"); */

        /*Smartphone S2 = new Smartphone();
        S2.setBrand("Vivo");
        S2.setModel("S2");
        S2.setPrice(40000);

        System.out.println(S2.getBrand() + " , " + S2.getModel() + " , " +  S2.getPrice() ); */

        // Inheritance
        /*Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 8;
        d1.breed = "Husky";

        d1.Eat();
        d1.bark();
        d1.Sleep();
        System.out.println("age = " + d1.age + " Breed is " + d1.breed);*/

        // Use of 'Super'
        Laptop S16 = new Laptop("Asus", "Ryzen 5 220");
        S16.show();
        S16.display();
    }
}   
// Encapsulation
class Employee{
    private String name;
    private int employeeId;
    private double salary; 

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getId() {
        return employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Smartphone {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

// Inheritance
class Animal {
    String name;
    int age;

    Animal() {}

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Eat() {
        System.out.println(name + " eats it's food");
    }

    void Sleep() {
        System.out.println("zzzzz....");
    }
}
class Dog extends Animal {
    String breed;
    void bark() {
        System.out.println(name + " barks as Woof-Woof");
    }
}

// Use of 'Super'
class Device {
    String brand; //= "Lenovo";

    Device() {}

    Device(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("This is an electronic device.");
    }
}
class Laptop extends Device {
    String brand = "Asus";
    String cpu;
    
    Laptop(String brand, String cpu) {
        super(brand);
        this.cpu = cpu;
    }

    void show() {
        System.out.println("I have a laptop of " + brand + " with processor " + cpu);
        System.out.println(super. brand + " Expertbook was also in my consideration.");
    }

    void Display() {
        super.display();
        System.out.println("This is a laptop.");
    }
}