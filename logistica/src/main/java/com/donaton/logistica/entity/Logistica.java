package com.donaton.logistica.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logistica")
public class Logistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado; // pendiente, en_ruta, entregado
    private String direccionDestino;
    private String fechaEntrega;

    // 🔑 referencia a donaciones
    private Long donacionId;
}