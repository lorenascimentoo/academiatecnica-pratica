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

@WebServlet(urlPatterns = "/categoria/alterar")
public class CategoriaUpdateServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // instanciacao dos objetos necessarios na metodo
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();

        // Pegando os dados da requisicao e inserindo em um model
        model.setId(Integer.parseInt(req.getParameter("id")));
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));

        //faz atualizacao no BD com a dao
        dao.update(model);

        req.setAttribute("id", model.getId());
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterado-sucesso.jsp");
        rd.forward(req, resp);
    }
    
    
    
}
