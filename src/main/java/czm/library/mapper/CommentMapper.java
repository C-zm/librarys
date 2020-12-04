package czm.library.mapper;

import czm.library.pojo.Comment;

import java.util.List;

public interface CommentMapper {

    List<Comment> selectAllComment();

    int insert(Comment comment);

    List<Comment> selectCommentByUid(Integer uid);

    List<Comment> selectCommentByBid(Integer bid);

    Comment selectCommentByCid(Integer cid);

    int updateCommentByCid(Comment comment);

    int deleteCommentByCid(Integer cid);

    List<Comment> selectCommentByKeyword(String cdetail);
}