package czm.library.service;

import czm.library.pojo.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);
    List<Book> showLimitBook(Integer page);
    List<Book> showBook();
    int deleteBook(Integer bid);
    int updateBook(Book book);
    Book getBookById(Integer bid);
    List<Book> getBookByKeyword(String bname);
    List<Book> getBookByBtype(String btype);
    int getBookCount();
}
