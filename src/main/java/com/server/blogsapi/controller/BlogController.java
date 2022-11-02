package com.server.blogsapi.controller;

import com.server.blogsapi.dto.BlogDTO;
import com.server.blogsapi.dto.ErrorEntity;
import com.server.blogsapi.entity.BlogEntity;
import com.server.blogsapi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/blogs/{id}")
    public BlogDTO getById(@PathVariable("id") int id){
        System.out.println(id);
        BlogDTO entity = null;
        entity = blogService.findBlogById(id);
        return entity;
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Object> findBlogById(@PathVariable("id") int id){
        BlogDTO entity = null;
        entity = blogService.findBlogById(id);
        if(entity.getTitle() != null){
            return new ResponseEntity<>(entity, HttpStatus.OK);
        }
        else{
            ErrorEntity er = new ErrorEntity();
            er.setStatus("Id not Available");
            er.setMsg(String.valueOf(400));
            return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/blogs/blog")
    public List<BlogDTO> findBlog(){
        return blogService.findBlog();
    }

    @GetMapping("/blogs/allBlog")
    public List<BlogEntity> allBlog(){
        return blogService.getAllBlogs();
    }

}
