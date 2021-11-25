<%@page import="java.util.ArrayList, com.atp.atp53.model.Categoria"%>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de categorias</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
    <h1>Lista de Categorias</h1>
    <form action="/atp53-1/categoria/listar" method="get">
        Nome: <input type="text" name="nome" id="nome">
        <input type="submit" value="Filtar">
    </form>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>NOME</th>
                <th>DESCRICAO</th>
            </tr>
        </thead>
        <tbody>
            <%for (Categoria model : categorias) {%>
                <tr>
                    <td><%=model.getId()%></td>
                    <td><%=model.getNome()%></td>
                    <td><%=model.getDescricao()%></td>
                    <td>
                        <a href="">Alterar</a>
                        <a href="/atp53-1/categoria/deletar?id=<%=model.getId()%>">Excluir</a>
                    </td>
                </tr>
            <%}%>
        </tbody>
    </table>

    <a class="pagina-principal" href="../index.jsp">Página Inicial</a>
</body>
</html>