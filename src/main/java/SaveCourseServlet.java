
import pckg.Course;
import pckg.Teacher;
import reposit.CourseRepo;
import reposit.TeacherRepo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveCourseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Course course = new Course();


        course.setTeacher(req.getParameter("teacher"));
        course.setName(req.getParameter("name"));
        course.setSpecialty(req.getParameter("specialty"));

        course.setCoursNumber(Integer.parseInt(req.getParameter("coursNumber")));
        course.setSemesterNumber(Integer.parseInt(req.getParameter("semesterNumber")));

        course.setCountStudents(Integer.parseInt(req.getParameter("countStudents")));
        course.setLectures(Integer.parseInt(req.getParameter("lectures")));
        course.setPractick(Integer.parseInt(req.getParameter("practick")));
        course.setLab(Integer.parseInt(req.getParameter("lab")));

        course.setFormControl(req.getParameter("formControl"));
        course.setPractick(Integer.parseInt(req.getParameter("controlWork")));
        course.setAvarageHours();

        try {
            course.setId(Integer.parseInt(req.getParameter("id")));
        } catch(NumberFormatException e) {}
        if(course.getId() == null) {
            CourseRepo.create(course);
        } else {
            CourseRepo.update(course);
        }

        resp.sendRedirect(req.getContextPath() + "/index.html");
    }
}