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

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // pega os valores enviados na requisicao
        // atribui os valores ao objeto categoria 
        Categoria model = new Categoria();
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));

        // instancia um objeto dao para operacaoes no BD
        CategoriaDao dao = new CategoriaDao();
        // o metodo create retorna o id gerado, que é atribuido ao objeto categoria
        model.setId(dao.create(model));

        // aqui informa o nome e atributo a ser acessado na pagina
        req.setAttribute("id", model.getId());

        // faz a rota a ser adicionada no servlet
        RequestDispatcher rq = req.getRequestDispatcher("categoria-sucesso.jsp");
        // passa a requisicao e o resposta para que a rota funcione
        rq.forward(req, resp);
        
    }
}
