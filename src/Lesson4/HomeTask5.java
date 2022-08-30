//Create a simple class with a bunch of constructors.
//All these constructors should take different number of parameters.
//Demonstrate in your class, how we can call one constructor from another.
package Lesson4;

public class HomeTask5 {
    int age;
    String name;
    int yearBirthday;


    HomeTask5(int age, String name, int yearBirthday) {
        this.age = age;
        this.name = name;
        this.yearBirthday = yearBirthday;

    }

    HomeTask5(int age, String name) {
            this(age,name,2022-age);

    }

}


