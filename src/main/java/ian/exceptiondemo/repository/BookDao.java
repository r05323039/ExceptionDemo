package ian.exceptiondemo.repository;


import ian.exceptiondemo.exception.BookRepositoryException;
import ian.exceptiondemo.pojo.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll() throws BookRepositoryException;
}
