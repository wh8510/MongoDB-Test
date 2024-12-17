package org.example.mongodbtest.service;

import org.example.mongodbtest.mogodb.CommentDB;
import org.example.mongodbtest.model.po.Comment;
import org.example.mongodbtest.service.Impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: 张文化
 * @Description: $
 * @DateTime: 2024/12/16$ 23:14$
 * @Params: $
 * @Return $
 */
@Service
@Transactional
public class CommentService implements CommentServiceImpl {
    @Autowired
    public CommentDB commentDB;
    /**
     * 保存评论
     * @Param comment
     */
    @Override
    public void saveComment(Comment comment) {
        commentDB.save(comment);
    }
    /**
     * 更新评论
     * @Param comment
     */
    @Override
    public void updateComment(Comment comment) {
        commentDB.save(comment);
    }
    /**
     * 根据id删除评论
     * @Param id
     */
    @Override
    public void deleteCommentById(String id) {
        commentDB.deleteById(id);
    }
    /**
     * 查询所有评论
     * @return
     */
    @Override
    public List<Comment> findCommentList(){
        return commentDB.findAll();
    }
    /**
     * 根据id查询评论
     * @return
     */
    @Override
    public Comment findCommentById(String id){
        return commentDB.findById(id).get();
    }
}
