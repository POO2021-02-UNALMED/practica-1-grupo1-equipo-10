import Inmueble
import pickle
class Apartamento(Inmueble):
    lista_apartamentos = []
    # Constructor

    def __init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                 numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                 contrato, estadoArriendoInmueble, numeroDePiso ):
        super().__init__(self, id, direccion, canon, tamano, numeroHabitaciones,
                         numeroBanos, balcon, patio, cuartoUtil, parqueadero, estadoFisicoInmueble,
                         contrato, estadoArriendoInmueble)
        self._numeroDePiso = numeroDePiso
        Apartamento.lista_apartamentos.append(self)
    def __init__(self, id, nombre, descripcion, ubicacion):
            self._id = id
            self.nombre = nombre
            self.descripcion= descripcion
            self.ubicacion = ubicacion
            Apartamento.lista_apartamentos.append(self)
        

    #Getters y Setters
    @classmethod
    def getapartamentos(cls):
        return cls.lista_apartamentos

    @classmethod
    def setapartamentos(cls, apartamentos):
        cls.lista_apartamentos = apartamentos

    def getnumeroDePiso(self):
        return self._numeroDePiso

    def setnumeroDePiso(self, numeroDePiso):
        self._id = numeroDePiso


    #Fin Getters y Setters
    @classmethod
    def adicionarapartamento(cls, apartamento):
        cls.lista_apartamentos.append(apartamento)

    def mostrarInmueble(self):
        if(self.contrato != None):
            return "Apartamento {" + "id del apartamento= " + self.getId() +", direccion del apartamento= " + self.getDireccion() +",\ncanon del apartamento= " + self.getCanon() +", tamano del apartamento= " + self.getTamano() +",\nnumero de habitaciones del apartamento = " + self.getNumeroHabitaciones() +",\nnumero de banos del apartamento= " + self.getNumeroBanos() +",\nEl apartamento tiene balcon?= "  + self.isBalcon() +", El apartamento tiene patio?= " + self.isPatio() +",\nEl apartamento tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos el apartamento= " + self.getParqueadero() +",\nEstado fisico del apartamento?= " + super.recordarReparacion() +",\nid del contrato del apartamento= " + self.getContrato().getId() +",\nEstado del arriendo del apartamento?= " + super.consultarEstado() +",\nareas al aire libre del apartamento=" + self.getAreaAireLibre() +'}'
        else:
            return "Apartamento {" + "id del apartamento= " + self.getId() +", direccion del apartamento= " + self.getDireccion() +",\ncanon del apartamento= " + self.getCanon() +", tamano del apartamento= " + self.getTamano() +",\nnumero de habitaciones del apartamento = " + self.getNumeroHabitaciones() +",\nnumero de banos del apartamento= " + self.getNumeroBanos() +",\nEl apartamento tiene balcon?= "  + self.isBalcon() +", El apartamento tiene patio?= " + self.isPatio() +",\nEl apartamento tiene cuarto util?= " + self.isCuartoUtil() +",\nNumero de parqueaderos el apartamento= " + self.getParqueadero() +",\nEstado fisico del apartamento?= " + super.recordarReparacion() +",\nEste apartamento no tiene ningún contrato activo " +",\nEstado del arriendo del apartamento?= " + super.consultarEstado() +",\nareas al aire libre del apartamento=" + self.getAreaAireLibre() +'}'
