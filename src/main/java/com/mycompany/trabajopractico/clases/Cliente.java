package com.mycompany.trabajopractico.clases;

import com.mycompany.trabajopractico.Enums.SistemaOperativo;
import com.mycompany.trabajopractico.Enums.SoporteOperativo;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String razonSocial;
    private String cuil;
    private List<SistemaOperativo> listaSistemas;
    private List<SoporteOperativo> listaSoporte;
    
    
    public Cliente(){
        this.listaSistemas = new ArrayList<SistemaOperativo>();
        this.listaSoporte = new ArrayList<SoporteOperativo>();
    }
    public Cliente(String razonSocial, String cuil){
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.listaSistemas = new ArrayList<SistemaOperativo>();
        this.listaSoporte = new ArrayList<SoporteOperativo>();
    }
    
    //Setters
    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }
    public void setCuil(String cuil){
        this.cuil = cuil;
    }
    public void setListaSistemas(SistemaOperativo sistema){
        this.listaSistemas.add(sistema);
    }
    public void setListaSoporte(SoporteOperativo soporte){
        this.listaSoporte.add(soporte);
    }
    
    //Getters
    public String getRazonSocial(){
        return this.razonSocial;
    }
    public String getCuil(){
        return this.cuil;
    }
    public List<SistemaOperativo> getSistemasOperativos(){
        return this.listaSistemas;
    }
    public List<SoporteOperativo> getSoporteOperativos(){
        return this.listaSoporte;
    }

}
