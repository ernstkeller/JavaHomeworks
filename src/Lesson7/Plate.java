package Lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }


    public boolean decreaseOfFood(int n) {
        int remainingQuantity = food - n;
        if (remainingQuantity < 0) return false;

        food -= n;
        return true;
    }
    public void addFood(int food) {
        this.food += food;
    }

    public void displayFoodQuantity() {
        System.out.println("Total food on the plate: " + food);
    }

}
