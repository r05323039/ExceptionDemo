package ian.exceptiondemo.handler;

import ian.exceptiondemo.exception.BookNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public String ioHandler(Exception e) {
        System.out.println("=====GlobalExceptionHandler BookNotFoundException======");
        log.info("error", e);
        return "catch BookNotFoundException";
    }
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        System.out.println("=====GlobalExceptionHandler Exception======");
        log.info("error", e);
        return "exceptionHandler catch Exception";
    }
}
