import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    //Happy test case for first-name
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean value = userRegistration.validFirstName("Shubham");
        Assert.assertEquals(true, value);
    }

    //Sad test case for first_name
    @Test
    public void givenFirstName_WhenNotValid_shouldReturnFalse() {
        boolean value = userRegistration.validFirstName("shubham");
        Assert.assertEquals(false, value);
    }

    //Happy test case for last-name
    @Test
    public void givenLastName_whenValid_shouldReturnTrue() {
        boolean value = userRegistration.validLastName("Kumar");
        Assert.assertEquals(true, value);
    }

    //sad test case for last-name
    @Test
    public void givenLastName_whenNotValid_shouldReturnFalse() {
        boolean value = userRegistration.validLastName("kumar");
        Assert.assertEquals(false, value);
    }

    //Happy test case for Email
    @Test
    public void givenEmail_whenValid_shouldReturnTrue() {
        boolean value = userRegistration.validEmail("akshay123@bl.co.in");
        Assert.assertEquals(true, value);
    }

    //sad test case for Email
    @Test
    public void givenEmail_whenNotValid_shouldReturnFalse() {
        boolean value = userRegistration.validEmail("akshay123@bl.co.in.in");
        Assert.assertEquals(false, value);
    }

    //Happy test case for phone number
    @Test
    public void givenPhoneNum_whenValid_shouldReturnTrue() {
        boolean value = userRegistration.validPhoneNum("91 7879767574");
        Assert.assertEquals(true, value);
    }

    //sad test case for phone number
    @Test
    public void givenPhoneNum_whenNotValid_shouldReturnFalse() {
        boolean value = userRegistration.validPhoneNum("91 787976757");
        Assert.assertEquals(false, value);
    }

    //Happy test case for password
    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        boolean value = userRegistration.validPassword("retake@Action2");
        Assert.assertEquals(true, value);
    }

    //sad test case for password
    @Test
    public void givenPassword_whenNotValid_shouldReturnFalse() {
        boolean value = userRegistration.validPhoneNum("123456");
        Assert.assertEquals(false, value);
    }

}