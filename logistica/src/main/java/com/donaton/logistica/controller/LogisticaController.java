package com.donaton.logistica.controller;

import com.donaton.logistica.entity.Logistica;
import com.donaton.logistica.service.LogisticaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logistica")
@CrossOrigin("*")
public class LogisticaController {

    private final LogisticaService service;

    public LogisticaController(LogisticaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Logistica> listar() {
        return service.listar();
    }

    @PostMapping
    public Logistica guardar(@RequestBody Logistica logistica) {
        return service.guardar(logistica);
    }
}


