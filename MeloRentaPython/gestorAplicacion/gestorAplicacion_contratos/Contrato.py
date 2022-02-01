import datetime as dt

class Contrato():
    lista_contratos = []

    def __init__(self, id, clausula, fechaInicio, fechaFin, inmueble, inquilino, estado):
        self._id = id
        self._clausula = clausula
        self._fechaInicio = dt.datetime.strptime(fechaInicio, '%d/%m/%y')
        self._fechaFin = dt.datetime.strptime(fechaFin, '%d/%m/%y')
        self._inmueble = inmueble
        self._inquilino = inquilino
        self._estado = estado
        Contrato.lista_contratos.append(self)

    # Getters and Setters

    def getId(self):
        return self._id

    def setId(self, id):
        self._id = id

    def getClausula(self):
        return self._clausula

    def setClausula(self, clausula):
        self._clausula = clausula

    def getFechaInicio(self):
        return self._fechaInicio

    def setFechaInicio(self, fechaInicio):
        self._fechaInicio = dt.datetime.strptime(fechaInicio, '%d/%m/%y')

    def getFechaFin(self):
        return self._fechaFin

    def setFechaFin(self, fechaFin):
        self._fechaFin = dt.datetime.strptime(fechaFin, '%d/%m/%y')

    def getInmueble(self):
        return self._inmueble

    def setInmueble(self, inmueble):
        self._inmueble = inmueble

    def getInquilino(self):
        return self._inquilino

    def setInquilino(self, inquilino):
        self._inquilino = inquilino

    def isEstado(self):
        return self._estado

    def setEstado(self, estado):
        self._estado = estado

    # Fin Getters and Setters

    def renovarContrato(self):  # Aqui tomamos la fecha de finalización del contrato y le sumamos 30 días.
        self._fechaFin += 30    # Toca revisar cómo trabajar con fechas

    def notificarCierreContrato(self):  #Este metodo se encarga de cerrar el contrato en caso de que la fecha fin sea igual a la fecha actual más 1 dias y notifique de esto al usuario.
        if self.getFechaFin() == (dt.datetime.now() + dt.timedelta(days=1)): # Se necesita buscar respecto a Datetime en Python
           self.setEstado(not self.isEstado())
           notificacion = "Se ha cerrado el contrato"
           return notificacion
        else:
            notificacion = "Aun queda tiempo"
            return notificacion

    def inhabilitarContrato(self):  # Este método se encarga de evaluar si el estado del contrato es true y en este se cambia a false. En caso de que esté en false no se hace nada.
        if(self.isEstado() == True):
            self.setEstado(not self.isEstado())

    def mostrarContrato(self):
        return "Contrato {" + "id = " + str(self.getId()) + "\n, clausula = " + self.getClausula() + "\n fecha inicio = " + str(self.getFechaInicio()) + ", fecha fin = " + str(self.getFechaFin()) + "\n, inmueble = " + str(self.getInmueble()) + "\n, inquilino = " + self.getInquilino() + "\n, estado = " + str(self.isEstado()) + "}"
