function inicializa(event) {
    event.preventDefault();
    var usuarios = [];
    localStorage.setItem("usuarios", JSON.stringify(usuarios));
    alert("SISTEMA PRONTO PARA USO!");
}

function cadastrar() {
    let frame = document.getElementById("frame");
    frame.src = "cadastrar.html";
}

function listar() {
    let frame = document.getElementById("frame");
    frame.src = "listar.html";
}

function alterar() {
    let frame = document.getElementById("frame");
    frame.src = "alterar.html";
}

function deletar() {
    let frame = document.getElementById("frame");
    frame.src = "deletar.html";
}

function inicio(){
    let frame = document.getElementById("frame");
    frame.src = "welcome.html";
}