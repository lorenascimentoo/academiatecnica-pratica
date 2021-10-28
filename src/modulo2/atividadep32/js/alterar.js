
function alterar(event){
    event.preventDefault();

    let id = document.getElementById('id');
    let cidade = document.getElementById('cidade');
    let estado = document.getElementById('estado');
    let valor = document.getElementById('valor');
    let data_ida = document.getElementById('data_ida');
    let data_retorno = document.getElementById('data_retorno');

    viagem =  {
        "id":id.value,
        "cidade":cidade.value,
        "estado":estado.value,
        "valor":valor.value,
        "data_ida":data_ida.value, 
        "data_retorno":data_retorno.value};

    let viagens = JSON.parse(localStorage.getItem("viagens"));
    let valido = false;

    for (let i = 0; i < viagens.length; i++) {
        console.log(viagens[i].id);
        if (viagens[i].id == viagem.id) {
            viagens.splice(i,1);
            viagens.push(viagem);
            localStorage.setItem("viagens",JSON.stringify(viagens));
            valido = true;
            break;
        }
    }
    
    if(valido){
        alert("VIAGEM ATUALIZADA COM SUCESSO!");
    }else{
        alert("O ID INFORMADO É INVÁLIDO!");
    }
}