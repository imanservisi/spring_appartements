package com.isabelle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelle.demo.entity.Residence;

public interface ResidenceRepository extends JpaRepository<Residence, Long> {

}
