package com.isabelle.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelle.demo.entity.Residence;

public interface ResidenceRepository extends JpaRepository<Residence, Long> {

    List<Residence> findByNomResidence(String nomResidence);
}
