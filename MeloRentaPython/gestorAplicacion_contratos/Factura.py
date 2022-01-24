import datetime as dt

class Factura():

    def __init__(self, id, estado, contrato):
        self._id = id
        self._estado = estado
        self._contrato = contrato

    # Getters and Setters

    def getId(self):
        return self._id

    def setId(self, id):
        self._id = id

    def isEstado(self):
        return self._estado

    def setEstado(self, estado):
        self._estado = estado
    
    def getContrato(self):
        return self._contrato

    def setContrato(self, contrato):
        self._contrato = contrato

    # Fin Getters and Setters

    def calendarioPago(self):  # Este metodo se encarga de crear una lista de los días de pago en el intervalo entre la fecha inicio y la fecha fin.
        fInicio = self.contrato.getFechaInicio()
        fFin = self.contrato.getFechaFin()
        fechas = []
        while (True):
            if (fFin > fInicio):
                fechas.append(fInicio)
                fInicio += dt.timedelta(days=30)
            else:
                break;
        
        return fechas;

    def __str__(self):
        if self.getContrato() is not None:
            return "Factura{" + "id = " + str(self.getId()) + ", estado = " + str(self.isEstado()) + ", Contrato = " + self.getContrato().mostrarContrato() + '}'