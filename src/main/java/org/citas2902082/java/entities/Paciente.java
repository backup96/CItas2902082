package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Paciente extends USUARIOS {
    private String correoElectronico;
    private int celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificación);
    }

    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación, String correoElectronico, int celular, LocalDateTime fechaNacimiento,
            Double altura,
            Double peso, TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificación);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String getInfo() {
        String info = "Nombre: " + nombres + " " + apellidos + " Email: " + correoElectronico + " Tipo de sangre: "
                + tipoSangre + factorRH + " Altura: " + altura + " Peso: " + peso;
        return info;
    }

}
