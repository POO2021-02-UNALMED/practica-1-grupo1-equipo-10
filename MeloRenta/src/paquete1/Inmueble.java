package paquete1;

import paquete2.Inquilino;

public class Inmueble {
    public double id;
    private String direccion;
    private int canon;
    private int tamaño;
    private int numero_habitaciones;
    private int numero_baños;
    private boolean balcon;
    private boolean cuarto_util;
    private int parqueadero;
    private String estado_inmueble;
    private Inquilino inquilino;

    //falta constructor



    //getter and setter

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

    public String getEstado_inmueble() {
        return estado_inmueble;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }


    //fin getter and setter


    public void recordar_reparacion(){}

    public void consultar_estado(){}

    public void consultar_inquilino(){}

    public void setEstado_inmueble(String estado_inmueble){}

    public void setInquilino(Inquilino inquilino){}

    /*los metodos setInmbueble y setInquilino podrian sobrar ya que hacen parte
    de los metodos setter y getter
    */

    /*
        propongo crear dentro de esta clase el metodo toString() para que las clases que heredan de el
        tambien lo implementen y que cada una lo modifique a su manera
    */
}
