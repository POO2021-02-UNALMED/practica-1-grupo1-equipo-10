package paquete1;

import paquete2.Contrato;

import java.util.ArrayList;

public abstract class Inmueble {
    private double id;
    private String direccion;
    private int canon;
    private int tamaño;
    private int numero_habitaciones;
    private int numero_baños;
    private boolean balcon;
    private boolean patio;
    private boolean cuarto_util;
    private int parqueadero;
    private boolean estado_fisico_inmueble;
    private Contrato contrato;
    private boolean estado_arriendo_inmueble;
    private ArrayList<Contrato> historial_contratos;

    public Inmueble(double id, String direccion, int canon, int tamaño, int numero_habitaciones,
                    int numero_baños, boolean balcon, boolean patio, boolean cuarto_util, int parqueadero,
                    boolean estado_fisico_inmueble, Contrato contrato, boolean estado_arriendo_inmueble) {
        this.id = id;
        this.direccion = direccion;
        this.canon = canon;
        this.tamaño = tamaño;
        this.numero_habitaciones = numero_habitaciones;
        this.numero_baños = numero_baños;
        this.balcon = balcon;
        this.patio = patio;
        this.cuarto_util = cuarto_util;
        this.parqueadero = parqueadero;
        this.estado_fisico_inmueble = estado_fisico_inmueble;
        this.contrato = contrato;
        this.estado_arriendo_inmueble = estado_arriendo_inmueble;
    }


    //getter and setter


    public ArrayList<Contrato> getHistorial_contratos() {
        return historial_contratos;
    }

    public void setHistorial_contratos(ArrayList<Contrato> historial_contratos) {
        this.historial_contratos = historial_contratos;
    }

    public boolean isEstado_fisico_inmueble() {
        return estado_fisico_inmueble;
    }

    public void setEstado_fisico_inmueble(boolean estado_fisico_inmueble) {
        this.estado_fisico_inmueble = estado_fisico_inmueble;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCanon() {
        return canon;
    }

    public void setCanon(int canon) {
        this.canon = canon;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public int getNumero_baños() {
        return numero_baños;
    }

    public void setNumero_baños(int numero_baños) {
        this.numero_baños = numero_baños;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isCuarto_util() {
        return cuarto_util;
    }

    public void setCuarto_util(boolean cuarto_util) {
        this.cuarto_util = cuarto_util;
    }

    public int getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(int parqueadero) {
        this.parqueadero = parqueadero;
    }

    public boolean getEstado_fisico_inmueble() {
        return estado_fisico_inmueble;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public boolean isEstado_arriendo_inmueble() {
        return estado_arriendo_inmueble;
    }

    public void setEstado_arriendo_inmueble(boolean estado_arriendo_inmueble) {
        this.estado_arriendo_inmueble = estado_arriendo_inmueble;
    }

    //fin getter and setter


    public String recordar_reparacion(){
        if(getEstado_fisico_inmueble()){
            return "El inmueble necesita reparacion";
        } else {
            return "El inmueble no necesita reparacion";
        }
    }

    public String consultar_estado(){
        if (isEstado_arriendo_inmueble()){
            return "El inmueble se encuentra arrendado";
        } else {
            return "El inmueble no se encuentra arrendado";
        }
    }

    public ArrayList<String> historial_de_contratos(){
        ArrayList<String> listadoContrato = new ArrayList<>();

        for (Contrato contrato: getHistorial_contratos()) {
            listadoContrato.add(contrato.toString());
        }
        return listadoContrato;
    }

    public abstract String mostrarInmueble();


    /*
        Estado_fisico se encarga de definir el "estado fisico" del inmueble, si esta malo o no.

        True = No necesita reparacion
        False = Necesita reparacion


        Estado_arriendo_inmueble se encarga de definir si el inmueble esta arrendado o no

        True = esta arrendado
        False = no esta arrendado
    */
}
