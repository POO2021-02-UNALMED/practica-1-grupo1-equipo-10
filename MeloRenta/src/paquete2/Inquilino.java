package paquete2;

import java.util.Date;

public class Inquilino {
    private String documento_identidad;
    private String nombre_completo;
    private String genero;
    private Date fecha_nacimiento;
    private String telefono;
    private String correo;
    private Contrato contrato;

    public Inquilino(String documento_identidad, String nombre_completo,
                     String genero, Date fecha_nacimiento, String telefono,
                     String correo, Contrato contrato) {

        this.documento_identidad = documento_identidad;
        this.nombre_completo = nombre_completo;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.contrato = contrato;
    }

    //getter and setter

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    //fin getter and setter

    
    //falta el metodo toString
    @Override
    public String toString() {
        return "Inquilino{" +
                "documento_identidad=" + documento_identidad +
                ", nombre_completo=" + nombre_completo +
                ", genero=" + genero +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", telefono=" + telefono +
                ", correo=" + correo +
                ", contrato=" + contrato +
                '}';
    }
}
