package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;

    public Cita() {
    }

    public Cita(int id, LocalDateTime fecha, LocalTime hora, Medico medico, Paciente paciente,
            Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

}
