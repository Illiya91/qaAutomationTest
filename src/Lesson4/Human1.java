package Lesson4;

public class Human1 {
    public static void main(String[] args) {
        Human myHuman = new Human(50, 30, "Ilon", "Mask", 130);

        System.out.println(myHuman);
        System.out.println("Height = " + myHuman.height);
        System.out.println("Age = " + myHuman.age);
        System.out.println("First name = " + myHuman.first_name);
        System.out.println("Last name = " + myHuman.last_name);
        System.out.println("Weight = " + myHuman.weight);
    }

}
