
package feria;

import java.util.Date;

//este es un nuevo comentario 

public class Feria { 
    
    private String nombre;
    private int numeroDeTrabajadores;
    private Date fechaDeApertura;
    private String especialidad;//tipo de distraccion.
    private int numeroDePersonas;
    private Boolean nacional;

    public int getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(int numeroDePersonas) {
        this.numeroDePersonas = numeroDePersonas;
    }
    
public Feria(
            String nombre, 
            int numeroDeTrabajadores,
            Date fechaDeApertura,
            String especialidad,
            int numeroDePersonas,
            Boolean nacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeApertura = fechaDeApertura;
        this.especialidad = especialidad;
        this.numeroDePersonas = numeroDePersonas;
        this.nacional = nacional;
    }
    
    //el metodo crea una publicidad de promocion para aumentar los ingresos 
    //economicos base a mayor ingresos de personas en el pais o ciudad.
    public void atraerPersonas(){
    this.numeroDePersonas +=50;
    this.nacional = true;
    }
    
    //este metodo permite que las personas disfruten de la especialidad
    //y quieran una nueva
    public void cliente(
            String especialidad,
            String nuevaEspecialidad){
        this.especialidad = nuevaEspecialidad;
        this.numeroDePersonas += 15;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }
    
    
    
    
    public static void main(String[] args) {
       
    }

} 