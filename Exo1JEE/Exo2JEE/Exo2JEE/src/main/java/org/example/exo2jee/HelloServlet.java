package org.example.exo2jee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.exo2jee.entity.Person;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private List<String> persons;

    public void init() {
        message = "Exo personnes";
        persons = new ArrayList<String>();
        Person person1 = new Person("Sarkozy","Nicolas",70);
        Person person2 = new Person("truc","bidule",20);
        Person person3 = new Person("Mbappé","Kylian",30);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        getServletContext().getRequestDispatcher("/personJSP.jsp").forward(request,response);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}