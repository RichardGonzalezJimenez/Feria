
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
    
    //Composicion y Agregacion
    private Tickets entrada = null;
    private Juegos juegosMecanicos;

    public Tickets getEntrada() {
        return entrada;
    }

    public void setEntrada(Tickets entrada) {
        this.entrada = entrada;
    }

    public Juegos getJuegosMecanicos() {
        return juegosMecanicos;
    }

    public void setJuegosMecanicos(Juegos juegosMecanicos) {
        this.juegosMecanicos = juegosMecanicos;
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
        this.juegosMecanicos = new Juegos("la rueda y el 360", "juegos fuertes", true);
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
                20,
                false );
        
        Tickets boletos = new Tickets(30000, 
                110988650, 
                false);
        
        feriaUno.setEntrada(boletos);
        
        System.out.println("Precio:");
        System.out.println(feriaUno.getEntrada().getPrecios());
        System.out.println("Cedula de ciudadania:");
        System.out.println(feriaUno.getEntrada().getCedula());
        System.out.println("Menor de edad:");
        System.out.println(feriaUno.getEntrada().getMenorDeEdad());
        
    }
  
}
