package org.example.exo1jee;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "txtBrut", value = "/txtBrut")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "LE TEXTE BRUT POUR CRICRI";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // txtBrut
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}