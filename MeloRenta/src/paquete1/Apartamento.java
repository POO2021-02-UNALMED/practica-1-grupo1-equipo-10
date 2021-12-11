package paquete1;

import paquete2.Contrato;

public class Apartamento extends Inmueble{

    private int numero_de_piso;

    public Apartamento(double id, String direccion, int canon, int tamaño,
                       int numero_habitaciones, int numero_baños, boolean balcon,
                       boolean patio, boolean cuarto_util, int parqueadero, boolean estado_fisico_inmueble,
                       Contrato contrato, boolean estado_arriendo_inmueble, int numero_de_piso) {
        super(id, direccion, canon, tamaño, numero_habitaciones, numero_baños, balcon, patio, cuarto_util, parqueadero,
                estado_fisico_inmueble, contrato, estado_arriendo_inmueble);
        this.numero_de_piso = numero_de_piso;
    }

    //getter and setter

    public int getNumero_de_piso() {
        return numero_de_piso;
    }

    public void setNumero_de_piso(int numero_de_piso) {
        this.numero_de_piso = numero_de_piso;
    }

    //fin getter and setter

    @Override
    public String mostrarInmueble() {
        return "Apartamento{" +
                "id del apartamento= " + getId() +
                "direccion del apartamento= " + getDireccion() +
                "canon del apartamento= " + getCanon() +
                "tamaño del apartamento= " + getTamaño() +
                "numero de habitaciones del apartamento = " + getNumero_habitaciones() +
                "numero de baños del apartamento= " + getNumero_baños() +
                "El apartamento tiene balcon?= "  + isBalcon() +
                "El apartamento tiene patio?= " + isPatio() +
                "El apartamento tiene cuarto util?= " + isCuarto_util() +
                "Numero de parqueaderos del apartamento= " + getParqueadero() +
                "Estado fisico del apartamento?= " + super.recordar_reparacion() +
                "id del contrato del apartamento= " + getContrato().getId() +
                "Estado del arriendo del apartamento?= " + super.consultar_estado() +
                "numero de piso del apartamento=" + getNumero_de_piso() +
                '}';
    }

}
