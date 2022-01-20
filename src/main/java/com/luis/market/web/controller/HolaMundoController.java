package com.luis.market.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebaController")
public class HolaMundoController {

    @Value("${value.name}")
    private String name;

    @GetMapping("/")
    public String saludar(){
        return "Nunca pares de aprender " + name;
    }
}
