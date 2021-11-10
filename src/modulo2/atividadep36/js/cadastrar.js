function cadastrar(event){
    event.preventDefault();
    
    let nome = document.getElementById('nome');
    let sobrenome = document.getElementById('sobrenome');
    let cpf = document.getElementById('cpf');
    let id = getRandomInt();

    usuario = {
        "id" : id,
        "nome" : nome.value,
        "sobrenome": sobrenome.value,
        "cpf": cpf.value
    };

    let usuarios = JSON.parse(localStorage.getItem("usuarios"));
    let valido = false;

    for (let i = 0; i < usuarios.length; i++) {
        if(usuarios[i].id == id){
            valido = true;
        }
    }

    if(!valido){
        usuarios.push(usuario);
        localStorage.setItem("usuarios",JSON.stringify(usuarios));
        alert("== USUÁRIO CADASTRADO! ==")
    } else{
        alert("Erro no sistema ao gerar o ID, tente novamente!");
    }
}

function getRandomInt(){
    min = Math.ceil(1);
    max = Math.floor(100);

    return Math.floor(Math.random()*(max-min)) + min;
}