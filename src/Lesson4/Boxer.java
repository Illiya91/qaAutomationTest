package Lesson4;

public class Boxer {

    public int age ;
    public int weight ;
    public int strength ;

    public Boxer() {
        this.age = 5;
        this.weight = 5;
        this.strength = 5;
    }

    public Object fight(Boxer anotherBoxer) {
        // write your code here
        int count = 0;
        int count1 = 0;

        if (this.age > anotherBoxer.age) {
            count++;
        } else count1++;

        if (this.strength > anotherBoxer.strength) {
            count++;
        } else count1++;

        if (this.weight > anotherBoxer.weight) {
            count++;
        } else
            count1++;


        if (count > count1) {
            return anotherBoxer;


        }
        return count;
    }

    public static void main(String[] args){
Boxer boxer = new Boxer();
    System.out.println(boxer.fight(boxer));
    }

    }


