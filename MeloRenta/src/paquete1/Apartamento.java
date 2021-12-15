package paquete1;

import paquete2.Contrato;

public class Apartamento extends Inmueble{

    private int numeroDePiso;

    public Apartamento(double id, String direccion, int canon, int tamano,
                       int numeroHabitaciones, int numeroBanos, boolean balcon,
                       boolean patio, boolean cuartoUtil, int parqueadero, boolean estadoFisicoInmueble,
                       Contrato contrato, boolean estadoArriendoInmueble, int numeroDePiso) {
        super(id, direccion, canon, tamano, numeroHabitaciones, numeroBanos, balcon, patio, cuartoUtil, parqueadero,
        		estadoFisicoInmueble, contrato, estadoArriendoInmueble);
        this.numeroDePiso = numeroDePiso;
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
    public String mostrarInmueble() {
        return "Apartamento{" +
                "id del apartamento= " + getId() +
                "direccion del apartamento= " + getDireccion() +
                "canon del apartamento= " + getCanon() +
                "tamaño del apartamento= " + getTamano() +
                "numero de habitaciones del apartamento = " + getNumeroHabitaciones() +
                "numero de baños del apartamento= " + getNumeroBanos() +
                "El apartamento tiene balcon?= "  + isBalcon() +
                "El apartamento tiene patio?= " + isPatio() +
                "El apartamento tiene cuarto util?= " + isCuartoUtil() +
                "Numero de parqueaderos del apartamento= " + getParqueadero() +
                "Estado fisico del apartamento?= " + super.recordarReparacion() +
                "id del contrato del apartamento= " + getContrato().getId() +
                "Estado del arriendo del apartamento?= " + super.consultarEstado() +
                "numero de piso del apartamento=" + getNumeroDePiso() +
                '}';
    }

}
