package org.example.mongodbtest.controller;

import org.example.mongodbtest.common.BaseResponse;
import org.example.mongodbtest.model.po.Comment;
import org.example.mongodbtest.service.CommentService;
import org.example.mongodbtest.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * mongodb api
 *
 * @author 张文化
 * @date 2024/12/17
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    public CommentService commentService;
    /**
     * 获取mongodb信息集合
     *
     * @return 结果
     */
    @GetMapping("/get")
    public BaseResponse<List<Comment>> getCommentList(){
        return ResultUtil.success(commentService.findCommentList());
    }
    /**
     * 根据id获取mongodb单个信息
     *
     * @return 结果
     */
    @GetMapping("/get/{id}")
    public BaseResponse<Comment> getCommentById(@PathVariable("id") String id){
        return ResultUtil.success(commentService.findCommentById(id));
    }
}
