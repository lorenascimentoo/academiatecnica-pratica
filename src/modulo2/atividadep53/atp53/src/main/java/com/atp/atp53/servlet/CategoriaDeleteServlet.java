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

@WebServlet(urlPatterns = "/categoria/deletar")
public class CategoriaDeleteServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // pega o parametro de id a ser deletado
        int id = Integer.parseInt(req.getParameter("id"));

        // deleta no BD por meio do DAO
        CategoriaDao dao = new CategoriaDao();

        // busca a categoria a ser deletada no banco
        Categoria model = dao.readById(id);

        //se for encontrada uma categoria válida no BD ele deleta
        if (model !=null) {
            // deleta no BD por meio do DAO
            dao.delete(model);
        }

        RequestDispatcher rd = req.getRequestDispatcher("/categoria/listar");
        rd.forward(req, resp);

    }
}
