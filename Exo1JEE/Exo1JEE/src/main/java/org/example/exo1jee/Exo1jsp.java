package org.example.exo1jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "exo1jsp", value = "/exo1jsp")
public class Exo1jsp extends HttpServlet {

    private String texte;

    @Override
    public void init() throws ServletException {
        System.out.println("Ma serviette est lancée ! (message dans la methode init)");
        texte = "c'est tipar";
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        getServletContext().getRequestDispatcher("/exo1jesaispas.jsp").forward(req, resp);
    }


}
