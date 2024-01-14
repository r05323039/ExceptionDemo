package ian.exceptiondemo.service;


import ian.exceptiondemo.exception.BookNotFoundException;
import ian.exceptiondemo.pojo.Book;
import ian.exceptiondemo.repository.BookDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> findbooks() throws BookNotFoundException {
        // 可以拋出BookNotFoundException或是catch 返回空陣列
        List<Book> books = bookDao.findAll();
        return books;
    }
}
