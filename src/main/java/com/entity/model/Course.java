package com.entity.model;

import lombok.Data;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
@ToString
public class Course {
    private String id;
    private String title;
    private String description;

    public Course(String description, String title, String id) {
        super();
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public Course() {
        super();
    }

    public Course(ResultSet rs) throws SQLException {
        this.id = rs.getString("id");
        this.title = rs.getString("title");
        this.description = rs.getString("description");
    }
}
