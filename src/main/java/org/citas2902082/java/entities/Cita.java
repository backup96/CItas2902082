package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {

    public int id;
    public LocalDateTime fecha;

    public Medico medico;
    public Paciente paciente;
    public Consultorio consultorio;
    
    public Cita() {
    }

    public Cita(int id, LocalDateTime fecha, Medico medico, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }
    

}
