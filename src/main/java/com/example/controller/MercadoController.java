package com.example.controller;

import com.example.service.MercadoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MercadoController {
    private final MercadoService mercadoService;


    public MercadoController(MercadoService mercadoService) {
        this.mercadoService = mercadoService;
    }

    @GetMapping("/home")
    public String home (){
        return "home";
    }
}

