package com.example.demo_hibeJpa.repository;


import com.example.demo_hibeJpa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
