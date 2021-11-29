package com.atp.atp64.controller;

import java.util.List;

import com.atp.atp64.model.Cliente;
import com.atp.atp64.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    private ClienteRepository cRepository;

    public ClienteController(ClienteRepository rep) {
        this.cRepository = rep;
    }

    @PostMapping("filme/salvar") //endpoint para salvar
    public String create(Cliente model){
        cRepository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("cliente") //endpoint para listar
    public String read(Model req){
        List<Cliente> lista = (List<Cliente>)cRepository.findAll();
        req.addAttribute("clientes", lista);
        return "clientes";
    }

    
    @GetMapping("cliente/form")//endpoint para exibir o formulario
    public String formulario(){
        return "cliente-form";
    }



}
