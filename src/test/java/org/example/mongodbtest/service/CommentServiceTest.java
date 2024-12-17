package org.example.mongodbtest.service;

import org.example.mongodbtest.model.po.Comment;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 张文化
 * @Description: $
 * @DateTime: 2024/12/16$ 23:36$
 * @Params: $
 * @Return $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CommentServiceTest {
    @Autowired
    private CommentService commentService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void saveComment() {
        Comment comment = new Comment();
        comment.setId("11");
        comment.setArticleId("article001");
        comment.setContent("你好我今天很开心");
        comment.setUserId("1011");
        comment.setNickname("张文化");
        comment.setCreateDatetime(LocalDateTime.now());
        comment.setLikeNum(100);
        comment.setReplyNum(10000);
        comment.setState("active");
        comment.setParentId("null");
        mongoTemplate.insert(comment);
//        commentService.saveComment(comment);
    }

    @Test
    void updateComment() {
    }

    @Test
    void deleteCommentById() {
    }

    @Test
    void findCommentList() {
        List<Comment> commentList = commentService.findCommentList();
        System.out.println(commentList);
    }

    @Test
    void findCommentById() {
        Comment comment = commentService.findCommentById("11");
        System.out.println(comment);
    }
}