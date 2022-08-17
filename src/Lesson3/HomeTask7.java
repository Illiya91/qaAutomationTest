//7. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
//   Example:
//   Den
//   John
//   Will
//   Kate
//   ...
package Lesson3;

public class HomeTask7 {
    public static void main(String[] args){
        String name = "Den, John, Will, Kate, Adam, Robin";
        for (String s : name.split("[, \\s]")) {
            System.out.println(s);
        }
    }
}




