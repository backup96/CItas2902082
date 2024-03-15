package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitasMEDICOS extends Cita implements AGENDABLE {
    private String motivoConsulta;
    private Estado estado;
    private String medico;

    public CitasMEDICOS(int id,
            LocalDateTime fecha,
            LocalTime hora,
            String medico,
            String paciente,
            int consultorio,
            String motivoConsulta,
            Estado estado) {
        super(id, fecha, hora, medico, paciente, consultorio);
        this.motivoConsulta = motivoConsulta;
        this.estado = estado;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Override
    public void agendarCita(LocalDateTime fecha, LocalTime hora) {
        this.setFecha(fecha);
        this.setHora(hora);

    }

    @Override
    public void cancelarCita() {
        this.estado = Estado.CANCELADA;
    }

    @Override
    public void reagendarCita(LocalDateTime fecha, LocalTime hora) {
        this.setFecha(fecha);
        this.setHora(hora);
    }

}
