package paquete2;

import paquete1.Inmueble;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class Contrato {
    private double id;
    private File clausula;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Inmueble inmueble;
    private Inquilino inquilino;
    private boolean estado;

    public Contrato(double id, File clausula, LocalDate fecha_inicio, LocalDate fecha_fin,
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

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
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

    

    public void renovar_contrato(){ //Aqui tomamos la fecha de finalización del contrato y le sumamos 30 días.
    	this.fecha_fin.plusDays(30);
    }
    
    
    
    

    public String notificar_cierre_contrato(){
    	if (this.fecha_fin == (LocalDate.now().plusDays(1))) {
    		this.estado= !this.estado;
    		String notificacion ="Se ha cerrado el contrato";
    		return notificacion;
		}
    	String notificacion2= "Aún queda tiempo";
    	return notificacion2;
    	
    }
    
    public void inhabilitarContrato() {
    	if (this.estado = true) {
			this.estado= !this.estado;
    	}
    }


    public String mostrar_contrato() {
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
