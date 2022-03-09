package Lesson6;

public class Cat extends Animal {

    private final int runDistanceLimit = 200;

    void run(int length) {
        if ((length >= 0) && (length <= runDistanceLimit))
            System.out.println("Кошка пробежала " + length + " метров");
        else System.out.println("Кошка не может пробежать такое расстояние");
    }

    void swim(int length) {
        System.out.println("Кошка не умеет плавать");
    }






}
