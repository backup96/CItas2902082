package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitasENFERMEROS extends Cita {
    String procedimiento;
    String enfermero;

    public CitasENFERMEROS(int id, LocalDateTime fecha, LocalTime hora, Medico medico, Paciente paciente,
            Consultorio consultorio, String procedimiento, String paciente2, String enfermero) {
        super(id, fecha, hora, medico, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

}
