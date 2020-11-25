package reposit;

import mapping.CourseMapping;
import org.springframework.jdbc.core.JdbcTemplate;
import pckg.Course;

import java.util.ArrayList;
import java.util.List;

import static pckg.BDconfig.getJdbcTemplate;

public class CourseRepo {
    private static JdbcTemplate jdbcTemplate = getJdbcTemplate();
    private static List<Course> courses = new ArrayList<Course>();

    public static List<Course> readAll() {
        String sql = "SELECT * FROM course";
        return (jdbcTemplate.query(sql, new CourseMapping()));
    }


    public static Course readById(Integer id) {
        String sql = "select * from course where id = " + id.toString();
        return jdbcTemplate.query(sql, new CourseMapping()).get(0);
    }

    public static List<Course> readByTeacher(String teacher) {
        String sql = "select * from course where teacher = " + teacher;
        return jdbcTemplate.query(sql, new CourseMapping());
    }




    public static void create(Course course) {
        jdbcTemplate.update(
                "INSERT INTO public.course (teacher, name, specialty, \"coursNumber\", \"semesterNumber\", \"countStudents\"," +
                        " lectures, practick, lab, \"formControl\", \"controlWork\", \"avarageHours\")" +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)",
                course.getTeacher(), course.getName(), course.getSpecialty() , course.getCoursNumber(), course.getSemesterNumber(), course.getCountStudents(),
                course.getLectures(), course.getPractick(), course.getLab(), course.getFormControl(), course.getControlWork(), course.getAvarageHours());

    }
    public static void update(Course course) {

        jdbcTemplate.update("update public.course set teacher = ?, name = ?, specialty = ? , \"coursNumber\" = ?, \"semesterNumber\" = ?," +
                        " \"countStudents\" = ?, lectures = ?, practick = ?, lab = ?, \"formControl\" = ?, \"controlWork\" = ?, \"avarageHours\" = ?" +
                        " where id = ?", course.getTeacher(), course.getName(), course.getSpecialty() , course.getCoursNumber(), course.getSemesterNumber(), course.getCountStudents(),
                course.getLectures(), course.getPractick(), course.getLab(), course.getFormControl(), course.getControlWork(), course.getAvarageHours(), course.getId());
    }


    public static void delete(Integer id) {
        jdbcTemplate.update("delete from course where id = ?", id);
    }

}
