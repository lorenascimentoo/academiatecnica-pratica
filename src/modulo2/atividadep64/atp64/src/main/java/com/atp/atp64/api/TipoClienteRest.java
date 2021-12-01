package com.atp.atp64.api;

import java.util.List;

import com.atp.atp64.model.TipoCliente;
import com.atp.atp64.repository.TipoClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteRest {
    @Autowired
    private TipoClienteRepository tClienteRepository;

    @PostMapping
    public String create(@RequestBody TipoCliente model){
        tClienteRepository.save(model);
        return "SALVO COM SUCESSO";
    }

    @GetMapping
    public List<TipoCliente> read(){
        return (List<TipoCliente>)tClienteRepository.findAll();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody TipoCliente model){
        if (id == model.getId()) {
            tClienteRepository.save(model);
            return "ALTERADO COM SUCESSO";
        }
        return "OS VALORES DE ID ESTÃO DIVERGENTES";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        tClienteRepository.deleteById(id);
        return "DELETADO COM SUCESSO";
    }
}
