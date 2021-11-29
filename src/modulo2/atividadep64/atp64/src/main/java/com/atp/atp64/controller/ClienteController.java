package com.atp.atp64.controller;

import java.util.List;

import com.atp.atp64.model.Cliente;
import com.atp.atp64.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    private ClienteRepository cRepository;

    public ClienteController(ClienteRepository rep) {
        this.cRepository = rep;
    }

    @PostMapping("/cliente/salvar") //endpoint para salvar
    public String create(Cliente model){
        cRepository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente") //endpoint para listar
    public String read(Model req){
        List<Cliente> lista = (List<Cliente>)cRepository.findAll();
        req.addAttribute("clientes", lista);
        return "clientes";
    }

    @GetMapping("/cliente/editar/{id}")//endpoint para delecao
    // o metodo recebe o valor do endpoint passado como parametro
    public String update(@PathVariable int id,Model req){
        Cliente model = cRepository.findById(id).get();
        req.addAttribute("cliente", model);
        return "cliente-form";
    }

    @GetMapping("/cliente/deletar/{id}")//endpoint para delecao
    // o metodo recebe o valor do endpoint passado como parametro
    public String delete(@PathVariable int id){
        cRepository.deleteById(id);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/cadastrar")//endpoint para exibir o formulario
    public String formulario(Model req){
        Cliente model = new Cliente();
        req.addAttribute("cliente", model);
        return "cliente-form";
    }

}
