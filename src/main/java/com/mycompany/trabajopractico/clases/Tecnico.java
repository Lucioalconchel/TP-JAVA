package com.mycompany.trabajopractico.clases;

import java.util.List;
import java.util.ArrayList;

import com.mycompany.trabajopractico.Enums.SistemaOperativo;
import com.mycompany.trabajopractico.Enums.SoporteOperativo;
import com.mycompany.trabajopractico.clases.Incidente;
public class Tecnico {
    private String id;
    private List<SistemaOperativo> especialidadSistema;
    private List<SoporteOperativo> especialidadSoporte;
    private List<Incidente> listaIncidentes;
    boolean estado;
    
    //Constructores
    public Tecnico(){
        this.especialidadSistema = new ArrayList<SistemaOperativo>();
        this.especialidadSoporte = new ArrayList<SoporteOperativo>();
        this.listaIncidentes = new ArrayList<Incidente>();
        this.estado = false;
    }
    public Tecnico(String id){
        this.id = id;
        this.especialidadSistema = new ArrayList<SistemaOperativo>();
        this.especialidadSoporte = new ArrayList<SoporteOperativo>();
        this.listaIncidentes = new ArrayList<Incidente>();
        this.estado = false;
    }
    
    //Setters
    public void setId(String id){
        this.id = id;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setEspecialidadSistema(SistemaOperativo especialidad){
        this.especialidadSistema.add(especialidad);
    }
    public void setEspecialidadSoporte(SoporteOperativo especialidad){
        this.especialidadSoporte.add(especialidad);
    }
    public void setIncidente(Incidente incidente){
        this.estado = true;
        this.listaIncidentes.add(incidente);
    }
    
    //Getters
    public String getId(){
        return this.id;
    }
    public boolean getEstado(){
        if(this.estado){
            System.out.println("El tecnico esta desocupado");
        }else{
            System.out.println("El tecnico esta ocupado");
        }
        return this.estado;
    }
    public List<SistemaOperativo> getEspecialidadSistema(){
        return this.especialidadSistema;
    }
    public List<SoporteOperativo> getEspecialidadSoporte(){
        return this.especialidadSoporte;
    }
    public List<Incidente> getListaIncidentesTotal(){
        return this.listaIncidentes;
    }
}
