package paquete1;

import paquete2.Contrato;

public class Casa extends Inmueble{
    private int area_aireLibre;

    public Casa(double id, String direccion, int canon, int tamaño, int numero_habitaciones,
                int numero_baños, boolean balcon, boolean patio, boolean cuarto_util, int parqueadero,
                boolean estado_fisico_inmueble, Contrato contrato, boolean estado_arriendo_inmueble, int area_aireLibre) {
        super(id, direccion, canon, tamaño, numero_habitaciones, numero_baños, balcon, patio, cuarto_util, parqueadero, estado_fisico_inmueble, contrato, estado_arriendo_inmueble);
        this.area_aireLibre = area_aireLibre;
    }

    //getter and setter

    public int getArea_aireLibre() {
        return area_aireLibre;
    }

    public void setArea_aireLibre(int area_aireLibre) {
        this.area_aireLibre = area_aireLibre;
    }


    //fin getter and setter


    @Override
    public String mostrarInmueble() {
        return "Casa{" +
                "id de la casa= " + getId() +
                "direccion de la casa= " + getDireccion() +
                "canon de la casa= " + getCanon() +
                "tamaño de la casa= " + getTamaño() +
                "numero de habitaciones de la casa = " + getNumero_habitaciones() +
                "numero de baños de la casa= " + getNumero_baños() +
                "La casa tiene balcon?= "  + isBalcon() +
                "La casa tiene patio?= " + isPatio() +
                "La casa tiene cuarto util?= " + isCuarto_util() +
                "Numero de parqueaderos de la casa= " + getParqueadero() +
                "Estado fisico de la casa?= " + super.recordar_reparacion() +
                "id del contrato de la casa= " + getContrato().getId() +
                "Estado del arriendo de la casa?= " + super.consultar_estado() +
                "areas al aire libre de la casa=" + getArea_aireLibre() +
                '}';
    }


}
