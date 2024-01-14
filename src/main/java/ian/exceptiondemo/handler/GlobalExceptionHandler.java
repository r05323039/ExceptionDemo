package ian.exceptiondemo.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        System.out.println("=====GlobalExceptionHandler======");
        log.info("error", e);
        return "exceptionHandler catch Exception";
    }
}
