package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ComercioRepository;
import com.example.demo.service.PruebaService;

@Service
public class PruebaImplService implements PruebaService {

    @Autowired
    ComercioRepository comercioRepository;

    @Override
    public void mostrar() {
        List<Object[]> listaObj = new ArrayList<>();
        listaObj = comercioRepository.verStoreProcedure2(1);
        // List<Object[]> ver = comercioRepository.listar();
        System.out.println("llega" + listaObj.size());

    }

}
