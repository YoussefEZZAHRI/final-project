package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Visite;

public interface IVisiteRepository extends JpaRepository<Visite, Long> {

}
