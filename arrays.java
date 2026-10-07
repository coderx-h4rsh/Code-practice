public class arrays {
    public static void main(String[] args) {

        // Declaring an array but initialising only first three indices 

      /*int[] array = new int[10];
        array[0] = 12;
        array[1] = 17;
        array[2] = 18;

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } System.out.println(); */

        // Declaring a character array of my name's letters

      /*char[] array = new char[5];
        array[0] = 'H';
        array[1] = 'A';
        array[2] = 'R';
        array[3] = 'S';
        array[4] = 'H';

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        } System.out.println(); */


        // Creating a float array 

      /*float[] array = new float[4];
        array[0] = 3.14f;
        array[1] = 5.89f;
        array[2] = 1.77f;
        array[3] = 4.44f;

        for(int o = 0; o < array.length; o++) {
            System.out.print(array[o] + "$ ");
        } System.out.println(); */

        // filling an array with squares of number from 1 to 8

      /*int[] array = new int[8];
        
        for(int i = 0; i < array.length; i++) {
            int num = i + 1;
            array[i] = num * num;
        }
        
        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } System.out.println(); */

        // Using slection statements with an array

      /*int[] array = {65, 72, 98, 13, 40};
        int sum = 0;
        float avg = 0f;
        int num = 13;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = sum / array.length;

            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        } 

        for(int j = 1; j < array.length; j++) {
            if(array[j] == num) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }

        for(int k = 0; k < array.length; k+=2) {
            System.out.print(array[k] + " ");
        } System.out.println();
        System.out.println("The sum of all elements of array is " + sum);
        System.out.println("The avg of all elements of the array is " + avg); */

        // 2D Array with selection statements

     /* int[][] array = {
                {12, 35, 27},
                {33, 98, 75},
                {20, 44, 53},
        };

            int sum = 0;
            int sumR1 = 0;
            int sumR2 = 0;
            int sumR3 = 0;

            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");

                    sum += array[i][j];

                    sumR1 += array[0][j];
                    sumR2 += array[1][j];
                    sumR3 += array[2][j];
                }
                System.out.println();
            }System.out.println("The sum of all elements of the given array is " + sum);
             System.out.println("sumR1 = " + sumR1 + " sumR2 = " + sumR2 + " sumR3 = " + sumR3 ); */

            int[][] array = new int[3][3];

            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                    array[i][j] = (i+1) + (j+1);

                    System.out.print(array[i][j] + " ");
                }
                    System.out.println();
            } 

    }
}