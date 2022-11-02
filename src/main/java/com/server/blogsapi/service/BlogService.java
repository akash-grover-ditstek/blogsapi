package com.server.blogsapi.service;

import com.server.blogsapi.dto.BlogDTO;
import com.server.blogsapi.entity.BlogEntity;

import java.util.List;

public interface BlogService {
    public List<BlogDTO> findBlog();
    public BlogDTO findBlogById(int id);

    public List<BlogEntity> getAllBlogs();
}
