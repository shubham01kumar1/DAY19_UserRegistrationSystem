import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserRegistration registration = new UserRegistration();

        System.out.println("Enter first name: ");
        String firstName = scan.next();
        registration.validFirstName(firstName);

        System.out.println("/n Enter last name: ");
        String lastName = scan.next();
        registration.validLastName(lastName);

        System.out.println("/n Enter Email: ");
        String Email = scan.next();
        registration.validEmail(Email);
    }

    private void validFirstName(String firstName) {
        String regex = "^[A-Z][A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("User first name is valid :) ");
        }
        else {
            System.out.println("User first name is Invalid :( ");
        }
    }

    private void validLastName(String lastName) {
        String regex = "^[A-Z][A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("User last name is valid :) ");
        } else {
            System.out.println("User last name is Invalid :( ");
        }
    }

    private void validEmail(String Email) {
        String regex = "^\\w+([+-_.][\\w])*\\@[\\w]+\\.(\\w{2,4}\\.)?[^\\d]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        if (matcher.matches()) {
            System.out.println("User Email is valid :) ");
        } else {
            System.out.println("User Email name is Invalid :( ");
        }
    }
}
