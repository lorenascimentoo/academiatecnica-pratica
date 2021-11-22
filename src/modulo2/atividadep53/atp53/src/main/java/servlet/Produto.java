package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String parametroIdCat = req.getParameter("id_categoria");

        PrintWriter out = resp.getWriter();
        out.println("Modulo Produto");

        if (parametroIdCat != null ) {
            int id_categoria = Integer.parseInt(parametroIdCat);
            out.printf("== PRODUTO: %s \n== ID_CATEGORIA: %d",nome,id_categoria);
        } else{
            out.printf("== PRODUTO: %s",nome);
        }
        
    }
}
