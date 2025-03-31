package com.entity;

import com.db.connections.ConnectionUtil;
import com.entity.model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseTable {

    private static final String QUERY_GET_COURSE_BY_ID = "Select * from courses where id = ?";

    public Course getCourseById(String id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionUtil.getInstance().getConnection();
        PreparedStatement ps = c.prepareStatement(QUERY_GET_COURSE_BY_ID);
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            return new Course(rs);
        }
        rs.close();
        c.close();
        return null;
    }
}
