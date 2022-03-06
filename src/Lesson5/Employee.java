package Lesson5;

public class Employee {

    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println(" ");
    }
}





