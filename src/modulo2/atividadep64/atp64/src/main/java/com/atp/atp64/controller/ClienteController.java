package com.atp.atp64.controller;

import com.atp.atp64.repository.ClienteRepository;

public class ClienteController {
    private ClienteRepository cRepository;

    public ClienteController(ClienteRepository rep) {
        this.cRepository = rep;
    }
}
