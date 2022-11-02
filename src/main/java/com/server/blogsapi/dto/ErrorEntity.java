package com.server.blogsapi.dto;

import lombok.Data;

@Data
public class ErrorEntity {

    private String status;

    private String msg;
}
