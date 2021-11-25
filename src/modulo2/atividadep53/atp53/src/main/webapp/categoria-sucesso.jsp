<% 
    int id = (int)request.getAttribute("id");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Categoria cadastrada</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Categoria cadastrada com sucesso!</h1>
    <h5>O id: <strong><%=id%> </strong> foi gerado</h5>
    <br/>
    <a href="/atp53-1/categoria/listar">Listagem</a>
    <a class="pagina-principal" href="index.jsp">Página Inicial</a>
</body>
</html>