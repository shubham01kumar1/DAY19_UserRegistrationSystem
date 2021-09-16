public class RegistrationException extends Exception {
    public RegistrationException(String invalid_first_name) {
        super(invalid_first_name);
    }
}
