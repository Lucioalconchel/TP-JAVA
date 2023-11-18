package com.mycompany.trabajopractico.clases;

import com.mycompany.trabajopractico.Enums.TipoProblema;
import com.mycompany.trabajopractico.clases.Tecnico;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalTime;

public class Problema {
    private String id;
    private String descripcion;
    private TipoProblema gravedad;
    private List<Tecnico> tecnicos;
    private LocalTime fechaTentativa;
    
    public Problema(){
        this.tecnicos = new ArrayList<Tecnico>();
    } 
    public Problema(String id, String descripcion, TipoProblema gravedad, LocalTime fechaTentativa){
        this.id = id;
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.fechaTentativa = fechaTentativa;
        this.tecnicos = new ArrayList<Tecnico>();
    }
    
    public void setId(String id){
        this.id = id;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setTipoProbema(TipoProblema gravedad){
        this.gravedad = gravedad;
    }
    public void setListaTecnico(Tecnico tecnico){
        this.tecnicos.add(tecnico);
    }
    public void setFechaTentativa(LocalTime fechaTentativa){
        this.fechaTentativa = fechaTentativa;
    }
    
    public String getId(){
        return this.id;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public TipoProblema getGravedad(){
        return this.gravedad;
    }
    public List<Tecnico> getListaTecnicos(){
        return this.tecnicos;
    }
    public LocalTime getFechaTentativa(){
        return this.fechaTentativa;
    }
}
