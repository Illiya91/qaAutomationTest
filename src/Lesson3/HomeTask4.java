// Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

package Lesson3;

import java.util.Locale;

public class HomeTask4 {
    public static void main(String[] args){
   String word = "ABCDEFGHIJK";
   word = word.toLowerCase(Locale.ROOT);
   System.out.println(word.replaceAll("[aeiou]\\B", ""));

    }
}
