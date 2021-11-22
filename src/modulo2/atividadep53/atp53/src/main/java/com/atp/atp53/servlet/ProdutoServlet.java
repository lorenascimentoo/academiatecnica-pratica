package com.atp.atp53.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.atp.atp53.model.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto prod = new Produto();
        prod.setNome(req.getParameter("nome"));
        String parametroIdCat = req.getParameter("id_categoria");
        String parametroValor = req.getParameter("valor");

        PrintWriter out = resp.getWriter();
        out.println("Modulo Produto");
        out.printf("== PRODUTO: %s\n",prod.getNome());
        if (parametroIdCat != null && parametroValor != null) {
             prod.setId_categoria(Integer.parseInt(parametroIdCat));
             prod.setValor(Float.parseFloat(parametroValor));
            out.printf("==VALOR: %.2f\n== ID_CATEGORIA: %d",prod.getValor(),prod.getId_categoria());
        } else if(parametroIdCat != null){
            prod.setId_categoria(Integer.parseInt(parametroIdCat));
            out.printf("== ID_CATEGORIA: %d",prod.getId_categoria());
        } else if(parametroValor != null){
            prod.setValor(Float.parseFloat(parametroValor));
            out.printf("== VALOR: %.2f",prod.getValor());
        }
    }
}
