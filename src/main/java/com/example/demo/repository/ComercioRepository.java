package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Comercios;

//@Repository
public interface ComercioRepository extends JpaRepository<Comercios, Long> {

    // @Transactional
    // @Modifying
    @Query(value = "call system.print_contact(:id)", nativeQuery = true)
    List<Object[]> verStoreProcedure(@Param("id") int id);

    @Procedure("print_contact")
    List<Object[]> verStoreProcedure2(@Param("id") int id);

    @Query(value = " select * from comercios", nativeQuery = true)
    List<Object[]> listar();
}
