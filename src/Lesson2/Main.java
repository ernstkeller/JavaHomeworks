package Lesson2;

public class Main {
    public static void main(String[] args) {

        System.out.println(isWithinLimits(5, 8));
        System.out.println(isPositiveOrNegative(-17));
        System.out.println(defineIfTrueNegative(24));
        printString(4, "Хороший день, чтобы изучать Java!");
        System.out.println(defineLeapYear(2020));
    }

    public static boolean isWithinLimits(int a, int b) {
        int sum = a+b;
        if (sum >= 10 && sum <=20) return true;
        else return false;
    }

    public static String isPositiveOrNegative(int a) {
        if (a >= 0) return ("Число " + a + " положительное.");
        else return ("Число " + a + " отрицательное.");
    }

    public static boolean defineIfTrueNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void printString(int x, String string) {
        for (int i = 0; i < x; i++) {
            System.out.println(string);
        }
    }

    public static boolean defineLeapYear(int year) {
        if ((year % 4 != 0 && year % 4 != 100) || year % 400 !=0) return true;
        else return false;
    }

}
