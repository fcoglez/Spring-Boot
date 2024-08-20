package com.course.springboot.webapp.models.dto;

public class ParamsDto {

    private String message;
    private Integer id;

    public String getMessage() {
        return message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
