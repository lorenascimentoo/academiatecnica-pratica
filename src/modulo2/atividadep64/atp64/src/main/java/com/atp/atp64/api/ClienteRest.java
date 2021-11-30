package com.atp.atp64.api;

import java.util.List;

import com.atp.atp64.model.Cliente;
import com.atp.atp64.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteRest {
    
    //essa anotacao faz a injecao de dependencia sem a necessidade da fazer um metodo construtor
    @Autowired
    private ClienteRepository cRepository;

    @PostMapping("/api/cliente")
    public String create(@RequestBody Cliente model){
        // com a anotacao RequestBody ele adiciona ao model os parametros passados
        // indica que a partir do corpo da requisicao será atribuido os valores ao model
        cRepository.save(model);
        return "SALVO COM SUCESSO";
    }

    @GetMapping("/api/cliente")
    public List<Cliente> read(){
        return (List<Cliente>)cRepository.findAll();
    }

    @PutMapping("/api/cliente/{id}")
    public String update(@RequestBody Cliente model, @PathVariable int id){
        // o PathVariable indica o id será passado junto com o endpoint e é marcado pelo {}
        if (model.getId() == id) {
            cRepository.save(model);
            return "ALTERADO COM SUCESSO";
        }
        return "ID DA URL DIFERENTE DO BODY";
    }

    @DeleteMapping("/api/cliente/{id}")
    public String delete(@PathVariable int id){
        cRepository.deleteById(id);
        return "DELETADO COM SUCESSO!";
    }
}
