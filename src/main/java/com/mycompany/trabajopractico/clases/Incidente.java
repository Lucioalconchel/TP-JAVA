package com.mycompany.trabajopractico.clases;
import com.mycompany.trabajopractico.clases.Problema;

import java.util.List;
import java.util.ArrayList;

public class Incidente {
    private List<Problema> listaProblemas;
    private boolean terminado;
    
    public Incidente(){
        this.listaProblemas = new ArrayList<Problema>();
        this.terminado = false;
    }
    public void setEstado(boolean estado){
        this.terminado = estado;
    }
    public void setProblema(Problema problema){
        this.listaProblemas.add(problema);
    }
    
    public boolean getEstado(){
        if(this.terminado){
            System.out.println("El problema esta resuelto");
        }else{
            System.out.println("El problema no esta resuelto");
        }
        return this.terminado;
    }
    public List<Problema> getListaProblemas(){
        return this.listaProblemas;
    }
}
