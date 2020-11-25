package reposit;

import org.springframework.jdbc.core.JdbcTemplate;
import pckg.Teacher;
import mapping.TeacherMapping;

import java.util.ArrayList;
import java.util.List;

import static pckg.BDconfig.getJdbcTemplate;

public class TeacherRepo {
    private static JdbcTemplate jdbcTemplate = getJdbcTemplate();
    private static List<Teacher> teachers = new ArrayList<Teacher>();

    public static List<Teacher> readAll() {
        String sql = "SELECT * FROM teacher";
        return (jdbcTemplate.query(sql, new TeacherMapping()));
    }


    public static Teacher readById(Integer id) {
        String sql = "select * from teacher where id = " + id.toString();
        return jdbcTemplate.query(sql, new TeacherMapping()).get(0);
    }



    public static void create(Teacher teacher) {
        jdbcTemplate.update(
                "INSERT INTO public.teacher (\"secondName\", name, \"lastName\", degree, rank, position, sex, date, \"countCourse\") " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                teacher.getSecondName(), teacher.getName(), teacher.getLastName(),teacher.getDegree(), teacher.getRank(),teacher.getPosition(),
                teacher.getSex(), teacher.getDate(), teacher.getCountCourse()
                 );
    }

    public static void update(Teacher teacher) {

        jdbcTemplate.update("update public.teacher set \"secondName\" = ?, name = ?, \"lastName\" = ? , degree = ?, rank = ?," +
                        " position = ?, sex = ?, date = ?, \"countCourse\" = ?" +
                        " where id = ?", teacher.getSecondName(), teacher.getName(), teacher.getLastName(),teacher.getDegree(), teacher.getRank(),teacher.getPosition(),
                teacher.getSex(), teacher.getDate(), teacher.getCountCourse(), teacher.getId());
    }


    public static void delete(Integer id) {
        jdbcTemplate.update("delete from teacher where id = ?", id);
    }

}
