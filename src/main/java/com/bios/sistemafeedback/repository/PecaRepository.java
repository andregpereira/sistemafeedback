package com.bios.sistemafeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bios.sistemafeedback.model.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {

}
