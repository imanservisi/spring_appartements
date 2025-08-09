package com.isabelle.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomLot;
    private Date dateAchat;
    private Date dateVente;

    @ManyToOne
    private Residence residence;

    public Lot() {
        super();
    }

    public Lot(String nomLot, Date dateAchat, Date dateVente) {
        super();
        this.nomLot = nomLot;
        this.dateAchat = dateAchat;
        this.dateVente = dateVente;
    }
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomLot() {
        return this.nomLot;
    }

    public void setNomLot(String nomLot) {
        this.nomLot = nomLot;
    }

    public Date getDateAchat() {
        return this.dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Date getDateVente() {
        return this.dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }


    public Residence getResidence() {
        return this.residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nomLot='" + getNomLot() + "'" +
            ", dateAchat='" + getDateAchat() + "'" +
            ", dateVente='" + getDateVente() + "'" +
            "}";
    }
}
