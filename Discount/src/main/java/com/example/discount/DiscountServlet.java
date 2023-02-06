package com.example.discount;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double DiscountAmount = Float.parseFloat(request.getParameter("DiscountAmount"));
        double ListPrice = Float.parseFloat(request.getParameter("ListPrice"));
        double DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        DiscountAmount = ListPrice * DiscountPercent * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>DiscountAmount: " + DiscountAmount + "</h1>");
        writer.println("</html>");

    }
}
