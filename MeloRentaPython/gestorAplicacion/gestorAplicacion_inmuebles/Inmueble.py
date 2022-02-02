from gestorAplicacion_contratos.Contrato import Contrato
import pickle

class Inmueble:
    inmuebles = []
    lista_inmuebles =[]
    #Constructor

    def __init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                 numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                 contrato, estadoArriendoInmueble):
        self._id = id
        self._direccion = direccion
        self._canon = canon
        self._tamano = tamano
        self._numeroHabitaciones = numeroHabitaciones
        self._numeroBanos = numeroBanos
        self._balcon = balcon
        self._patio = patio
        self._cuartoUtil = cuartoUtil
        self._parqueadero = parqueadero
        self._estadoFisicoInmueble = estadoFisicoInmueble
        self._contrato = contrato
        self._estadoArriendoInmueble = estadoArriendoInmueble
        Inmueble.lista_inmuebles.append(self)


    #Getters y Setters
    @classmethod
    def getInmuebles(cls):
        return cls.inmuebles

    def getId(self):
        return self._id

    def getDireccion(self):
        return self._direccion

    def getCanon(self):
        return self._canon

    def getTamano(self):
        return self._Tamano

    def getNumeroHabitaciones(self):
        return self._numeroHabitaciones

    def getNumeroBanos(self):
        return self._numeroBanos

    def isBalcon(self):
        return self._balcon

    def isPatio(self):
        return self._patio

    def isCuartoUtil(self):
        return self._cuartoUtil

    def getParqueadero(self):
        return self._parqueadero

    def getEstadoFisicoInmueble(self):
        return self._estadoFisicoInmueble

    def getContrato(self):
        return self._contrato

    def isEstadoArriendoInmueble(self):
        return self._estadoArriendoInmueble

    #fin getters
    @classmethod
    def setInmuebles(cls, inmuebles):
        cls.inmuebles = inmuebles

    def setId(self, id):
        self._id = id

    def setDireccion(self, direccion):
        self._direccion = direccion

    def setCanon(self, canon):
        self._canon = canon

    def setTamano(self, tamano):
        self._Tamano = tamano

    def setNumeroHabitaciones(self, numeroHabitaciones):
        self.numeroHabitaciones = numeroHabitaciones

    def setNumeroBanos(self, numeroBanos):
        self._numeroBanos = numeroBanos

    def setBalcon(self, balcon):
        self._balcon = balcon

    def setPatio(self, patio):
        self._patio = patio

    def setCuartoUtil(self, cuartoUtil):
        self._cuartoUtil = cuartoUtil

    def setParqueadero(self, parqueadero):
        self._parqueadero = parqueadero

    def setEstadoFisicoInmueble(self, estadoFisicoInmueble):
        self._estadoFisicoInmueble = estadoFisicoInmueble

    def setContrato(self, contrato):
        self._contrato = contrato

    def setEstadoArriendoInmueble(self, estadoArriendoInmueble):
        self._estadoArriendoInmueble = estadoArriendoInmueble

    #Fin Getters y Setters
    @classmethod
    def adicionarInmueble(cls, inmueble):
        cls.inmuebles.append(inmueble)


    def historialContratos(self):
        historial = []
        for contrato in self._contrato.getContratos():
            if(contrato.getInmueble().getId() == self.getId()):
                historial.append(contrato.toString())

        return historial

    def recordarReparacion(self):
        if(self.getEstadoFisicoInmueble()):
            return "El inmueble no necesita reparacion"
        else:
            return "El inmueble necesita reparacion"

    def consultarEstado(self):
        if(self.isEstadoArriendoInmueble()):
            return "El inmueble se encuentra arrendado"
        else:
            return "El inmueble no se encuentra arrendado"


