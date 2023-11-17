package com.mycompany.trabajopractico.clases;

import com.mycompany.trabajopractico.Enums.TipoProblema;

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
    
}
