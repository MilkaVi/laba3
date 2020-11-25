
import pckg.Teacher;
import reposit.TeacherRepo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Collection<Teacher> teachers = TeacherRepo.readAll();

        double i = 0;
        System.out.println(teachers);

        req.setAttribute("teachers", teachers);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp")
                .forward(req, resp);
    }
}