package com.example.repository;

import com.example.entities.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MercadoRepository extends JpaRepository<Mercado, Long> {

    List<Mercado> findByNumPuestos(Integer numPuestos);


}