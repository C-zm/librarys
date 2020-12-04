package czm.library.controller.user;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.BookDetail;
import czm.library.service.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookDetail")
public class BookDetailController {

    @Autowired
    private BookDetailService bookDetailService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showBookDetail")
    public Object findBookDetailAll(){
        List<BookDetail> list = bookDetailService.showBookDetail();
        String BookDetailJson= JSON.toJSONString(list);
        return BookDetailJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addBookDetail")
    public String addBookDetail(BookDetail bookDetail){

        int count = bookDetailService.addBookDetail(bookDetail);
        if(count > 0)
            return "ok";
        else
            return "error";
        /*
        Object a = this.findBookDetailAll();
//        return "redirect:/bookDetail/showBookDetail";
        return a;*/
    }

    /**
     * 查询某个用户
     * @param bdid
     * @return
     */
    @GetMapping("/getBookDetailById")
    public String getBookDetailById(Integer bdid){
        try{
            System.out.println(bdid);
            BookDetail bookDetail = bookDetailService.getBookDetailById(bdid);
            System.out.println(bookDetail);
            String BookDetailJson= JSON.toJSONString(bookDetail);
            return BookDetailJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getBookDetailByKeyword")
    public Object getBookDetailByKeyword(String bname){
        List<BookDetail> list = bookDetailService.getBookDetailByKeyword(bname);
        String BookDetailJson= JSON.toJSONString(list);
        return BookDetailJson;
    }

    @GetMapping("/updateBookDetail")
    public String updateBookDetail(BookDetail bookDetail){
        int count = bookDetailService.updateBookDetail(bookDetail);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteBookDetail")
    public String deleteBookDetail(Integer bdid){
        int count = bookDetailService.deleteBookDetail(bdid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
