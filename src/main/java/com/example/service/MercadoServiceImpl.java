package com.example.service;

import com.example.entities.Mercado;
import com.example.repository.MercadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MercadoServiceImpl implements MercadoService {
    private final MercadoRepository mercadoRepo;
    @Override
    public List<Mercado> findAll() {
        return null;
    }
}
