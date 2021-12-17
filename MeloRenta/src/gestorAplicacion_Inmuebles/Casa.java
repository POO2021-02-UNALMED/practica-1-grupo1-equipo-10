package gestorAplicacion_Inmuebles;

import java.io.Serializable;
import java.util.*;
import gestorAplicacion_contratos.Contrato;

public class Casa extends Inmueble implements Serializable{
    private int areaAireLibre;
    
    //inicio serializacion    
    private static final long serialVersionUID = 1L;
    private static LinkedList<Casa> casas = new LinkedList<Casa>();
       
    
    public static LinkedList<Casa> getCasas() {
		return casas;
	}

	public static void adicionarCasa(Casa casa) {
		casas.add(casa);
	}
    

	public static void setCasas(LinkedList<Casa> casas) {
		Casa.casas = casas;
	}

	//fin serialización 

    public Casa(double id, String direccion, int canon, int tamano, int numeroHabitaciones,
                int numeroBanos, boolean balcon, boolean patio, boolean cuartoUtil, int parqueadero,
                boolean estadoFisicoInmueble, Contrato contrato, boolean estadoArriendoInmueble, int areaAireLibre) {
        super(id, direccion, canon, tamano, numeroHabitaciones, numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, contrato, estadoArriendoInmueble);
        this.areaAireLibre = areaAireLibre;
        casas.add(this);
    }

    //getter and setter

    public int getAreaAireLibre() {
        return areaAireLibre;
    }

    public void setAreaAireLibre(int areaAireLibre) {
        this.areaAireLibre = areaAireLibre;
    }


    //fin getter and setter


    

	@Override
    public String mostrarInmueble() {
		if ((getContrato())!=(null)) {
        return "Casa {" +
                "id de la casa= " + getId() +
                ", direccion de la casa= " + getDireccion() +
                ",\ncanon de la casa= " + getCanon() +
                ", tamano de la casa= " + getTamano() +
                ",\nnumero de habitaciones de la casa = " + getNumeroHabitaciones() +
                ",\nnumero de banos de la casa= " + getNumeroBanos() +
                ",\nLa casa tiene balcon?= "  + isBalcon() +
                ", La casa tiene patio?= " + isPatio() +
                ",\nLa casa tiene cuarto util?= " + isCuartoUtil() +
                ",\nNumero de parqueaderos de la casa= " + getParqueadero() +
                ",\nEstado fisico de la casa?= " + super.recordarReparacion() +
                ",\nid del contrato de la casa= " + getContrato().getId() +
                ",\nEstado del arriendo de la casa?= " + super.consultarEstado() +
                ",\nareas al aire libre de la casa=" + getAreaAireLibre() +
                '}';
		}
		else {
			 return "Casa{" +
		                "id de la casa= " + getId() +
		                ", direccion de la casa= " + getDireccion() +
		                ",\ncanon de la casa= " + getCanon() +
		                ", tamano de la casa= " + getTamano() +
		                ",\nnumero de habitaciones de la casa = " + getNumeroHabitaciones() +
		                ",\nnumero de banos de la casa= " + getNumeroBanos() +
		                ",\nLa casa tiene balcon?= "  + isBalcon() +
		                ", La casa tiene patio?= " + isPatio() +
		                ",\nLa casa tiene cuarto util?= " + isCuartoUtil() +
		                ",\nNumero de parqueaderos de la casa= " + getParqueadero() +
		                ",\nEstado fisico de la casa?= " + super.recordarReparacion() +
		                ",\nEsta casa no tiene ningún contrato activo "+
		                ",\nEstado del arriendo de la casa?= " + super.consultarEstado() +
		                ",\nareas al aire libre de la casa=" + getAreaAireLibre() +
		                '}';
		}
    }
	//Este método se encarga de presentar toda la información del objeto casa

}
