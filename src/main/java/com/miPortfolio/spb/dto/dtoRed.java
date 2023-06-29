package com.miPortfolio.spb.dto;

import jakarta.validation.constraints.NotNull;

public class dtoRed { 
    @NotNull
    private int idPersona;
    @NotNull
    private String nombreRed;
    private String urlRed;
    private String url_imgRed;

    //constructor vacio
    public dtoRed() {
    }

    //constructor con parametros
    public dtoRed(int idPersona, 
                  String nombreRed, 
                  String urlRed, 
                  String url_imgRed) {
        this.idPersona = idPersona;
        this.nombreRed = nombreRed;
        this.urlRed = urlRed;
        this.url_imgRed = url_imgRed;
    }

    //Getters
    public int getIdPersona() {
        return idPersona;
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
    
    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public void setUrl_Red(String urlRed) {
        this.urlRed = urlRed;
    }

    public void setUrl_imgRed(String url_imgRed) {
        this.url_imgRed = url_imgRed;
    }
}
