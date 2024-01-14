package ian.exceptiondemo.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(BookRepositoryException e) {
        super(e);
    }
}
