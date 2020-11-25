package mapping;

import org.springframework.jdbc.core.RowMapper;
import pckg.Teacher;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherMapping implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
        Teacher myObject = new Teacher();
        myObject.setId(resultSet.getInt("id"));
        myObject.setName(resultSet.getString("name"));
        myObject.setSecondName(resultSet.getString("secondName"));
        myObject.setLastName(resultSet.getString("lastName"));
        myObject.setDegree(resultSet.getString("degree"));
        myObject.setRank(resultSet.getString("rank"));
        myObject.setPosition(resultSet.getString("position"));
        myObject.setSex(resultSet.getString("sex"));
        myObject.setDate(resultSet.getString("date"));
        myObject.setCountCourse(resultSet.getInt("countCourse"));
        return myObject;
    }
}
