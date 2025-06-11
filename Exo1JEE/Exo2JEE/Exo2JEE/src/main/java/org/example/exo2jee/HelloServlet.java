package org.example.exo2jee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.exo2jee.entity.Person;

@WebServlet(name = "person", value = "/person")
public class HelloServlet extends HttpServlet {

    private List<Person> persons;

    public void init() {

        Person person1 = new Person("Sarkozy","Nicolas",70);
persons.add(person1);
        Person person2 = new Person("truc","bidule",20);
        persons.add(person2);
        Person person3 = new Person("Mbappé","Kylian",30);
        persons.add(person3);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

       request.setAttribute("persons", persons);
        getServletContext().getRequestDispatcher("/personJSP.jsp").forward(request,response);

    }

    public void destroy() {
    }
}