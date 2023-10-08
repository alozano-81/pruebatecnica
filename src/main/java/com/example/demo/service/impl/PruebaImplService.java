package com.example.demo.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Comercios;
import com.example.demo.repository.ComercioRepository;
import com.example.demo.service.PruebaService;

@Service
public class PruebaImplService implements PruebaService {

    @Autowired
    ComercioRepository comercioRepository;

    @Override
    public void mostrar() {
        List<Object[]> listaObj = new ArrayList<>();
        /// listaObj = comercioRepository.verStoreProcedure(1);
        listaObj = comercioRepository.listar();
        System.out.println("llega" + listaObj.size());

    }

    @Override
    public List<Comercios> listarComercios() {
        List<Comercios> out = new ArrayList<>();
        List<Object[]> listaObj = new ArrayList<>();
        listaObj = comercioRepository.listar();

        for (int i = 0; i < listaObj.size(); i++) {
            Comercios c = new Comercios();
            BigDecimal bigDecimal = new BigDecimal(listaObj.get(i)[0].toString());
            c.setIdComercio(bigDecimal.longValue());
            c.setNomComercio(listaObj.get(i)[1].toString());
            System.out.println("tipo " + listaObj.get(i)[2].getClass().getSimpleName());
            c.setAforoMaximo(listaObj.get(i)[2].toString());
            out.add(c);
        }
        return out;
    }

}
