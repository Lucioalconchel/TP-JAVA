package com.mycompany.trabajopractico;

import com.mycompany.trabajopractico.Enums.SistemaOperativo;
import com.mycompany.trabajopractico.clases.Cliente;
import java.util.List;
import java.util.ArrayList;

public class TrabajoPractico {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setListaSistemas(SistemaOperativo.WINDOWS);
        System.out.println(cliente1.getSistemasOperativos());
    }
}
