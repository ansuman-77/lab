package currentDate;

//Import required java libraries

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//Extend HttpServlet class
@WebServlet("/dateandtime")
public class CurrentDate extends HttpServlet{
     public void service(HttpServletRequest request, HttpServletResponse
                    response) throws ServletException, IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    Date today = new Date();
    out.println("<h1>Today Date is : </h1>");
    out.println(today);
  }
}