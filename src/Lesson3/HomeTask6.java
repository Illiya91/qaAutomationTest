//6. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
//   The First Name and Last Name of the user should be in the following format: "Name Surname".
//   Result should be:
//   login = "John Smith"
//   domain = "example.com"
package Lesson3;

public class HomeTask6 {
    public static void main(String[] args){
        String a = "john_smith@example.com";
        int index = a.indexOf("@");
        String c = a.substring(0,index);
        System.out.println("Імя "+":"+ c);
       String b = a.substring(index+1, a.length());
       System.out.println("Назва домену "+":"+ b);

    }
}
