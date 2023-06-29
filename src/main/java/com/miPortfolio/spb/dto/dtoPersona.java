package com.miPortfolio.spb.dto;

import jakarta.validation.constraints.NotNull;


public class dtoPersona {
    @NotNull
    private String nombrePersona;
    private String apellidoPersona;
    private String subTitulo;
    private String emailPersona;
    private String celuPersona;
    private String acercaPersona;
    private String url_imgPersona;

    //constructor vacio
    public dtoPersona() {
    }

    //constructor con parametros
    public dtoPersona(String nombrePersona, 
                      String apellidoPersona, 
                      String subTitulo, 
                      String emailPersona, 
                      String celuPersona, 
                      String acercaPersona, 
                      String url_imgPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.subTitulo = subTitulo;
        this.emailPersona = emailPersona;
        this.celuPersona = celuPersona;
        this.acercaPersona = acercaPersona;
        this.url_imgPersona = url_imgPersona;
    }

    //getters
    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public String getCeluPersona() {
        return celuPersona;
    }

    public String getAcercaPersona() {
        return acercaPersona;
    }

    public String getUrl_imgPersona() {
        return url_imgPersona;
    }

    //setters
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public void setCeluPersona(String celuPersona) {
        this.celuPersona = celuPersona;
    }

    public void setAcercaPersona(String acercaPersona) {
        this.acercaPersona = acercaPersona;
    }

    public void setUrl_imgPersona(String url_imgPersona) {
        this.url_imgPersona = url_imgPersona;
    }
    
    
    
}
