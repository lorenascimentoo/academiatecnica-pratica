function cadastrar(event){
    event.preventDefault();

    let cidade = document.getElementById('cidade');
    let estado = document.getElementById('estado');
    let valor = document.getElementById('valor');
    let data_ida = document.getElementById('data_ida');
    let data_retorno = document.getElementById('data_retorno');
    let id = getRandomInt();

    console.log(cidade.value);
    console.log(estado.value);
    console.log(valor.value);
    console.log(data_ida.value);
    console.log(data_retorno.value);

    viagem =  {
        "id":id,
        "cidade":cidade.value,
        "estado":estado.value,
        "valor":valor.value,
        "data_ida":data_ida.value, 
        "data_retorno":data_retorno.value};

    let viagens = JSON.parse(localStorage.getItem("viagens"));
    let valido = false;
    
    valido = viagens.forEach( p => {
        if (p.id == viagem.id) {
            console.log("achou");
            return true;
        }
    });
    
    if(!valido){
        viagens.push(viagem);
        localStorage.setItem("viagens",JSON.stringify(viagens));
        alert("VIAGEM CADASTRADA COM SUCESSO!");
    }else{
        alert("A viagem já foi cadastrada!");
    }
}

function getRandomInt() {
    min = Math.ceil(1);
    max = Math.floor(100);
    return Math.floor(Math.random() * (max - min)) + min;
  }