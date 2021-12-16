package gestorAplicacion_contratos;

import java.io.File;
import java.util.Date;

import gestorAplicacion_Inmuebles.Inmueble;

public class Contrato {
    private double id;
    private File clausula;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Inmueble inmueble;
    private Inquilino inquilino;
    private boolean estado;

    public Contrato(double id, File clausula, Date fecha_inicio, Date fecha_fin,
                    Inmueble inmueble, Inquilino inquilino, boolean estado) {
        this.id = id;
        this.clausula = clausula;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
        this.estado = estado;
    }

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //fin getter and setter

    public void mostrar_contrato(){}

    public void renovar_fecha_fin(){}

    public void editar_fecha_fin(){}

    public void notificar_cierre_contrato(){}


    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", clausula=" + clausula +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", inmueble=" + inmueble +
                ", inquilino=" + inquilino +
                ", estado=" + estado +
                '}';
    }
}
