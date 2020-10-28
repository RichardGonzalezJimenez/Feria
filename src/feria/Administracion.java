package feria;

public class Administracion extends Tickets{
    private int cantidadPorVender;
    private int cantidadDePersonas;

    public Administracion(int cantidadPorVender, int cantidadDePersonas, int precios, int cedula, Boolean menorDeEdad) {
        super(precios, cedula, menorDeEdad);
        this.cantidadPorVender = cantidadPorVender;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getCantidadPorVender() {
        return cantidadPorVender;
    }

    public void setCantidadPorVender(int cantidadPorVender) {
        this.cantidadPorVender = cantidadPorVender;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
    
}
