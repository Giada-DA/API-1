package com.example.santo.cielo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/echo")
    public String echoName(@RequestParam String name){
        return name;
    }
    @PostMapping("/echoinverso")
    public String nomeCapovolto(String name){
        StringBuilder nome = new StringBuilder(name);
        return nome.reverse().toString();
    }

}
