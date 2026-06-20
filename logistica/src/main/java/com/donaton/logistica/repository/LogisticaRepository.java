package com.donaton.logistica.repository;

import com.donaton.logistica.entity.Logistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticaRepository extends JpaRepository<Logistica, Long> {

}

