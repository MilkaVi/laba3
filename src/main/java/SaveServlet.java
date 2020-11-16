import pckg.MyObject;

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
        MyObject object = new MyObject();
        object.setTickedNum(req.getParameter("tickedNum"));
        object.setGroup(req.getParameter("group"));

        object.setSecondName(req.getParameter("secondName"));
        object.setName(req.getParameter("name"));

        object.setLastName(req.getParameter("lastName"));


        object.setMark1(Integer.parseInt(req.getParameter("mark1")));
        object.setMark2(Integer.parseInt(req.getParameter("mark2")));
        object.setMark3(Integer.parseInt(req.getParameter("mark3")));
        object.setMark4(Integer.parseInt(req.getParameter("mark4")));
        object.setAvarageMark();

        try {
            object.setId(Integer.parseInt(req.getParameter("id")));
        } catch(NumberFormatException e) {}
        if(object.getId() == null) {
            Storage.create(object);
        } else {
            Storage.update(object);
        }

        resp.sendRedirect(req.getContextPath() + "/index.html");
    }
}