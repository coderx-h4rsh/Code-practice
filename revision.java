/* public class revision {
    public static void main(String[] args) {
        // Explicit Conversion 
       int i = 33;
       byte j;
       j = (byte)i;

       float f = 23.99f;
       int k;
       k = (int) f;

       double d = 34.3702;
       float c;
       c = (float)d;

       // Character Conversion
        char w = 'h';
        int n;
        n = (int) w;

        int ch = 33;
        char x;
        x = (char) ch;
        System.out.println(j + "  " + k + "  " + c + "  " + n + "  " + x); */

        /*Operators

        int i = 33;
        int j = 48;

        int p = i+j;
        int q = i-j;
        int r = i*j;
        float s = (float) i/j;
        int t = i%j;

        int k = 67;

        int x = k+=22;
        int y = k-=99;
        int z = k*=3;
        int w = k/=22;
    
        //System.out.println(p + " " + q + " " + r + " " + s + " " + t);
        //System.out.println(x + " " + y + " " + z + " " + w);
        
        int m = 99;
        int n = 44;

        boolean ab = m==n;
        boolean bc = m!=n;
        boolean cd = m>n;
        boolean de = m<n;
        
        //System.out.println(ab + " " + bc + " " + cd + " " + de);

        int a = 222;
        int b = 56;

        long c = a&b;
        long d = a|b;
        long e = a^b;
        long f = ~a;
        long g = ~b;

        //System.out.println(c + " " + d + " " + e + " " + f + " " + g);

        int A = 51;
        int B = 83;

        boolean w = (A != B) && (A == B);
        boolean ww = (A > B) || (A < B);
        System.out.println(w + " , " + ww);

        // Selection statement 
        
        int x = 3;
        int y = 2;

        if(x > y) {
            System.out.println("x is greater than y");
        } else 
            System.out.println("x is smaller than y");
        int z = 13;
        if(z > 0 && z < 10) {
            System.out.println("z lies between 0 and 10");
        } else if (z >= 10 && z < 20) {
            System.out.println("z lies between 10 and 20");
        } else if (z >= 20 && z < 30) {
            System.out.println("z lies between 20 and 30");
        } else {
            System.out.println("z is greater than 30");
        }


        int w = 45;
        switch(w) {
            case 22 :
                System.out.println("w is 22");
                break;
                case 44 :
                    System.out.println("w is 44");
                    break;
                case 66 :
                    System.out.println("w is 66");
                    break;
                    default :
                    System.out.println("Not in range.");
        }

        //Iteration & Jump Statment

        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }

        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i <= 10);

        for(int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i<=20; i++) {
            if(i%2 == 0) continue;
            if(i > 15) break;
            System.out.println(i);
        }

            int n = 0;
        do{
            System.out.println("Square");
            n++;
        } while(n <= 20); 
    }
}*/

public class revision {
    public static void main(String[] args) {
        /*int[] a = new int[7];
        // array[0] --> first elemnt, array[1] --> second element, array[2] --> third element
        a[0] = 101;
        a[1] = 102;
        a[2] = 103;

        System.out.println(array[2]);

        int n = 101;
        for(int i = 0; i < a.length; i++) {
            a[i] = n;
            n++;
        }
        for(int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

            int[][] m = new int[3][4];

            int n = 101;
            for(int i = 0; i < m.length; i++) {
                for(int j = 0; j < m[i].length; j++) {
                    m[i][j] = n;
                    n++;
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            int[] a = {101, 102, 103, 104, 105};
            System.out.println(a[4]); */

            int[][] b = {
                {101, 103, 105, 107},
                {102, 104, 106, 108},
                {109, 111, 113, 115},
            };
            for(int i = 0; i < b.length; i++) {
                for(int j = 0; j < b[i].length; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            
    }
}
