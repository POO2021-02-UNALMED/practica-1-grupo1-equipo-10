package paquete2;

public class Factura {
    private double id;
    private boolean estado;
    private Contrato contrato;

    //falta constructor

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


    public void notificar_pago_completado(){}

    public void calenadio_pago(){}

    public void calcular_fechas_pago(){}

}
