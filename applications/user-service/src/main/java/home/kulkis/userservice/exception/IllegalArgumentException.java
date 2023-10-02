package home.kulkis.userservice.exception;

public class IllegalArgumentException extends java.lang.IllegalArgumentException {

    public IllegalArgumentException() {
        super("Bad argument provided, check contract of method called!");
    }

    public IllegalArgumentException(String message) {
        super(message);
    }
}
