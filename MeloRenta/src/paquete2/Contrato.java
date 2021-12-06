package paquete2;

import paquete1.Inmueble;

import java.io.File;
import java.util.Date;

public class Contrato {
    private double id;
    private File clausula;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Inmueble inmueble;
    private Inquilino inquilino;

    //falta constructor

    //getter and setter

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public File getClausula() {
        return clausula;
    }

    public void setClausula(File clausula) {
        this.clausula = clausula;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }


    //fin getter and setter

    public void mostrar_contrato(){}

    public void renovarFecha_fin(){}

    public void editarFecha_fin(){}

    public void notificarCierreContrato(){}
}
