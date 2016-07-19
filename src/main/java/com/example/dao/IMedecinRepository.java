package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Medecin;

public interface IMedecinRepository extends JpaRepository<Medecin, Long> {

}
