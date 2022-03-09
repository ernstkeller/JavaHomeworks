package Lesson6;

public class Dog extends Animal {

    private final int runDistanceLimit = 500;
    private final int swimDistanceLimit = 10;

    void run(int length) {
        if ((length >= 0) && (length <= runDistanceLimit))
            System.out.println("Собака пробежала " + length + " метров");
        else System.out.println("Собака не может пробежать такое расстояние");
    }

    void swim(int length) {
        if ((length >= 0) && (length <= swimDistanceLimit))
            System.out.println("Собака проплыла " + length + " метров");
        else System.out.println("Собака не может проплыть такое расстояние");
    }


}
