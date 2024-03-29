package com.miPortfolio.spb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Redes {
    @NotNull
    private int idPersona;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRed;
    @NotNull
    private String nombreRed;
    private String urlRed;
    private String url_imgRed;

    //constructor vacio
    public Redes() {
    }

    //constructor con parametros
    public Redes(int idPersona, 
                 String nombreRed, 
                 String urlRed, 
                 String url_imgRed) {
        this.idPersona = idPersona;
        this.nombreRed = nombreRed;
        this.urlRed = urlRed;
        this.url_imgRed = url_imgRed;
    }

    //getters
    public int getIdPersona() {
        return idPersona;
    }

    public int getIdRed() {
        return idRed;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public String getUrlRed() {
        return urlRed;
    }

    public String getUrl_imgRed() {
        return url_imgRed;
    }
       
    //setters
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
     
    public void setIdRed(int idRed) {
        this.idRed = idRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public void setUrlRed(String urlRed) {
        this.urlRed = urlRed;
    }

    public void setUrl_imgRed(String url_imgRed) {
        this.url_imgRed = url_imgRed;
    }
}
