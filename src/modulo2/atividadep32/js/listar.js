window.onload = function(){
    //carregando os dados de localStorage
    let viagens = JSON.parse(localStorage.getItem("viagens"));
    let tbody = document.getElementById("corpo-tabela");
    //para escrever no html
    tbody.innerHTML = "";
    
    viagens.forEach(v => {
        tbody.innerHTML += "<tr>"
            + "<td>"+v.id+"</td>"
            + "<td>"+v.cidade+"</td>"
            + "<td>"+v.estado+"</td>"
            + "<td>"+v.data_ida+"</td>"
            + "<td>"+v.data_retorno+"</td>"
          +"</tr>";
    });
}