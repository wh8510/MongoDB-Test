package org.example.mongodbtest.mogodb;

import org.example.mongodbtest.model.po.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * mongodb 数据层
 *
 * @author 张文化
 * @date 2024/12/17
 */
public interface CommentDB extends MongoRepository<Comment,String> {
}
