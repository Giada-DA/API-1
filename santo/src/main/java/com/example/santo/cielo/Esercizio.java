package com.example.santo.cielo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Esercizio {
    @GetMapping("/nome")
    public String NameController(){
        return "Catalina";
    }
    @PostMapping("/nomeinverso")
    public String nomeCapovolto(){
        StringBuilder nome = new StringBuilder("Renato Zero");
        return nome.reverse().toString();
    }

}
