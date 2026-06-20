package com.donaton.logistica.service;

import com.donaton.logistica.entity.Logistica;
import com.donaton.logistica.repository.LogisticaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticaService {

    private final LogisticaRepository repository;

    public LogisticaService(LogisticaRepository repository) {
        this.repository = repository;
    }

    public List<Logistica> listar() {
        return repository.findAll();
    }

    public Logistica guardar(Logistica logistica) {
        return repository.save(logistica);
    }
}

