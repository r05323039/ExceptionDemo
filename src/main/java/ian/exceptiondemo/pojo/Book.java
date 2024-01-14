package ian.exceptiondemo.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Book {
    private final Integer id;
    private final String name;
    private final String author;
}
