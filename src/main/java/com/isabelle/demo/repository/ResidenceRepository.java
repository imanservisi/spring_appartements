package com.isabelle.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.isabelle.demo.entity.Residence;

@RepositoryRestResource(path = "rest")
public interface ResidenceRepository extends JpaRepository<Residence, Long> {

    // List<Residence> findByNomResidence(String nomResidence);
}
