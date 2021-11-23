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

        //Para enviar a resposta da requisicao de inserção
        PrintWriter out = resp.getWriter();
        out.printf("CATEGORIA CADASTRADA COM SUCESSO!!\n == ID %d GERADO!",model.getId());
    }
}
