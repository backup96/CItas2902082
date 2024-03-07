package org.citas2902082.java.entities;

public abstract class USUARIOS {
    public int id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public int numeroIdentificación;

    protected USUARIOS(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroIdentificación() {
        return numeroIdentificación;
    }

    public void setNumeroIdentificación(int numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }
}
