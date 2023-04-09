package com.example.controller;

import com.example.entities.Mercado;
import com.example.service.MercadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MercadoController {
    private final MercadoService mercadoService;
    public MercadoController(MercadoService mercadoService) {
        this.mercadoService = mercadoService;
    }
    @GetMapping("/main")
    public String main (Model model){
        List<Mercado> mercados = mercadoService.findAll();
        model.addAttribute("mensaje","Listado de mercados de Alcorcón");
        model.addAttribute("mercados", mercados);

        return "main";
    }
}

