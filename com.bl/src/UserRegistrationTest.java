import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    //Happy test case for first-name
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean value = false;
        try {
            value = userRegistration.validFirstName("Shubham");
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true, value);
    }

    //Sad test case for first_name
    @Test
    public void givenFirstName_WhenNotValid_shouldThrowAnException() {

        Assertions.assertThrows(RegistrationException.class, ()->
            userRegistration.validFirstName("shubham")
        );
    }

    //Happy test case for last-name
    @Test
    public void givenLastName_whenValid_shouldReturnTrue() {
        boolean value = false;
        try {
            value = userRegistration.validLastName("Kumar");
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true, value);
    }

    //sad test case for last-name
    @Test
    public void givenLastName_whenNotValid_shouldThrowAnException() {
        Assertions.assertThrows(RegistrationException.class, ()->
            userRegistration.validLastName("kumar")
        );
    }

    //Happy test case for Email
    @Test
    public void givenEmail_whenValid_shouldReturnTrue() {
        boolean value = false;
        try {
            value = userRegistration.validEmail("Trump123@bl.co.in");
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true, value);
    }

    //sad test case for Email
    @Test
    public void givenEmail_whenNotValid_shouldThrowAnException() {
        Assertions.assertThrows(RegistrationException.class, ()->
            userRegistration.validEmail("shubham@123.co.in.in")
        );
    }

    //Happy test case for phone number
    @Test
    public void givenPhoneNum_whenValid_shouldReturnTrue() {
        boolean value = false;
        try {
            value = userRegistration.validPhoneNum("91 7879767574");
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true, value);
    }

    //sad test case for phone number
    @Test
    public void givenPhoneNum_whenNotValid_shouldThrowAnException() {
        Assertions.assertThrows(RegistrationException.class, ()->
            userRegistration.validPhoneNum("9173544333")
        );
    }

    //Happy test case for password
    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        boolean value = false;
        try {
            value = userRegistration.validPassword("retake@Action2");
        } catch (RegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true, value);
    }

    //sad test case for password
    @Test
    public void givenPassword_whenNotValid_shouldThrowAnException() {
        Assertions.assertThrows(RegistrationException.class, ()->
            userRegistration.validFirstName("shubham@123")
        );
    }

}