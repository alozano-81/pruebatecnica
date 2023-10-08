package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Comercios;
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

    @GetMapping(value = "/listarcomercios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Comercios>> listarComercios() {
        List<Comercios> out = null;
        try {
            System.out.println("???");
            out = pruebaService.listarComercios();
            return ResponseEntity.ok(out);

        } catch (Exception ex) {
            // logger.error("[listarContratos]", ex);
            return new ResponseEntity<>(out, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
