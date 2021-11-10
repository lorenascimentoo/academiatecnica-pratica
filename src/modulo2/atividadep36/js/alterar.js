function alterar(event) {
    event.preventDefault();

    let id = document.getElementById('id');
    let nome = document.getElementById('nome');
    let sobrenome = document.getElementById('sobrenome');
    let cpf = document.getElementById('cpf');

    usuario = {
        "id": id.value,
        "nome": nome.value,
        "sobrenome": sobrenome.value,
        "cpf": cpf.value
    };

    let usuarios = JSON.parse(localStorage.getItem("usuarios"));
    let valido = false;

    for (let i = 0; i < usuarios.length; i++) {
        if (usuarios[i].id == usuario.id) {
            usuarios.splice(i,1);
            usuarios.push(usuario);

            localStorage.setItem("usuarios",JSON.stringify(usuarios));
            valido = true;
            break;
        }
    }

    if (valido) {
        alert("== USUÁRIO ATUALIZADO! ==")
    } else {
        alert("O ID informado é inválido!");
    }
}