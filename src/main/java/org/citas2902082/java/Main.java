package org.citas2902082.java;

import java.time.LocalDateTime;
import java.time.Month;

import org.citas2902082.java.entities.Especialidad;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.TipoIdentificacion;
// import java.time.LocalDateTime;
import org.citas2902082.java.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Medico medicito1 = new Medico(1, "Denys", "Fontecha", TipoIdentificacion.CC, 1234554, 54,
                Especialidad.DERMATOLOGIA);
        Paciente pacientecito = new Paciente(1, "John", "Solorsano", TipoIdentificacion.PASSPORT, 1564813584,
                "Example@gmail.com", 12365478, LocalDateTime.of(2006, Month.OCTOBER, 30, 12, 1), 1.79, 71.5,
                TipoSangre.AB, '+');
        int id = medicito1.getId();
        String nombre = medicito1.getNombres();
        Especialidad esp = medicito1.getEspecialidad();
        int idpa = pacientecito.getId();
        String nombrepa = pacientecito.getNombres();
        TipoSangre ts = pacientecito.getTipoSangre();
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(esp);
        System.out.println(idpa);
        System.out.println(nombrepa);
        System.out.println(ts);
    }
}