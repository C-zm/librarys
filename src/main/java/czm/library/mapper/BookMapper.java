package czm.library.mapper;

import czm.library.pojo.Book;

import java.util.List;

public interface BookMapper {

    List<Book> selectAllBook();

    List<Book> selectlimitBook(Integer page);

    int insert(Book book);

    Book selectBookById(Integer bid);

    int updateBookById(Book book);

    int deleteBookById(Integer bid);

    List<Book> selectBookByKeyword(String bname);

    List<Book> selectBookByBtype(String btype);

    int selectBookCount();
}