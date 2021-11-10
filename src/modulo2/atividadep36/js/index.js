function inicializa(event){
    event.preventDefault();
    var usuarios=[];
    localStorage.setItem("usuarios",JSON.stringify(usuarios));
    alert("SISTEMA PRONTO PARA USO!");
}

