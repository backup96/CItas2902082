package org.citas2902082.java.entities;

public class Medico {
    public int id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public int numeroIdentificación ;
    public int registroMedico;
    public Especialidad especialidad;
    
    public Medico() {
    }

    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación, int registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

}
