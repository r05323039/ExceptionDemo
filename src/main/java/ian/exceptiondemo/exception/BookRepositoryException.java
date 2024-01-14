package ian.exceptiondemo.exception;

import java.io.IOException;

public class BookRepositoryException extends Exception{

    public BookRepositoryException(IOException e) {
        super(e);
    }
}
