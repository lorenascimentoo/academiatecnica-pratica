<%@page import="com.atp.atp53.model.Categoria"%>

<%
    Categoria model = (Categoria)request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Categorias - Atualização</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
    <h1>Atualização de Categoria</h1>
    <form action="/atp53-1/categoria/alterar" method="post">
        id: <input type="text" name="id" id="id" value="<%=model.getId()%>"><br/>
        nome: <input type="text" name="nome" id="nome" value="<%=model.getNome()%>"><br/>
        descricao: <input type="text" name="descricao" id="descricao" value="<%=model.getDescricao()%>"><br/>
        <input type="submit" value="Salvar">
    </form>
    <a class="pagina-principal" href="../index.jsp">Página Inicial</a>
</body>
</html>