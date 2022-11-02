package com.server.blogsapi.repository;

import com.server.blogsapi.dto.BlogDTO;
import com.server.blogsapi.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepo extends JpaRepository<BlogEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM blogs")
    List<BlogEntity> getAllBlogs();
}
