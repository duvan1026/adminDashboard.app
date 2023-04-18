package com.managment.admindashboard.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("Manzana","Kiwi", "Banana");
    }
}
