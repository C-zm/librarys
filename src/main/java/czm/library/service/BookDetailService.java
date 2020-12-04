package czm.library.service;

import czm.library.pojo.BookDetail;

import java.util.List;

public interface BookDetailService {
    int addBookDetail(BookDetail bookDetail);
    List<BookDetail> showBookDetail();
    int deleteBookDetail(Integer bdid);
    int updateBookDetail(BookDetail bookDetail);
    BookDetail getBookDetailById(Integer bdid);
    List<BookDetail> getBookDetailByKeyword(String bname);
}
