package com.managment.admindashboard.controllers;


import com.managment.admindashboard.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
;       usuario1.setId(2L);
        usuario1.setNombre("Duvan");
        usuario1.setApellido("Castro");
        usuario1.setEmail("duvancastro1026@gmail.com");
        usuario1.setTelefono("3156802266");

        Usuario usuario2 = new Usuario();
        usuario2.setId(3L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzales");
        usuario2.setEmail("maria.gon@gmail.com");
        usuario2.setTelefono("3256555");

        Usuario usuario3 = new Usuario();
        usuario3.setId(4L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("alaiga124@gmail.com");
        usuario3.setTelefono("45685222");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
