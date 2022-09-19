package Lesson4;

public class Human1 {
    public static void main(String[] args) {
        Human myHuman = new Human(50, 30, "Ilon", "Mask", 156);

        System.out.println(myHuman);
        System.out.println("Height = " + myHuman.height);
        System.out.println("Age = " + myHuman.age);
        System.out.println("First name = " + myHuman.firstName);
        System.out.println("Last name = " + myHuman.lastName);
        System.out.println("Weight = " + myHuman.weight);
    }

}
