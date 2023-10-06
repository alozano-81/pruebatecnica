package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/prueba")
public class test {

    // @Autowired
    // PruebaService pruebaService;

    @GetMapping("/entrar")
    public ResponseEntity<String> pruebaNavi() {

        // pruebaService.mostrar();
        System.out.println("llega");

        return new ResponseEntity<>("OKi", HttpStatus.ACCEPTED);
    }

}
