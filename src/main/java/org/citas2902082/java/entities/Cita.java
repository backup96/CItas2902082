package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private LocalTime hora;
    private String medico;
    private String paciente;
    private int consultorio;

    public Cita() {
    }

    public Cita(int id, LocalDateTime fecha, LocalTime hora,
            String medico,
            String paciente,
            int consultorio) {
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

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

}
