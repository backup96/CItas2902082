package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

public interface AGENDABLE {
    public void agendarCita(LocalDateTime fecha, LocalTime hora);

    public void cancelarCita();

    public void reagendarCita();
}
