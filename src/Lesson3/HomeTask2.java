//2. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
    //    Given a tag and a word string, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
      //  For example:
        //tag=h1, words=Java Tutorials -> <h1>Java Tutorials</h1>
//     Task: word = Welcome to Java World, tag=p
package Lesson3;

public class HomeTask2 {
    public static void main(String[] args) {
String words = "Welcome to Java World";
String tag = "h1";
System.out.println(("<"+tag+">" + words +  "</" + tag + ">"));
}
  }



  //
//