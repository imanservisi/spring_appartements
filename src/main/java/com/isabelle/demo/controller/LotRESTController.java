package com.isabelle.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isabelle.demo.entity.Lot;
import com.isabelle.demo.service.LotService;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/lots")
@CrossOrigin(origins = "*")
public class LotRESTController {

    @Autowired
    LotService lotService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Lot getLotById(@PathVariable("id") Long id) {
        return lotService.getLot(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Lot createLot(@RequestBody Lot lot) {
        return lotService.saveLot(lot);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Lot updateLot(@RequestBody Lot lot) {
        return lotService.saveLot(lot);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteLot(@PathVariable("id") Long id) {
        lotService.deleteLotById(id);
    }
}
