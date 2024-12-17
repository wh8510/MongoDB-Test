package org.example.mongodbtest.service.Impl;

import org.example.mongodbtest.model.po.Comment;

import java.util.List;

/**
 * mongodb ServiceImpl
 *
 * @author 张文化
 * @date 2024/12/17
 */
public interface CommentServiceImpl {
    void saveComment(Comment comment);

    void updateComment(Comment comment);

    void deleteCommentById(String id);

    List<Comment> findCommentList();

    Comment findCommentById(String id);
}
