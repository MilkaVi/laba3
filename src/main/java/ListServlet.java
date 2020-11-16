import pckg.MyObject;

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
        Collection<MyObject> objects = Storage.readAll();
        Set<String> best = new HashSet<>();
        double i = 0;
        for(MyObject o:objects){
            if(i<o.getAvarageMark())
                i = o.getAvarageMark();
        }
        for(MyObject o:objects){
           if(o.getAvarageMark()==i)
               best.add((o.getGroup()));
        }
        String bests = best.toString();

        req.setAttribute("bests", bests);
        req.setAttribute("objects", objects);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp")
                .forward(req, resp);
    }
}