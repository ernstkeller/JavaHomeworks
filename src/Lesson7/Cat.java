package Lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean hungry;

    Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void isCatHungry() {
        String isHungry = !hungry ? "full" : "hungry";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseOfFood(appetite))
            hungry = false;
    }
}
