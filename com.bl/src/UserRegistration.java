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
}
