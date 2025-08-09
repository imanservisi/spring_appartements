package com.isabelle.demo.service;

import java.util.List;

import com.isabelle.demo.entity.Lot;

public interface LotService {

    Lot saveLot(Lot lot);
    Lot updateLot(Lot lot);
    void deleteLot(Lot lot);
    void deleteLotById(Long id);
    Lot getLot(Long id);
    List<Lot> getAllLots();
}
