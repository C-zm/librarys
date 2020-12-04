package czm.library.service.impl;
import czm.library.mapper.BookDetailMapper;
import czm.library.pojo.BookDetail;
import czm.library.service.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class BookDetailServiceImpl implements BookDetailService {

    @Autowired
    private BookDetailMapper bookDetailMapper;

    public int addBookDetail(BookDetail bookDetail){
        return bookDetailMapper.insert(bookDetail);
    }

    @Override
    public List<BookDetail> showBookDetail() {
        return bookDetailMapper.selectAllBookDetail();
    }

    @Override
    public BookDetail getBookDetailById(Integer bdid) {
        System.out.println(bookDetailMapper.selectBookDetailById(bdid));
        return bookDetailMapper.selectBookDetailById(bdid);
    }

    @Override
    public List<BookDetail> getBookDetailByKeyword(String bname) {
        return bookDetailMapper.selectBookDetailByKeyword(bname);
    }

    @Override
    public int deleteBookDetail(Integer bdid) {
        return bookDetailMapper.deleteBookDetailById(bdid);
    }


    @Override
    public int updateBookDetail(BookDetail bookDetail) {
        return bookDetailMapper.updateBookDetailById(bookDetail);
    }
}
