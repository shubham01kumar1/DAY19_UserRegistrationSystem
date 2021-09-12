import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UserRegistration class for user details validation
class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserRegistration registration = new UserRegistration();

        System.out.println("Enter first name: ");
        String firstName = scan.nextLine();
        registration.validFirstName(firstName);  //First name starts with Cap and has minimum 3 characters validation

        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        registration.validLastName(lastName);  //last name starts with Cap and has minimum 3 characters validation

        System.out.println("Enter Email: ");
        String Email = scan.nextLine();
        registration.validEmail(Email);      //validating all valid emails

        System.out.println("Enter Your phone number: ");
        String phnum = scan.nextLine();
        registration.validPhoneNum(phnum);   //validating Mobile Format-E.g. 91 9919819801-Country code follow by space and 10 digit number

        System.out.println("Enter Your password: ");
        String password = scan.nextLine();
        registration.validPassword(password);  //validating password, it should have atleast 8 characters and atleast upper case letter.
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

    private void validPhoneNum(String number) {
        String regex = "^[1-9][0-9]\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
    }

    //rule2 for valid pass: minimum 8 characters and have atleast one upper case char.
    private void validPassword(String password) {
        String rule1 = "^(?=.*[A-Z])[\\w.-@#$%^&*.!]{8,32}$";
        Pattern pattern = Pattern.compile(rule1);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Given password is valid");
        } else {
            System.out.println("Given password is not valid");
        }
    }
}
