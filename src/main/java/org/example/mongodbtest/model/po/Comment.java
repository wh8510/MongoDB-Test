package org.example.mongodbtest.model.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * comment po
 *
 * @author 张文化
 * @date 2024/12/17
 */
@Data
@Document(collection = "comment")
public class Comment implements Serializable {
    //主id
    public String id;
    //文章id
    public String articleId;
    //评论内容
    public String content;
    //评论人id
    public String userId;
    //评论人昵称
    public String nickname;
    //评论的日期时间
    public LocalDateTime createDatetime;
    //点赞数
    public Integer likeNum;
    //回复数
    public Integer replyNum;
    //状态
    public String state;
    //上级id
    public String parentId;
}
