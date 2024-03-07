package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitasMEDICOS extends Cita {
    String motivoConsulta;
    Estado estado;

    public CitasMEDICOS(int id, LocalDateTime fecha, LocalTime hora, Medico medico, Paciente paciente,
            Consultorio consultorio, String motivoConsulta, Estado estado) {
        super(id, fecha, hora, medico, paciente, consultorio);
        this.motivoConsulta = motivoConsulta;
        this.estado = estado;
    }

}
