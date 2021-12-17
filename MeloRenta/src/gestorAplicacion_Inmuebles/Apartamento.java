package gestorAplicacion_Inmuebles;

import java.io.Serializable;
import java.util.*;
import gestorAplicacion_contratos.*;
public class Apartamento extends Inmueble implements Serializable {
	
    private int numeroDePiso;
    
    //inicio serializacion     
    private static final long serialVersionUID = 1L;
    private static LinkedList<Apartamento> apartamentos = new LinkedList<Apartamento>();
       
    
    public static LinkedList<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public static void adicionarApartamento(Apartamento Apartamento) {
		apartamentos.add(Apartamento);
	}
    

	public static void setApartamentos(LinkedList<Apartamento> apartamentos) {
		Apartamento.apartamentos = apartamentos;
	}

	//fin serialización   

    public Apartamento(double id, String direccion, int canon, int tamano,
                       int numeroHabitaciones, int numeroBanos, boolean balcon,
                       boolean patio, boolean cuartoUtil, int parqueadero, boolean estadoFisicoInmueble,
                       Contrato contrato, boolean estadoArriendoInmueble, int numeroDePiso) {
        super(id, direccion, canon, tamano, numeroHabitaciones, numeroBanos, balcon, patio, cuartoUtil, parqueadero,
        		estadoFisicoInmueble, contrato, estadoArriendoInmueble);
        this.numeroDePiso = numeroDePiso;
        apartamentos.add(this);
    }

    //getter and setter

    public int getNumeroDePiso() {
        return numeroDePiso;
    }

    public void setNumeroDePiso(int numeroDePiso) {
        this.numeroDePiso = numeroDePiso;
    }

    //fin getter and setter


	@Override
    public  String mostrarInmueble() {
		if ((getContrato())!=(null)) {
        return "Apartamento{" +
                "id del apartamento = " + getId() +
                "\ndireccion del apartamento = " + getDireccion() +
                "\ncanon del apartamento = " + getCanon() +
                "\ntamano del apartamento = " + getTamano() +
                "\nnumero de habitaciones del apartamento = " + getNumeroHabitaciones() +
                "\nnumero de banos del apartamento = " + getNumeroBanos() +
                "\nEl apartamento tiene balcon? = "  + isBalcon() +
                "\nEl apartamento tiene patio? = " + isPatio() +
                "\nEl apartamento tiene cuarto util? = " + isCuartoUtil() +
                "\nNumero de parqueaderos del apartamento = " + getParqueadero() +
                "\nEstado fisico del apartamento? = " + super.recordarReparacion() +
                "\nid del contrato del apartamento = " + getContrato().getId() +
                "\nEstado del arriendo del apartamento? = " + super.consultarEstado() +
                "\nnumero de piso del apartamento = " + getNumeroDePiso() +
                '}';
		}
		else {
		return "Apartamento{" +
                "id del apartamento = " + getId() +
                ", direccion del apartamento = " + getDireccion() +
                ",\ncanon del apartamento = " + getCanon() +
                ", tamano del apartamento = " + getTamano() +
                ",\nnumero de habitaciones del apartamento = " + getNumeroHabitaciones() +
                ",\nnumero de banos del apartamento = " + getNumeroBanos() +
                ",\nEl apartamento tiene balcon? = "  + isBalcon() +
                ", El apartamento tiene patio? = " + isPatio() +
                ",\nEl apartamento tiene cuarto util? = " + isCuartoUtil() +
                ",\nNumero de parqueaderos del apartamento = " + getParqueadero() +
                ",\nEstado fisico del apartamento? = " + super.recordarReparacion() +
                ",\nEste apartamento no tiene ningún contrato activo "+
                ",\nEstado del arriendo del apartamento? = " + super.consultarEstado() +
                ",\nnumero de piso del apartamento = " + getNumeroDePiso() +
                '}';
		}
    }
	//Este método se encarga de presentar toda la información del objeto apartamento
}
