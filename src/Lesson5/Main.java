package Lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Albus Dumbledore", "Headmaster of Hogwarts", "adumbledore@hogwarts.uk", "+44 7911 845327", 5000, 115);
        employees[1] = new Employee("Minerva McGonagall", " Head of Gryffindor House, Professor of Transfiguration", "mmcgonagall@hogwarts.uk", "44 7911 845328", 3000, 56);
        employees[2] = new Employee("Filius Flitwick", "Head of Ravenclaw House, Charms Master", "fflitwick@hogwarts.uk", "+44 7911 845339", 3000, 34);
        employees[3] = new Employee("Severus Snape", " Head of Slytherin House, Potions Master", "ssnape@hogwarts.uk", "+44 7911 845346", 3000, 32);
        employees[4] = new Employee("Pomona Sprout", "Head of Hufflepuff House, Professor of Herbology", "psprout@hogwarts.uk", "+44 7911 845392", 3000, 45);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].showInfo();
            }
        }
    }
}

