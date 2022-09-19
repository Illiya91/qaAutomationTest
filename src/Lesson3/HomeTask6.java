//6. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
//   The First Name and Last Name of the user should be in the following format: "Name Surname".
//   Result should be:
//   login = "John Smith"
//   domain = "example.com"
package Lesson3;

public class HomeTask6 {
    public static void main(String[] args) {
        String email = "john_smith@example.com";
        int index = email.indexOf("@");
        String name = email.substring(0, index);
        String domain = email.substring(index + 1, email.length());

        String[] splitedName = name.split("_");
        String firstName = splitedName[0];
        String lastName = splitedName[1];
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println("// login  = : "  + firstName + " " + lastName );
        System.out.println("// domain = : " +  domain);
    }
}
