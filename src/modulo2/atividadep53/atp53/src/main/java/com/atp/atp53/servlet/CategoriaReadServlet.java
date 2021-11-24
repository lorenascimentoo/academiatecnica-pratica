package com.atp.atp53.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.atp.atp53.dao.CategoriaDao;
import com.atp.atp53.model.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // instancia um objeto dao para operacaoes no BD
        CategoriaDao dao = new CategoriaDao();
        String nome = req.getParameter("nome");

        ArrayList<Categoria> categorias;
        
        if(nome != null && nome!=""){
            categorias = dao.read(nome);
        } else {
            categorias = dao.read();
        }

        req.setAttribute("categorias", categorias);
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
        rd.forward(req, resp);
    }
}
