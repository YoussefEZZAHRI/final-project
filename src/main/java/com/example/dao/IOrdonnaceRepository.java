package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Ordonnance;

public interface IOrdonnaceRepository extends JpaRepository<Ordonnance, Long> {

}
