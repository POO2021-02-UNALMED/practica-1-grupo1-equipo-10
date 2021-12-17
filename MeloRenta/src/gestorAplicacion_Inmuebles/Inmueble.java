package gestorAplicacion_Inmuebles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

import gestorAplicacion_contratos.Contrato;

public abstract class Inmueble implements Serializable {
    private double id;
    private String direccion;
    private int canon;
    private int tamano;
    private int numeroHabitaciones;
    private int numeroBanos;
    private boolean balcon;
    private boolean patio;
    private boolean cuartoUtil;
    private int parqueadero;
    private boolean estadoFisicoInmueble;
    private Contrato contrato;
    private boolean estadoArriendoInmueble;
    // private ArrayList<Contrato> historialContratos;
    //inicio serializacion      
    private static final long serialVersionUID = 1L;
    private static LinkedList<Inmueble> inmuebles = new LinkedList<Inmueble>();
       
    
    public static LinkedList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public static void adicionarInmueble(Inmueble inmueble) { 
		inmuebles.add(inmueble);
	}
    //El metodo adicionarInmueble toma como parametro un objeto tipo inmueble y lo agrega a la linked list inmuebles

	public static void setInmuebles(LinkedList<Inmueble> inmuebles) {
		Inmueble.inmuebles = inmuebles;
	}

	//fin serialización 
    public Inmueble(double id, String direccion, int canon, int tamano, int numeroHabitaciones,
                    int numeroBanos, boolean balcon, boolean patio, boolean cuartoUtil, int parqueadero,
                    boolean estadoFisicoInmueble, Contrato contrato, boolean estadoArriendoInmueble) {
        this.id = id;
        this.direccion = direccion;
        this.canon = canon;
        this.tamano = tamano;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.balcon = balcon;
        this.patio = patio;
        this.cuartoUtil = cuartoUtil;
        this.parqueadero = parqueadero;
        this.estadoFisicoInmueble = estadoFisicoInmueble;
        this.contrato = contrato;
        this.estadoArriendoInmueble = estadoArriendoInmueble;
    }


    //getter and setter


   

    public ArrayList<String> historialContratos(){
    	ArrayList<String> historial = new ArrayList<>();
    	for(Contrato contrato : Contrato.getContratos()){
    		if(contrato.getInmueble().getId() == this.getId()){
    			historial.add(contrato.toString());
    		}
    	}
    	return historial;
    }
    //Este metodo recorre la lista estática de la clase contrato llamada listado luego si se cumple la condición del if añade a la lista historial el to string del objeto contrato

    public boolean isEstadoFisicoInmueble() {
        return estadoFisicoInmueble;
    }

    public void setEstadoFisicoInmueble(boolean estadoFisicoInmueble) {
        this.estadoFisicoInmueble = estadoFisicoInmueble;
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

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isCuartoUtil() {
        return cuartoUtil;
    }

    public void setCuartoUtil(boolean cuartoUtil) {
        this.cuartoUtil = cuartoUtil;
    }

    public int getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(int parqueadero) {
        this.parqueadero = parqueadero;
    }

    public boolean getEstadoFisicoInmueble() {
        return estadoFisicoInmueble;
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

    public boolean isEstadoArriendoInmueble() {
        return estadoArriendoInmueble;
    }

    public void setEstadoArriendoInmueble(boolean estadoArriendoInmueble) {
        this.estadoArriendoInmueble = estadoArriendoInmueble;
    }

    //fin getter and setter


    public String recordarReparacion(){
        if(!getEstadoFisicoInmueble()){
            return "El inmueble necesita reparacion";
        } else {
            return "El inmueble no necesita reparacion";
        }
    }
    //Este metodo toma el valor del estado físico del inmueble y se encarga de evaluar si el inmueble necesita reparación o si no la necesita
    public String consultarEstado(){
        if (isEstadoArriendoInmueble()){
            return "El inmueble se encuentra arrendado";
        } else {
            return "El inmueble no se encuentra arrendado";
        }
    }
    //Este metodo toma el valor de la variable estado arriendo y se encarga de evaluar si el inmueble se encuentra arrendado o no. 
    

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
