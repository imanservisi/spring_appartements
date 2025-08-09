package com.isabelle.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Residence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomResidence;
    private String adresse;

    public Residence() {
        super();
    }

    public Residence(String nomResidence, String adresse) {
        super();
        this.nomResidence = nomResidence;
        this.adresse = adresse;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomResidence() {
        return this.nomResidence;
    }

    public void setNomResidence(String nomResidence) {
        this.nomResidence = nomResidence;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return "Residence [id="
            + id + ", nomResidence=" + nomResidence + ", adresse=" + adresse + "]";
            
    }

}
