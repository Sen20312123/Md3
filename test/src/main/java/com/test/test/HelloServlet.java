package com.test.test;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        message = "Bắt đầu servlet!";
    }
    @Override
    protected void service (HttpServletRequest arg0 , HttpServletResponse arg1 ) throws ServletException , IOException{
        super.service(arg0,arg1);

        System.out.println("Phương thức của Request" + arg0.getMethod());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("Kết thúc Servlet");
    }
}