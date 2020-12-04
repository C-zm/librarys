package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Book;
import czm.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showBook")
    public Object findBookAll(){
        List<Book> list = bookService.showBook();
        String BookJson= JSON.toJSONString(list);
        return BookJson;
    }
    @GetMapping("/showBookLimit")
    public Object findBookManageLimit(Integer page, Model model){
        List<Book> bookList = bookService.showLimitBook((page - 1)*10);
        String BookJson= JSON.toJSONString(bookList);
        return BookJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addBook")
    public String addBook(Book book){
        int count = bookService.addBook(book);
        if(count > 0) {
            return "ok";
        }
        else
            return "error";
        /*
        Object a = this.findBookAll();
//        return "redirect:/book/showBook";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param bid
     * @return
     */
    @GetMapping("/getBookById")
    public String getBookById(Integer bid){
        try{
            System.out.println(bid);
            Book book = bookService.getBookById(bid);
            System.out.println(book);
            String BookJson= JSON.toJSONString(book);
            return BookJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("getBookByKeyword")
    public Object getBookByKeyword(String bname){
        List<Book> list = bookService.getBookByKeyword(bname);
        String BookJson= JSON.toJSONString(list);
        return BookJson;
    }

    @GetMapping("getBookByBtype")
    public Object getBookByBtype(String btype){
        List<Book> list = bookService.getBookByBtype(btype);
        String BookJson= JSON.toJSONString(list);
        return BookJson;
    }

    @GetMapping("/updateBook")
    public String updateBook(Book book){
        System.out.println(book.getIsnew());
        int count = bookService.updateBook(book);
        System.out.println(count);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteBook")
    public String deleteBook(Integer bid){
        int count = bookService.deleteBook(bid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
