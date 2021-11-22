package com.atp.atp53.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.atp.atp53.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria cat = new Categoria();
        cat.setNome(req.getParameter("nome"));
        cat.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.println("Modulo Categoria");
        out.printf("== NOME: %s\n== DESCRICAO: %s",cat.getNome(),cat.getDescricao());
    }
}
