package ian.exceptiondemo.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String cause) {
        super(cause);
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
