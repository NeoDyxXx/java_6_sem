package classes;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ttt  extends HttpServlet implements Servlet {

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {
        System.out.println("classes.Ttt:doPost");
        if("OK".equals(rq.getParameter("press")))
        {
            rs.setContentType("text/html");
            PrintWriter pw = rs.getWriter();
            pw.println("<html><body>"
                    +"Surname:        " + rq.getParameter("surname")
                    +"<br>Name:   " + rq.getParameter("name")
                    +"<br>Sex:        " + rq.getParameter("sex")
                    +"</body></html>");
            pw.close();
        }
        else {
            RequestDispatcher rd = rq.getRequestDispatcher("index.html");
            rd.forward(rq, rs);
        }

    }
}
