package ian.exceptiondemo.controller;

import ian.exceptiondemo.exception.BookNotFoundException;
import ian.exceptiondemo.pojo.Book;
import ian.exceptiondemo.service.BookService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> books() throws BookNotFoundException {
        List<Book> findbooks = bookService.findbooks();
        return findbooks;
    }
}
