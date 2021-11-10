window.onload = function() {
    event.preventDefault();

    let usuarios = JSON.parse(localStorage.getItem("usuarios"));
    console.log(usuarios)

    let tbody = document.getElementById("corpo-tabela");

    tbody.innerHTML = "";

    usuarios.forEach(u => {
        tbody.innerHTML +=
            "<tr>" +
            "<td>" + u.id + "</td>" +
            "<td>" + u.nome + "</td>" +
            "<td>" + u.sobrenome + "</td>" +
            "<td>" + u.cpf + "</td>" +
            "</tr>";
    });
}