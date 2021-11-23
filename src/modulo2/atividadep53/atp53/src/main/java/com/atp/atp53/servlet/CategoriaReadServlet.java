package com.atp.atp53.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.atp.atp53.dao.CategoriaDao;
import com.atp.atp53.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Para enviar a resposta da requisicao
        PrintWriter out = resp.getWriter();
        // instancia um objeto dao para operacaoes no BD
        CategoriaDao dao = new CategoriaDao();
        
        out.println("========== LISTA DE CATEGORIAS ==========");
        // laco para impressao das categorias cadastradas no BD
        for (Categoria model : dao.read()) {
            out.printf("== ID: %d | == NOME: %s | == DESCRICAO: %s\n", model.getId(), model.getNome(), model.getDescricao());
        }
    }
}
