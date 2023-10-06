package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PruebaService;

@RestController
@RequestMapping("api/tecnica")
public class Test {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("/entrar")
    public ResponseEntity<String> pruebaNavi() {

        pruebaService.mostrar();
        System.out.println("llega1");

        return new ResponseEntity<>("OKi", HttpStatus.ACCEPTED);
    }

}
