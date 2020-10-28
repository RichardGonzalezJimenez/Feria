package feria;

class Juegos {
    private String name;
    private String clasificacion;
    private Boolean funcionamiento;

    public Juegos(String name, String clasificacion, Boolean funcionamiento) {
        this.name = name;
        this.clasificacion = clasificacion;
        this.funcionamiento = funcionamiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Boolean getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(Boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
    
    
}
