package Lesson5;

public class HomeTask1 {
}
class Car {

    // Class member variable
    int speed;

    // Constructor
    Car()
    {

        // Print statement when constructor is called
        System.out.println("Speed of Car: " + speed);
    }
    // Block
    {
        speed = 60;
    }
    // Class member method
    public void main(String[] args)
    {

        Car obj = new Car();
    }
}