package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitasENFERMEROS extends Cita implements AGENDABLE {
    String procedimiento;
    String enfermero;

    public CitasENFERMEROS(int id, LocalDateTime fecha, LocalTime hora,
            String medico,
            String paciente,
            int consultorio, String procedimiento, String paciente2, String enfermero) {
        super(id, fecha, hora, medico, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha, LocalTime hora) {
        this.setFecha(fecha);
        this.setHora(hora);
    }

    @Override
    public void cancelarCita() {

    }

    @Override
    public void reagendarCita(LocalDateTime fecha, LocalTime hora) {
        this.setFecha(fecha);
        this.setHora(hora);
    }
}
