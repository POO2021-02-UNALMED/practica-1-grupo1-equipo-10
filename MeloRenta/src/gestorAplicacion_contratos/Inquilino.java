package gestorAplicacion_contratos;

import java.io.Serializable;
import java.util.*;
import java.time.LocalDate;

import gestorAplicacion_Inmuebles.Inmueble;

public class Inquilino implements Serializable {
    private String documentoIdentidad;
    private String nombreCompleto;
    private String genero;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private Contrato contrato;
    //inicio serializacion    
    private static final long serialVersionUID = 1L;
    private static LinkedList<Inquilino> inquilinos = new LinkedList<Inquilino>();
       
    
    public static LinkedList<Inquilino> getInquilinos() {
		return inquilinos;
	}

	public static void adicionarInquilino(Inquilino inquilino) {
		inquilinos.add(inquilino);
	}
    

	public static void setInquilinos(LinkedList<Inquilino> inquilinos) {
		Inquilino.inquilinos = inquilinos;
	}

	//fin serialización 
    public Inquilino(String documentoIdentidad, String nombreCompleto,
                     String genero, LocalDate fechaNacimiento, String telefono,
                     String correo, Contrato contrato) {

        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.contrato = contrato;
    }

    //getter and setter

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
                "documento_identidad=" + documentoIdentidad +
                ", nombre_completo=" + nombreCompleto +
                ", genero=" + genero +
                ", fecha_nacimiento=" + fechaNacimiento +
                ", telefono=" + telefono +
                ", correo=" + correo +
                ", contrato=" + contrato +
                '}';
    }
}
