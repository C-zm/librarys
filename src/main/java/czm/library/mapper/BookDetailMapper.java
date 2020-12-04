package czm.library.mapper;

import czm.library.pojo.BookDetail;

import java.util.List;

public interface BookDetailMapper {

    List<BookDetail> selectAllBookDetail();

    int insert(BookDetail bookdetail);

    BookDetail selectBookDetailById(Integer bdid);

    int updateBookDetailById(BookDetail bookdetail);

    int deleteBookDetailById(Integer bdid);

    List<BookDetail> selectBookDetailByKeyword(String bname);
}