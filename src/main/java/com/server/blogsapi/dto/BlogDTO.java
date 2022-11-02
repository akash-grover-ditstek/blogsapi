package com.server.blogsapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BlogDTO {

    private int id;
    private int userId;
    private String title;
    private String body;

}
