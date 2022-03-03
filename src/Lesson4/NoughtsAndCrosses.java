package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class NoughtsAndCrosses {


    public static void main(String[] args) {

        String[][] field = initField(3);
        boolean isActiveTurn = true;

        System.out.println("Игра началась!");
        displayField(field);

        while (isActiveTurn) {

            playerTurn(field);
            displayField(field);
            if (isWinner("X", field) || isGameDraw(field)) {
                isActiveTurn = false;
                break;
            }

           aiTurn(field);
           displayField(field);
           if (isWinner("O", field) || isGameDraw(field)) {
                isActiveTurn = false;
            }
        }


    }

    //Отображение поля

    public static void displayField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] initField(int size) {

        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++){
                field[i][j] = "*";
            }
        }
        return field;
    }

    //Ход игрока

    public static void playerTurn(String[][] field) {
        System.out.println("Ваш ход! Введите координаты клетки");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= field[0].length) && (y > 0 && y <= field.length)) {
                if (field[x-1][y-1].equals("*")) {
                    field[x-1][y-1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Вы сходили на занятую клетку");
                }
            }
            else {
                System.out.println("Вы вышли за пределы поля");
            }
        }
    }

    //Ход ИИ

    public static void aiTurn(String[][] field) {
        System.out.println("Ход ИИ");

        Random random = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = random.nextInt(field[0].length);
            int y = random.nextInt(field.length);

            if ((x > 0 && x <= field[0].length) && (y > 0 && y <= field.length)) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "O";
                    isActiveTurn = false;
                }
            }
        }
        System.out.println("ИИ сходил");
    }

    //Условие победы
    public static boolean isWinner(String mark, String[][] field) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0].equals(mark) && field[i][1].equals(mark) && field[i][2].equals(mark))
                    || (field[0][i].equals(mark) && field[1][i].equals(mark) && field[2][i].equals(mark))) {
                System.out.println(mark + " победил!");
                return true;
            }
            if ((field[0][0].equals(mark) && field[1][1].equals(mark) && field[2][2].equals(mark))
                    || (field[2][0].equals(mark) && field[1][1].equals(mark) && field[0][2].equals(mark))) {
                System.out.println(mark + " победил!");
                return true;
            }
        }
        return false;
    }

    //Условие ничьей
    public static boolean isGameDraw(String[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья! Попробуйте еще раз!");
        return true;

    }

}
