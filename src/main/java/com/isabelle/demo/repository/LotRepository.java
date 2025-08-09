package com.isabelle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelle.demo.entity.Lot;

public interface LotRepository extends JpaRepository<Lot, Long> {

    
}
