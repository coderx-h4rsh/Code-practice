public class NstdClss {
    public static void main(String[] args) {
        /* University.Department mine = new University.Department();
        mine.display(); */

        /* Mall M = new Mall();
        Mall.Shop s1 = M.new Shop();
        s1.showName(); */

        /* ElectricityBill e1 = new ElectricityBill();
        e1.calculateBill(); */

        MusicPlayer m = new MusicPlayer() {
            @Override 
            public void play() {
                System.out.println("Music playing...");
            }
        };
        m.play();
    }
}
// Static Nested Class
class University {
    String name = "MPUAT, CTAE";
    static class Department {
        String name = "CSE";

        University U;
        Department() {
            this.U = new University();
        }

        Department(University U) {
            this.U = U;
        }

        void display() {
            System.out.println("University: " + U.name + ", Department: " + name);
        }
    }
}

// Inner Nested Class
class Mall {
    String MallName = "Urban Square";
    class Shop {
        String ShopName = "Mr.DIY";
        void showName() {
            System.out.println("Mall: " + Mall.this.MallName + ", Shop: " + ShopName);
        }
    }
}

// Local Nested Class
class ElectricityBill {
    void calculateBill() {
        int units = 214;
        class BillCalculator {
            int claculate() {
                return (units * 19);
            }
        }
        BillCalculator b1 = new BillCalculator();
        b1.claculate();
        System.out.println("Monthly bill: " + b1.claculate() + "$");
    }
}

// Anonymous Nested Class 
interface MusicPlayer {
    void play();
}