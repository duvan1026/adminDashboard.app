package com.managment.admindashboard.controllers;


import com.managment.admindashboard.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Duvan");
        usuario.setApellido("Castro");
        usuario.setEmail("duvancastro1026@gmail.com");
        usuario.setTelefono("3156802266");
        return usuario;
    }

//    @PostMapping(value = "usuario")
//    public Usuario editarUsuario(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Duvan");
//        usuario.setApellido("Castro");
//        usuario.setEmail("duvancastro1026@gmail.com");
//        usuario.setTelefono("3156802266");
//        return usuario;
//    }
//
//
//    @DeleteMapping(value = "usuario")
//    public Usuario deleteUsuario(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Duvan");
//        usuario.setApellido("Castro");
//        usuario.setEmail("duvancastro1026@gmail.com");
//        usuario.setTelefono("3156802266");
//        return usuario;
//    }
//
//
//    @GetMapping(value = "usuario")
//    public Usuario Usuario(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Duvan");
//        usuario.setApellido("Castro");
//        usuario.setEmail("duvancastro1026@gmail.com");
//        usuario.setTelefono("3156802266");
//        return usuario;
//    }
}
