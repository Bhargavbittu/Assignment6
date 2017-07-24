import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vankayab on 7/19/2017.
 */
@WebServlet(name = "Servlet3")
public class Servlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session=request.getSession(false);
        session.setAttribute("time3",System.currentTimeMillis());
        long time=(long)session.getAttribute("time2");
        Databasemet.insertdb("servlet2",System.currentTimeMillis()-time);
       // request.setAttribute("name","servlet3");
       // request.setAttribute("time",System.currentTimeMillis());
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");

        pw.print("This is form servlet3<br><a href=\"Servlet2\">servlet2</a>");

    }
}
