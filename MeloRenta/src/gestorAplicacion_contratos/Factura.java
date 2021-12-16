package gestorAplicacion_contratos;
import java.io.File;
import java.time.LocalDate;
import java.util.*;

public class Factura {
    private double id;
    private boolean estado;
    private Contrato contrato;
    
    //inicio serializacion        
    private static LinkedList<Factura> facturas = new LinkedList<Factura>();
       
    
    public static LinkedList<Factura> getFacturas() {
		return facturas;
	}

	public static void adicionarFactura(Factura Factura) {
		facturas.add(Factura);
	}
    

	public static void setFacturas(LinkedList<Factura> facturas) {
		Factura.facturas = facturas;
	}

	//fin serialización   

    public Factura(double id, boolean estado, Contrato contrato) {
        this.id = id;
        this.estado = estado;
        this.contrato = contrato;
    }

    //getter and setter

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    //fin getter and setter


    

    public void calendario_pago(){
    	LocalDate finicio= this.contrato.getFecha_inicio();
    	LocalDate ffin= this.contrato.getFecha_fin();
    	ArrayList<LocalDate> fechas = new ArrayList<>();
    	while (true) {
			if (ffin.isAfter(finicio)) {
				fechas.add(finicio);
				finicio.plusDays(30);
			}else {
				break;
			}
		}
    }

    

    //falta el metodo toString
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", estado=" + estado +
                ", Contrato=" + contrato +
                '}';
    }
}
