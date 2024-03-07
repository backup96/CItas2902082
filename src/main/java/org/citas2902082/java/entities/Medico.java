package org.citas2902082.java.entities;

public class Medico extends USUARIOS {

    private int registroMedico;
    private Especialidad especialidad;

    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificación);
    }

    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación, int registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificación);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public int getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(int registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}
