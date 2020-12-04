package czm.library.service.impl;

import czm.library.mapper.BookMapper;
import czm.library.pojo.Book;
import czm.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public int addBook(Book book){
        return bookMapper.insert(book);
    }

    @Override
    public List<Book> showLimitBook(Integer page) {
        return bookMapper.selectlimitBook(page);
    }

    @Override
    public List<Book> showBook() {
        System.out.println("============================");
        System.out.println(bookMapper.selectAllBook());
        return bookMapper.selectAllBook();
    }

    @Override
    public Book getBookById(Integer bid) {
        System.out.println(bookMapper.selectBookById(bid));
        return bookMapper.selectBookById(bid);
    }

    @Override
    public List<Book> getBookByKeyword(String bname) {
        return bookMapper.selectBookByKeyword(bname);
    }

    @Override
    public List<Book> getBookByBtype(String btype) {
        return bookMapper.selectBookByBtype(btype);
    }

    @Override
    public int getBookCount() {
        return bookMapper.selectBookCount();
    }

    @Override
    public int deleteBook(Integer bid) {
        return bookMapper.deleteBookById(bid);
    }


    @Override
    public int updateBook(Book book) {
        System.out.println(book);
        return bookMapper.updateBookById(book);
    }
}
