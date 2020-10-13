
package feria;

import java.util.Date;

//Este es un nuevo comentario 

public class Feria { 
    
    private String nombre; //Este es el nombre de la FERIA
    private int numeroDeTrabajadores; //Trabajadores contratados 
    private Date fechaDeApertura; //Fecha en la que se fundó la FERIA
    private String especialidad; //tipo de distraccion.
    private int numeroDePersonas; //Personas que etran a las Aracciones Mecanicas 
    private Boolean nacional;
    private boolean internacional;
    private boolean internacionalal;
    private boolean getInternacional;

    private Feria(String dead_amazing, int par, Date date, String juegos_mecanicos, boolean par1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(int numeroDePersonas) {
        this.numeroDePersonas = numeroDePersonas;
    }
    
    //Este es el constructor de clase 
public Feria(
        String nombre, int numeroDeTrabajadores, Date fechaDeApertura, String especialidad, int numeroDePersonas, Boolean nacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeApertura = fechaDeApertura;
        this.especialidad = especialidad;
        this.numeroDePersonas = numeroDePersonas;
        this.nacional = nacional;
    }

private void ampliarPlanta() {
        this.numeroDeTrabajadores += 100;
    }

private boolean getInternacional() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    //apartir de esta linea se encuentran los metodos de get y set 
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
        Feria feriaUno;
        feriaUno = new Feria(
                "Dead amazing",
                200,
                new Date(),
                "juego mecanico", 
                false );
        Feria feriaDos = new Feria(
                "the curb of the dead",
                100,
                new Date(),
                "juego mecanico",
                true); 
        
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.getNumeroDeTrabajadores());
        System.out.println(feriaUno.getInternacional());
        
        feriaUno.ampliarPlanta();
        
        System.out.println(feriaUno.getNombre());
        System.out.println(feriaUno.getNumeroDeTrabajadores());
        System.out.println(feriaUno.getInternacional());
        
    }
    }
