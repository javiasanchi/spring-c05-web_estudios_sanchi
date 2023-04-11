package com.example.service;

import com.example.entities.Mercado;
import com.example.repository.MercadoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class MercadoServiceImpl implements MercadoService {
    private final MercadoRepository mercadoRepo;
    @Override
    public List<Mercado> findAll() {
        log.info("Encontrar todos los mercados findAll()");
        return mercadoRepo.findAll();
    }

    @Override
    public Optional<Mercado> findById(Long id) {
        log.info("Encontrar por id findById{}", id);
        return mercadoRepo.findById(id);
    }

    @Override
    public Mercado save(Mercado mercado) {
        return mercadoRepo.save(mercado);
    }

    @Override
    public void deleteById(Long id) {
        mercadoRepo.deleteById(id);
    }

    @Override
    public List<Mercado> findByNumPuestos(Integer puestos) {
        return mercadoRepo.findByNumPuestos(puestos);
    }
}
