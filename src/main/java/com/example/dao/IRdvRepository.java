package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Rdv;

public interface IRdvRepository extends JpaRepository<Rdv, Long> {

}
