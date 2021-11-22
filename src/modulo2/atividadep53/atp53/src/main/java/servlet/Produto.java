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
        String parametroValor = req.getParameter("valor");

        PrintWriter out = resp.getWriter();
        out.println("Modulo Produto");
        out.printf("== PRODUTO: %s\n",nome);
        if (parametroIdCat != null && parametroValor != null) {
            int id_categoria = Integer.parseInt(parametroIdCat);
            Float valor = Float.parseFloat(parametroValor);
            out.printf("==VALOR: %.2f\n== ID_CATEGORIA: %d",valor,id_categoria);
        } else if(parametroIdCat != null){
            int id_categoria = Integer.parseInt(parametroIdCat);
            out.printf("== ID_CATEGORIA: %d",id_categoria);
        } else if(parametroValor != null){
            Float valor = Float.parseFloat(parametroValor);
            out.printf("== VALOR: %.2f",valor);
        }
        
    }
}
