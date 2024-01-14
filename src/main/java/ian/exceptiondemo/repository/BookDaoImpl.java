package ian.exceptiondemo.repository;

import ian.exceptiondemo.exception.BookNotFoundException;
import ian.exceptiondemo.pojo.Book;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> findAll() throws BookNotFoundException {
        try {
            List<Book> books = List.of(new Book(111, "name", "author"));
            int ex = 2;
            if (ex == 1)
                throw new IOException();//check例外捕捉轉拋
            if (ex == 2)
                throw new ClassNotFoundException();//check例外捕捉轉拋
            if (ex == 3)
                throw new RuntimeException("DB發生RuntimeException");
            return books;
        } catch (IOException e) {
            throw new BookNotFoundException("DB發生IOException", e);//轉拋可收斂throws方法簽名
        } catch (ClassNotFoundException e) {
            throw new BookNotFoundException("DB發生ClassNotFoundException", e);
        } finally {
            System.out.println("BookDaoImpl finally");//return或throw後，執行finally
        }
    }
}
