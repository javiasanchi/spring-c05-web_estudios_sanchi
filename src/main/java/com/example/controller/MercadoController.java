package com.example.controller;

import com.example.entities.Mercado;
import com.example.service.MercadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class MercadoController {
    private final MercadoService mercadoService;

    @GetMapping("/main")
    public String findAll (Model model){
        List<Mercado> mercados = mercadoService.findAll();
        model.addAttribute("mensaje","Listado de mercados de Alcorcón");
        model.addAttribute("mercados", mercados);

        return "main";
    }
    @GetMapping("/main/{id}")
    public String findById (Model model, @PathVariable Long id){
        Optional<Mercado> mercaOpt = mercadoService.findById(id);
        if (mercaOpt.isPresent())
            model.addAttribute("mercado", mercaOpt.get());

        else
            model.addAttribute("error","MERCADO NO EXISTE O NO SE ENCUENTRA");
                return "info";
        }





    }



