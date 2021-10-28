
function excluir(event){
    event.preventDefault();

    let id = document.getElementById('id');

    let viagens = JSON.parse(localStorage.getItem("viagens"));
    let valido = false;
    let indice;

    for (let i = 0; i < viagens.length; i++) {
        console.log(viagens[i].id);
        if (viagens[i].id == id.value) {
            viagens.splice(i,1);
            localStorage.setItem("viagens",JSON.stringify(viagens));
            valido = true;
            break;
        } 
    }

    
    if(valido){
        alert("VIAGEM EXCLUIDA COM SUCESSO!");
    }else{
        alert("O ID INFORMADO É INVÁLIDO!");
    }
}