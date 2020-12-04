package czm.library.controller.sysuser;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Book;
import czm.library.pojo.Page;
import czm.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookManageController {

    @Autowired
    private BookService bookService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showBookManage")
    public Object findBookManageAll(Model model){
        List<Book> bookList = bookService.showBook();
        model.addAttribute("bookList",bookList);
        return "book";
    }

    @GetMapping("/showBookManageLimit")
    public Object findBookManageLimit(Integer page,Model model){
        List<Book> bookList = bookService.showLimitBook((page - 1)*10);
        model.addAttribute("bookList",bookList);
        int count = bookService.getBookCount();
        List<Page> pageList = new ArrayList<>();
        for (int i = 0; i < Math.ceil((float)count/10); i ++){
            String href = "showBookManageLimit?page=" + (i + 1);
            pageList.add(new Page((i+1),href));
        }
        model.addAttribute("pageList",pageList);
        return "book";
    }

    @GetMapping("/getBookManageById")
    @ResponseBody
    public Book getBookManageById(Integer bid){
        Book book = bookService.getBookById(bid);
        return book;

    }

    @GetMapping("/updateBookManage")
    public String updateBookManage(Book book){
        bookService.updateBook(book);
        return "redirect:showBookManageLimit?page=1";
    }



    @GetMapping("/deleteBookManage")
    @ResponseBody
    public String deleteBookManage(Integer bid){
        bookService.deleteBook(bid);
        return "OK";
    }

    /**
     * 添加用户
     */
    @GetMapping("/addBookManage")
    public String addBookManage(Book book){
        int count = bookService.addBook(book);
        if(count > 0) {
            return "ok";
        }
        else
            return "error";
        /*
        Object a = this.findBookManageAll();
//        return "redirect:/book/showBookManage";
        return a;*/
    }




    @GetMapping("getBookManageByKeyword")
    public Object getBookManageByKeyword(String bname){
        List<Book> list = bookService.getBookByKeyword(bname);
        String BookManageJson= JSON.toJSONString(list);
        return BookManageJson;
    }

    @GetMapping("getBookManageByBtype")
    public Object getBookManageByBtype(String btype){
        List<Book> list = bookService.getBookByBtype(btype);
        String BookManageJson= JSON.toJSONString(list);
        return BookManageJson;
    }



}
