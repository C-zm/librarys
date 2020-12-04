package czm.library.service;

import czm.library.pojo.Comment;

import java.util.List;

public interface CommentService {
    int addComment(Comment comment);
    List<Comment> showComment();
    int deleteComment(Integer cid);
    int updateComment(Comment comment);
    Comment getCommentByCid(Integer cid);
    List<Comment> getCommentByUid(Integer uid);
    List<Comment> getCommentByBid(Integer bid);
    List<Comment> getCommentByKeyword(String cdetail);
}
