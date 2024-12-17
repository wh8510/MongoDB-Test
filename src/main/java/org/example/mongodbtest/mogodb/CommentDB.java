package org.example.mongodbtest.mogodb;

import org.example.mongodbtest.model.po.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
* @Author: 张文化
* @Description: $
* @DateTime: 2024/12/17$ 08:40$
* @Params: $
* @Return $
*/public interface CommentDB extends MongoRepository<Comment,String> {
}
