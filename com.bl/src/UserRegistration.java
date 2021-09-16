import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UserRegistration class for user details validation
class UserRegistration {

    //First name starts with Cap and has minimum 3 characters validation
    public boolean validFirstName(String firstName) throws RegistrationException {
        String regex = "^[A-Z][A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if( matcher.matches() == false ) {
            throw new RegistrationException("Invalid First Name");
        }
        return matcher.matches();
    }

    //last name starts with Cap and has minimum 3 characters validation
    public boolean validLastName(String lastName) throws RegistrationException {
        String regex = "^[A-Z][A-Za-z]{2,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if( matcher.matches() == false ) {
            throw new RegistrationException("Invalid Last Name");
        }
        return matcher.matches();
    }

    //validating all valid emails
    public boolean validEmail(String Email) throws RegistrationException {
        String regex = "^\\w+([+-_.][\\w])*@[\\w]+\\.(\\w{2,4}\\.)?[^\\d]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        if( matcher.matches() == false ) {
            throw new RegistrationException("Invalid Email");
        }
        return matcher.matches();
    }

    //validating Mobile Format-E.g. 91 9919819801-Country code follow by space
    public boolean validPhoneNum(String number) throws RegistrationException {
        String regex = "^[1-9][0-9]\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if( matcher.matches() == false ) {
            throw new RegistrationException("Invalid Phone Number");
        }
        return matcher.matches();
    }

    //rule4 for valid pass: minimum 8 characters, should have atleast 1 upper-case char, atleast 1 numberic num. and have exactly 1 special char.
    public boolean validPassword(String password) throws RegistrationException {
        String rule4 = "^(?=.{8,20}$)(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[.@#$%^&*!][A-Za-z0-9]*$";
        Pattern pattern = Pattern.compile(rule4);
        Matcher matcher = pattern.matcher(password);
        if( matcher.matches() == false ) {
            throw new RegistrationException("Invalid Password");
        }
        return matcher.matches();
    }

}
