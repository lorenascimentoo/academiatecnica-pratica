<% 
    int id = (int)request.getAttribute("id");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria cadastrada</title>
</head>
<body>
    <h1>Categoria cadastrada com sucesso!</h1>
    <h5>O id: <strong><%=id%> </strong> foi gerado</h5>
    <br/>
    <a href="/atp53-1/categoria/listar">Listagem</a>
</body>
</html>