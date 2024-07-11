package org.example.exo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="monServletJSP", value = "/monservlet-jsp")
public class MonServletJsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //le forward est nécessaire car il faut transmettre la requête et la réponse (le servlet dans ce cas juste d'intermédiaire)
        req.getRequestDispatcher("/WEB-INF/pageC.jsp").forward(req, resp);

        //la pageC sera ainsi accessible en ajoutant "/monservlet-jsp" dans l'url alors qu'elle est dans WEB-INF
    }
}
