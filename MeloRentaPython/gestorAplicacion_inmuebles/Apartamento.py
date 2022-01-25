class casa:
    apartamentos = []

    # Constructor

    def __init__(self):
        super().__init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                         numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                         contrato, estadoArriendoInmueble, numeroDePiso)
        self._numeroDePiso = numeroDePiso

    #Getters y Setters

    def getapartamentos(cls):
        return cls.apartamentos

    def setapartamentos(cls, apartamentos):
        cls.apartamentos = apartamentos

    def getnumeroDePiso(self):
        return self._numeroDePiso

    def setnumeroDePiso(self, numeroDePiso):
        self._id = numeroDePiso


    #Fin Getters y Setters

        def adicionarapartamento(cls, apartamento):
            cls.apartamentos.append(apartamento)

    def mostrarInmueble(self):
        if(self.contrato != null):
            return "Apartamento {" + "id del apartamento= " + self.getId() +", direccion del apartamento= " + self.getDireccion() +",\ncanon del apartamento= " + self.getCanon() +", tamano del apartamento= " + self.getTamano() +",\nnumero de habitaciones del apartamento = " + self.getNumeroHabitaciones() +",\nnumero de banos del apartamento= " + self.getNumeroBanos() +",\nEl apartamento tiene balcon?= "  + self.isBalcon() +", El apartamento tiene patio?= " + self.isPatio() +",\nEl apartamento tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos el apartamento= " + self.getParqueadero() +",\nEstado fisico del apartamento?= " + super.recordarReparacion() +",\nid del contrato del apartamento= " + self.getContrato().getId() +",\nEstado del arriendo del apartamento?= " + super.consultarEstado() +",\nareas al aire libre del apartamento=" + self.getAreaAireLibre() +'}'
        else:
            return "Apartamento {" + "id del apartamento= " + self.getId() +", direccion del apartamento= " + self.getDireccion() +",\ncanon del apartamento= " + self.getCanon() +", tamano del apartamento= " + self.getTamano() +",\nnumero de habitaciones del apartamento = " + self.getNumeroHabitaciones() +",\nnumero de banos del apartamento= " + self.getNumeroBanos() +",\nEl apartamento tiene balcon?= "  + self.isBalcon() +", El apartamento tiene patio?= " + self.isPatio() +",\nEl apartamento tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos el apartamento= " + self.getParqueadero() +",\nEstado fisico del apartamento?= " + super.recordarReparacion() +",\nEste apartamento no tiene ningún contrato activo " +",\nEstado del arriendo del apartamento?= " + super.consultarEstado() +",\nareas al aire libre del apartamento=" + self.getAreaAireLibre() +'}'
