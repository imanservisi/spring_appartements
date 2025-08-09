package com.isabelle.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isabelle.demo.entity.Residence;
import com.isabelle.demo.repository.ResidenceRepository;

@Service
public class ResidenceServiceImpl implements ResidenceService {

    @Autowired
    ResidenceRepository residenceRepository;

    public Residence saveResidence(Residence residence) {
        return residenceRepository.save(residence);
    }

    @Override
    public Residence updateResidence(Residence residence) {
        return residenceRepository.save(residence);
    }

    @Override
    public void deleteResidence(Residence residence) {
        residenceRepository.delete(residence);
    }

    @Override
    public void deleteResidenceById(Long id) {
        residenceRepository.deleteById(id);
    }

    @Override
    public Residence getResidence(Long id) {
        return residenceRepository.findById(id).get();
    }

    @Override
    public List<Residence> getAllResidences() {
        return residenceRepository.findAll();
    }
}
