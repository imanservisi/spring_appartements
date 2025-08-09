package com.isabelle.demo.service;

import java.util.List;

import com.isabelle.demo.entity.Residence;

public interface ResidenceService {
    Residence saveResidence(Residence residence);
    Residence updateResidence(Residence residence);
    void deleteResidence(Residence residence);
    void deleteResidenceById(Long id);
    Residence getResidence(Long id);
    List<Residence> getAllResidences();
}
