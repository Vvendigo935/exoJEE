package org.example.exo1jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "exo1serv", value = "/exo1serv")
public class ServletExo1 extends HttpServlet {

    private String texte;

    @Override
    public void init() throws ServletException {
        System.out.println("Ma serviette est lancée ! (message dans la methode init)");
        texte = "salut salut";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("une requete GET a ete envoyée a ma serviette !");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<h1>BONJOUR,JE SUIS NICOLAS SARKOZY ET J'AI LE PLAISIR DE LIRE : LE TEMPS DES TEMPETES POUR AUDIBLE</h1>");

        // reponse HTML
        resp.setContentType("text/html");

        out.println("<html><body>");
        out.println("<h1>"+texte+"</h1>");
        out.println("<h2>TITRE LAAAAA</h2>");
        out.println("<h3>ON FAIT DU HTML OU BIEN ??? TAVU</h3>");
        out.println("<img src="+"https://i.kym-cdn.com/entries/icons/facebook/000/039/305/maxresdefault.jpg"+">");
        out.println("</body></html>");







    }



















}
