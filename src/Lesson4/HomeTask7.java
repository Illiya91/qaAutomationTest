//Create a simple class with some fields.
//Demonstrate in your class how we can use initialization blocks.
package Lesson4;

public class HomeTask7 {
    int age;
    String name;
    int yearBirthday;


    HomeTask7(int age, String name, int yearBirthday){
        this.age = age;
        this.name = name;
        this.yearBirthday = yearBirthday;
    }
public double HumanYears() {
    int result;
    result = 2022 - age;
    System.out.println(name + result);

return result;
    }

    public static void main(String[] args) {
        HomeTask7 homeTask7 = new HomeTask7(31, "Illiya", 1991);
        System.out.println(homeTask7.HumanYears());
    }
}

