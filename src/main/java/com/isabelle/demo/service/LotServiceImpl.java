package com.isabelle.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isabelle.demo.entity.Lot;
import com.isabelle.demo.repository.LotRepository;

@Service
public class LotServiceImpl implements LotService {

    @Autowired
    LotRepository lotRepository;

    @Override
    public Lot saveLot(Lot lot) {
        return lotRepository.save(lot);
    }

    public Lot updateLot(Lot lot){
        return lotRepository.save(lot);
    }
    public void deleteLot(Lot lot){
        lotRepository.delete(lot);
    }
    public void deleteLotById(Long id){
        lotRepository.deleteById(id);
    }
    public Lot getLot(Long id){
        return lotRepository.findById(id).get();
    }
    public List<Lot> getAllLots(){
        return lotRepository.findAll();
    }
}
