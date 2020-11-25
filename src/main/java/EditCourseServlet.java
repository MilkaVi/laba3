import pckg.Course;
import pckg.Teacher;
import reposit.CourseRepo;
import reposit.TeacherRepo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditCourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            Integer id = Integer.parseInt(req.getParameter("id"));
            Course course = CourseRepo.readById(id);
            System.out.println("edit " + course);
            req.setAttribute("course", course);
        } catch(NumberFormatException e) {}
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/editCourse.jsp")
                .forward(req, resp);
    }
}
