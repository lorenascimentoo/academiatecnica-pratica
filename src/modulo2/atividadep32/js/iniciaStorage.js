function inicializa(event){
    event.preventDefault();
    var viagens = [];
    localStorage.setItem("viagens",JSON.stringify(viagens));
    alert("SISTEMA PRONTO PARA USO!")
}