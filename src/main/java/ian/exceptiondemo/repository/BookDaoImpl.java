package ian.exceptiondemo.repository;

import ian.exceptiondemo.exception.BookRepositoryException;
import ian.exceptiondemo.pojo.Book;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> findAll() throws BookRepositoryException {
        try {
            List<Book> books = List.of(new Book(111,"name","author"));
            if (true)
                throw new IOException();
            return books;
        } catch (IOException e) {
            throw new BookRepositoryException(e);
        }finally {
            System.out.println("BookDaoImpl finally");
        }
    }
}
