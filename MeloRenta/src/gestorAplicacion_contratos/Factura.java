package gestorAplicacion_contratos;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Factura implements Serializable {
    private double id;
    private boolean estado;
    private Contrato contrato;
    
    //inicio serializacion     
    private static final long serialVersionUID = 1L;
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

	//fin serializaci?n   

    public Factura(double id, boolean estado, Contrato contrato) {
        this.id = id;
        this.estado = estado;
        this.contrato = contrato;
        facturas.add(this);
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

    public ArrayList<LocalDate> calendario_pago(){
    	LocalDate fInicio= this.contrato.getFecha_inicio();
    	LocalDate fFin= this.contrato.getFecha_fin();
    	ArrayList<LocalDate> fechas = new ArrayList<>();
    	while (true) {
			if (fFin.isAfter(fInicio)) {
				fechas.add(fInicio);
				fInicio = fInicio.plusDays(30);
			}else {
				break;
			}
		}
    	return fechas;
    }
    //Este metodo se encarga de crear una lista de los d?as de pago en el intervalo entre la fecha inicio y la fecha fin.
    

    
    public String toString() {
        if ((getContrato()) != null) {
        	return "Factura{" +
                    "id = " + id +
                    ", estado = " + estado +
                    ", Contrato = " + contrato +
                    '}';
        }
        
        return "Factura{" + 
        		"id = " + id + 
        		", estado = " + estado + 
        		", el contrato no est? activo" + '}';
    }
    //Este m?todo se encarga de presentar toda la informaci?n del objeto factura
}
