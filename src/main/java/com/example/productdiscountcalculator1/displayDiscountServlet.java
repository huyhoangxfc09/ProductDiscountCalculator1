package com.example.productdiscountcalculator1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "display-discountServlet", value = "/display-discount")
public class displayDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("Product Description");
        double price = Double.parseDouble(request.getParameter("List Price"));
        double discountPercent = Double.parseDouble(request.getParameter("Discount Percent"));
        double discountAmount = price*discountPercent*0.01;
        double discountPrice = price - discountAmount;
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Tên sản phẩm: "+productDescription+"</h3>");
        writer.println("<p>Giá sản phẩm: "+price+"</p>");
        writer.println("<p>Chiết khấu: "+discountAmount+"VND"+"</p>");
        writer.println("<p>Giá sau chiết khấu: "+discountPrice+"</p>");
        writer.println("</html>");
    }
}
