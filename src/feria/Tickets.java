package feria;

class Tickets {
    private int precios;
    private int cedula;
    private Boolean menorDeEdad;

    public Tickets(int precios, int cedula, Boolean menorDeEdad) {
        this.precios = precios;
        this.cedula = cedula;
        this.menorDeEdad = menorDeEdad;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Boolean getMenorDeEdad() {
        return menorDeEdad;
    }

    public void setMenorDeEdad(Boolean menorDeEdad) {
        this.menorDeEdad = menorDeEdad;
    }
    
    
}
