package gestorAplicacion_Inmuebles;

import gestorAplicacion_contratos.Contrato;

public class Casa extends Inmueble{
    private int areaAireLibre;

    public Casa(double id, String direccion, int canon, int tamano, int numeroHabitaciones,
                int numeroBanos, boolean balcon, boolean patio, boolean cuartoUtil, int parqueadero,
                boolean estadoFisicoInmueble, Contrato contrato, boolean estadoArriendoInmueble, int areaAireLibre) {
        super(id, direccion, canon, tamano, numeroHabitaciones, numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble, contrato, estadoArriendoInmueble);
        this.areaAireLibre = areaAireLibre;
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
        return "Casa{" +
                "id de la casa= " + getId() +
                "direccion de la casa= " + getDireccion() +
                "canon de la casa= " + getCanon() +
                "tamaño de la casa= " + getTamano() +
                "numero de habitaciones de la casa = " + getNumeroHabitaciones() +
                "numero de baños de la casa= " + getNumeroBanos() +
                "La casa tiene balcon?= "  + isBalcon() +
                "La casa tiene patio?= " + isPatio() +
                "La casa tiene cuarto util?= " + isCuartoUtil() +
                "Numero de parqueaderos de la casa= " + getParqueadero() +
                "Estado fisico de la casa?= " + super.recordarReparacion() +
                "id del contrato de la casa= " + getContrato().getId() +
                "Estado del arriendo de la casa?= " + super.consultarEstado() +
                "areas al aire libre de la casa=" + getAreaAireLibre() +
                '}';
    }


}
