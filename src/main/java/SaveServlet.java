
import pckg.Teacher;
import reposit.TeacherRepo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Teacher teacher = new Teacher();


        teacher.setSecondName(req.getParameter("secondName"));
        teacher.setName(req.getParameter("name"));
        teacher.setLastName(req.getParameter("lastName"));

        teacher.setDegree(req.getParameter("degree"));
        teacher.setRank(req.getParameter("rank"));
        teacher.setPosition(req.getParameter("position"));

        teacher.setSex(req.getParameter("sex"));
        teacher.setDate(req.getParameter("date"));
        teacher.setCountCourse(Integer.valueOf(req.getParameter("countCourse")));


        try {
            teacher.setId(Integer.parseInt(req.getParameter("id")));
        } catch(NumberFormatException e) {}
        if(teacher.getId() == null) {
            TeacherRepo.create(teacher);
        } else {
            TeacherRepo.update(teacher);
        }

        resp.sendRedirect(req.getContextPath() + "/index.html");
    }
}