import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {}

    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain)
            throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest)req)
                .getSession(false);
        if(session != null && session.getAttribute("user") != null) {
            chain.doFilter(req, resp);
        } else {
            System.out.println("SecurityFilterr1111111111111");
            ((HttpServletResponse)resp).sendRedirect(
                    ((HttpServletRequest)req).getContextPath()+
                            "/login-form.jsp"
            );
        }
    }

    @Override
    public void destroy() {}
}