function deletar(event) {
    event.preventDefault();

    let id = document.getElementById('id');

    usuario = {
        "id": id.value,
    };

    let usuarios = JSON.parse(localStorage.getItem("usuarios"));
    let valido = false;

    for (let i = 0; i < usuarios.length; i++) {
        if (usuarios[i].id == usuario.id) {
            usuarios.splice(i,1);

            localStorage.setItem("usuarios",JSON.stringify(usuarios));
            valido = true;
            break;
        }
    }

    if (valido) {
        alert("== USUÁRIO EXCLUIDO! ==")
    } else {
        alert("O ID informado é inválido!");
    }
}