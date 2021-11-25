package com.atp.atp53.servlet;

import java.io.IOException;

import com.atp.atp53.dao.CategoriaDao;
import com.atp.atp53.model.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/carregar")
public class CategoriaBuscarIdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // pega o parametro de id a ser deletado
        int id = Integer.parseInt(req.getParameter("id"));

        // inicializa um objeto dao de categoria
        CategoriaDao dao = new CategoriaDao();

        // busca a categoria a ser atualizada no banco
        Categoria model = dao.readById(id);

        // passa esse atributo para ser carregado na resposta
        req.setAttribute("model", model);

        // faz o redirecionamento da rota para a resposta
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterar.jsp");
        rd.forward(req, resp);
    }
}
