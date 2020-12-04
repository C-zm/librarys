package czm.library.service.impl;

import czm.library.mapper.CommentMapper;
import czm.library.pojo.Comment;
import czm.library.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public List<Comment> showComment() {
        return commentMapper.selectAllComment();
    }

    @Override
    public int deleteComment(Integer cid) {
        return commentMapper.deleteCommentByCid(cid);
    }

    @Override
    public int updateComment(Comment comment) {
        return commentMapper.updateCommentByCid(comment);
    }

    @Override
    public Comment getCommentByCid(Integer cid) {
        return commentMapper.selectCommentByCid(cid);
    }

    @Override
    public List<Comment> getCommentByUid(Integer uid) {
        return commentMapper.selectCommentByUid(uid);
    }

    @Override
    public List<Comment> getCommentByBid(Integer bid) {
        return commentMapper.selectCommentByBid(bid);
    }

    @Override
    public List<Comment> getCommentByKeyword(String cdetail) {
        return getCommentByKeyword(cdetail);
    }
}