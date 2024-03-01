package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Paciente {
    public int id;
    public String nombres ;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public int numeroIdentificación ;
    public String correoElectronico;
    public int celular;
    public LocalDateTime fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre tipoSangre ;
    public char factorRH;
    
    public Paciente() {
    }

    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación, String correoElectronico, int celular, LocalDateTime fechaNacimiento, Double altura,
            Double peso, TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

}
