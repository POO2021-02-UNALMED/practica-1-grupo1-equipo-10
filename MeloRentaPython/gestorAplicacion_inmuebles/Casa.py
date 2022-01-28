
class Casa:
    casas = []

    #Constructor

    def __init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                 numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                 contrato, estadoArriendoInmueble, areaAireLibre):
        super().__init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                         numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                         contrato, estadoArriendoInmueble)
        self._areaAireLibre = areaAireLibre

    #Getters y Setters

    def getCasas(cls):
        return cls.casas

    def setCasas(cls, casas):
        cls.casas = casas

    def adicionarCasa(cls, casa):
        cls.casas.append(casa)


    def getareaAireLibre(self):
        return self._areaAireLibre

    def setareaAireLibre(self, areaAireLibre):
        self._id = areaAireLibre

    #Fin Getters y Setters

    def mostrarInmueble(self):
        if(self.contrato != None):
            return "Casa {" + "id de la casa= " + self.getId() +", direccion de la casa= " + self.getDireccion() +",\ncanon de la casa= " + self.getCanon() +", tamano de la casa= " + self.getTamano() +",\nnumero de habitaciones de la casa = " + self.getNumeroHabitaciones() +",\nnumero de banos de la casa= " + self.getNumeroBanos() +",\nLa casa tiene balcon?= "  + self.isBalcon() +", La casa tiene patio?= " + self.isPatio() +",\nLa casa tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos de la casa= " + self.getParqueadero() +",\nEstado fisico de la casa?= " + super.recordarReparacion() +",\nid del contrato de la casa= " + self.getContrato().getId() +",\nEstado del arriendo de la casa?= " + super.consultarEstado() +",\nareas al aire libre de la casa=" + self.getAreaAireLibre() +'}'
        else:
            return "Casa {" + "id de la casa= " + self.getId() +", direccion de la casa= " + self.getDireccion() +",\ncanon de la casa= " + self.getCanon() +", tamano de la casa= " + self.getTamano() +",\nnumero de habitaciones de la casa = " + self.getNumeroHabitaciones() +",\nnumero de banos de la casa= " + self.getNumeroBanos() +",\nLa casa tiene balcon?= "  + self.isBalcon() +", La casa tiene patio?= " + self.isPatio() +",\nLa casa tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos de la casa= " + self.getParqueadero() +",\nEstado fisico de la casa?= " + super.recordarReparacion() +",\nEsta casa no tiene ning�n contrato activo  " +",\nEstado del arriendo de la casa?= " + super.consultarEstado() +",\nareas al aire libre de la casa=" + self.getAreaAireLibre() +'}'
