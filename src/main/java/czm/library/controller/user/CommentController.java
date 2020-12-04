package czm.library.controller.comment;

import com.alibaba.fastjson.JSON;
import czm.library.pojo.Comment;
import czm.library.service.CommentService;
import czm.library.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/showComment")
    public Object showComment(){
        List<Comment> list = commentService.showComment();
        String CommentJson= JSON.toJSONString(list);
        return CommentJson;
    }

    /**
     * 添加用户
     */
    @GetMapping("/addComment")
    public String addComment(Comment comment){

        int count = commentService.addComment(comment);
        if(count > 0)
            return "ok";
        else
            return "error";

    }

    @GetMapping("/getCommentByCid")
    public String getCommentByCid(Integer cid){
        try{
            Comment comment = commentService.getCommentByCid(cid);
            String CommentJson= JSON.toJSONString(comment);
            return CommentJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/getCommentByUid")
    public String getCommentByUid(Integer uid){
        try{
            System.out.println(uid);
            List<Comment> commentList = commentService.getCommentByUid(uid);
            System.out.println(commentList);
            String CommentJson= JSON.toJSONString(commentList);
            return CommentJson;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    @GetMapping("getCommentByBid")
    public Object getCommentByBid(Integer bid){
        List<Comment> list = commentService.getCommentByBid(bid);
        String CommentJson= JSON.toJSONString(list);
        return CommentJson;
    }

    @GetMapping("/updateComment")
    public String updateComment(Comment comment){
        int count = commentService.updateComment(comment);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

    @GetMapping("/deleteComment")
    public String deleteComment(Integer uid){
        int count = commentService.deleteComment(uid);
        if(count > 0)
            return "ok";
        else
            return "error";
    }

}
