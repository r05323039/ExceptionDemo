package ian.exceptiondemo.service;


import ian.exceptiondemo.exception.BookNotFoundException;
import ian.exceptiondemo.exception.BookRepositoryException;
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
        try {
            List<Book> books = bookDao.findAll();
            return books;
        } catch (BookRepositoryException e) {
            throw new BookNotFoundException(e);
        }
    }
}
