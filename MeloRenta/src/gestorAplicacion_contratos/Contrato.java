package gestorAplicacion_contratos;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import gestorAplicacion_Inmuebles.Inmueble;

public class Contrato implements Serializable {
    private double id;
    private String clausula;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Inmueble inmueble;
    private Inquilino inquilino;
    private boolean estado;
    
    //inicio serializacion        
    private static final long serialVersionUID = 1L;
    private static LinkedList<Contrato> contratos = new LinkedList<Contrato>();
       
    
    public static LinkedList<Contrato> getContratos() {
		return contratos;
	}

	public static void adicionarContrato(Contrato Contrato) {
		contratos.add(Contrato);
	}
    

	public static void setContratos(LinkedList<Contrato> contratos) {
		Contrato.contratos = contratos;
	}

	//fin serialización   
    
    

    public Contrato(double id, String clausula, LocalDate fecha_inicio, LocalDate fecha_fin,
                    Inmueble inmueble, Inquilino inquilino, boolean estado) {
        this.id = id;
        this.clausula = clausula;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
        this.estado = estado;
        contratos.add(this); //Dentro de la lista se añade el objeto creado por el constructor
    }
    
    //getter and setter

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
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

    public void renovar_contrato(){ 
    	this.fecha_fin.plusDays(30);
    }    
    //Aqui tomamos la fecha de finalización del contrato y le sumamos 30 días.
    public String notificar_cierre_contrato(){
    	if (this.fecha_fin == (LocalDate.now().plusDays(1))) {
    		this.estado= !this.estado;
    		String notificacion ="Se ha cerrado el contrato";
    		return notificacion;
		}
    	String notificacion2= "Aún queda tiempo";
    	return notificacion2;
    	
    }
    //Este metodo se encarga de cerrar el contrato en caso de que la fecha fin sea igual a la fecha actual más 1 dias y notifique de esto al usuario.
    
    public void inhabilitarContrato() {
    	if (this.estado = true) {
			this.estado= !this.estado;
    	}
    }
    //Este método se encarga de evaluar si el estado del contrato es true y en este se cambia a false. En caso de que esté en false no se hace nada.


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
  //Este método se encarga de presentar toda la información del objeto contrato
	
}
