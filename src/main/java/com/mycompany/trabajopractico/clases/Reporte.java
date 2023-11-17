package com.mycompany.trabajopractico.clases;

import java.util.List;
import java.util.ArrayList;

public class Reporte {
    private List<Incidente> incidentes;
    
    public Reporte(){
        this.incidentes = new ArrayList<Incidente>();
    }
    
    public void setIncidente(Incidente incidente){
        this.incidentes.add(incidente);
    }
    public List<Incidente> getIncidentes(){
        return this.incidentes;
    }
}
