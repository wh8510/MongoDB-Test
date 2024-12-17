package org.example.mongodbtest.service;

import org.example.mongodbtest.model.dto.CommentDTO;
import org.example.mongodbtest.model.mogodb.CommentDB;
import org.example.mongodbtest.model.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张文化
 * @Description: $
 * @DateTime: 2024/12/16$ 23:14$
 * @Params: $
 * @Return $
 */
@Service
public class CommentService {
    @Autowired
    public CommentDB commentDB;
    /**
     * 保存评论
     * @Param comment
     */
    public void saveComment(Comment comment) {
        commentDB.save(comment);
    }
    /**
     * 更新评论
     * @Param comment
     */
    public void updateComment(Comment comment) {
        commentDB.save(comment);
    }
    /**
     * 根据id删除评论
     * @Param id
     */
    public void deleteCommentById(String id) {
        commentDB.deleteById(id);
    }
    /**
     * 查询所有评论
     * @return
     */
    public List<Comment> findCommentList(){
        return commentDB.findAll();
    }
    /**
     * 根据id查询评论
     * @return
     */
    public Comment findCommentById(String id){
        return commentDB.findById(id).get();
    }
}
