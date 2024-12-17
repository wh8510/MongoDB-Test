package org.example.mongodbtest.service.Impl;

import org.example.mongodbtest.model.po.Comment;

import java.util.List;

/**
 * @Author: 张文化
 * @Description: $
 * @DateTime: 2024/12/16$ 23:14$
 * @Params: $
 * @Return $
 */
public interface CommentServiceImpl {
    void saveComment(Comment comment);

    void updateComment(Comment comment);

    void deleteCommentById(String id);

    List<Comment> findCommentList();

    Comment findCommentById(String id);
}
