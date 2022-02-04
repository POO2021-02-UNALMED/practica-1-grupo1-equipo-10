import Inmueble
import pickle
class Casa(Inmueble):
    lista_casas=[]
    #Constructor

    def __init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                 numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                 contrato, estadoArriendoInmueble, areaAireLibre):
        super().__init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                         numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                         contrato, estadoArriendoInmueble)
        self._areaAireLibre = areaAireLibre
        Casa.lista_casas.append(self)
    def __init__(self, id, nombre, descripcion, ubicacion):
            self._id = id
            self.nombre = nombre
            self.descripcion= descripcion
            self.ubicacion = ubicacion
            Casa.lista_casas.append(self)
    #Getters y Setters
    @classmethod
    def getCasas(cls):
        return cls.lista_casas

    @classmethod
    def setCasas(cls, casas):
        cls.lista_casas = casas

    @classmethod
    def adicionarCasa(cls, casa):
        cls.lista_casas.append(casa)

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
