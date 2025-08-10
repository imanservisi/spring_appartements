package com.isabelle.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isabelle.demo.entity.Lot;
import com.isabelle.demo.entity.Residence;
import com.isabelle.demo.repository.ResidenceRepository;
import com.isabelle.demo.service.ResidenceService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ResidenceRESTController {

    @Autowired
    ResidenceService residenceService;

    @Autowired
    ResidenceRepository residenceRepository;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Residence> getAllResidences() {
        return residenceService.getAllResidences();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public Residence getResidencebyId(@PathVariable("id") Long id) {
        return residenceService.getResidence(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Residence createResidence(@RequestBody Residence residence) {
        return residenceService.saveResidence(residence);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Residence updateResidence(@RequestBody Residence residence) {
        return residenceService.updateResidence(residence);
    }
    
    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    public void deleteResidence(@PathVariable("id") Long id) {
        residenceService.deleteResidenceById(id);
    }

    @GetMapping("/{id}/lots")
    public List<Lot> getLotsByResidence(@PathVariable("id") Long id) {
        Residence residence = residenceRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Résidence non trouvée avec l'id : " + id));
        return residence.getLots();
    }
}
