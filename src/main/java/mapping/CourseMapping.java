package mapping;

import org.springframework.jdbc.core.RowMapper;
import pckg.Course;
import pckg.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseMapping implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet resultSet, int i) throws SQLException {
        Course myObject = new Course();
        myObject.setId(resultSet.getInt("id"));
        myObject.setTeacher(resultSet.getString("teacher"));
        myObject.setName(resultSet.getString("name"));
        myObject.setSpecialty(resultSet.getString("specialty"));
        myObject.setCoursNumber(Integer.parseInt(resultSet.getString("coursNumber")));
        myObject.setSemesterNumber(Integer.parseInt(resultSet.getString("semesterNumber")));
        myObject.setCountStudents(Integer.parseInt(resultSet.getString("countStudents")));
        myObject.setLectures(Integer.parseInt(resultSet.getString("lectures")));
        myObject.setPractick(Integer.parseInt(resultSet.getString("practick")));
        myObject.setLab(resultSet.getInt("lab"));

        myObject.setFormControl(resultSet.getString("formControl"));
        myObject.setControlWork(Integer.parseInt(resultSet.getString("controlWork")));
        myObject.setAvarageHours();
        return myObject;
    }
}
