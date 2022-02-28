package Lesson3;

public class Main {

    public static void main(String[] args) {

        replaceArrayValues();
        fillArrowWithValues();
        multiplyArrayValues();
        createSquareArray();
        returnArray(7, 9);

    }

    //Задание 1
    public static void replaceArrayValues(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
                System.out.println(array[i] + " ");
            }
            else {
                array[i] = 1;
                System.out.println(array[i] + " ");
            }
        }

    }

    //Задание 2
    public static void fillArrowWithValues(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    //Задание 3
    public static void multiplyArrayValues(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
                System.out.println(array[i] + " ");
            }
            else {
                System.out.println(array[i] + " ");
            }
         }
    }

    //Задание 4
    public static void createSquareArray() {
        int[][] table = new int[5][5];
        table[0][0] = 1;
        table[0][1] = 0;
        table[0][2] = 0;
        table[0][3] = 0;
        table[0][4] = 1;
        table[1][0] = 0;
        table[1][1] = 1;
        table[1][2] = 0;
        table[1][3] = 1;
        table[1][4] = 0;
        table[2][0] = 0;
        table[2][1] = 0;
        table[2][2] = 1;
        table[2][3] = 0;
        table[2][4] = 0;
        table[3][0] = 0;
        table[3][1] = 1;
        table[3][2] = 0;
        table[3][3] = 1;
        table[3][4] = 0;
        table[4][0] = 1;
        table[4][1] = 0;
        table[4][2] = 0;
        table[4][3] = 0;
        table[4][4] = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5
    public static void returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
   }

   
}
