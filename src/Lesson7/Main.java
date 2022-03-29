package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Felix", 10, false);
        allCats[1] = new Cat("Oscar", 8, false);
        allCats[2] = new Cat("Vincent", 15, false);
        allCats[3] = new Cat("Sam", 14, false);
        Plate plate = new Plate( 45);

        for (Cat cat : allCats) {
            cat.eat(plate);
            cat.isCatHungry();
        }

        plate.addFood(50);
        plate.displayFoodQuantity();
    }
}
