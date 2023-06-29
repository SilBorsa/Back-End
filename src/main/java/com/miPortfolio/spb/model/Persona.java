package com.miPortfolio.spb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idPersona;
    
    @NotNull
    private String nombrePersona;
    private String apellidoPersona;
    private String subTitulo;
    private String emailPersona;
    private String celuPersona;
    private String acercaPersona;
    private String url_imgPersona;

    //constructor vacio
    public Persona() {
    }

    //constructor con parametros
    public Persona(String nombrePersona, 
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
    public int getIdPersona() {
        return idPersona;
    }

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
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

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
    

    
