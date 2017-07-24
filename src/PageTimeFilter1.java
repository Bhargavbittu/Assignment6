import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vankayab on 7/19/2017.
 */
@WebFilter(filterName = "PageTimeFilter1")
public class PageTimeFilter1 implements Filter {
    long time;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        time=System.currentTimeMillis();
        req.setAttribute("time",time);
        Databasemet.insertdb("servlet1",System.currentTimeMillis()-time);
       chain.doFilter(req, resp);

}

    public void init(FilterConfig config) throws ServletException {


    }

}
