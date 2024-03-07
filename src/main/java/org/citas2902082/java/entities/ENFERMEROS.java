package org.citas2902082.java.entities;

public class ENFERMEROS extends USUARIOS {
    public ENFERMEROS(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            int numeroIdentificación) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificación);
    }

    @Override
    public String getInfo() {
        String info = "Nombre: " + nombres + " " + apellidos;
        return info;
    }
}
