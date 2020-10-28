package feria;

import java.util.Date;

public class Taquilla extends Feria{
    private int cantidadVendidos;
    private String nombreComprador;
    
    public Taquilla(String nombre, 
            int numeroDeTrabajadores, 
            Date fechaDeApertura, 
            String especialidad, 
            int numeroDePersonas, 
            Boolean nacional){
        super(nombre,
                numeroDeTrabajadores,
                fechaDeApertura,
                especialidad,
                numeroDePersonas, 
                nacional);
    }
}
