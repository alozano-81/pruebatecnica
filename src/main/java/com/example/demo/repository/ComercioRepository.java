package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Comercios;

//@Repository
public interface ComercioRepository extends JpaRepository<Comercios, Long> {

}
