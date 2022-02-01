import datetime as dt

class Inquilino():
    lista_inquilinos=[]
    def __init__(self, documentoIdentidad, nombreCompleto, genero, fechaNacimiento, telefono, correo, contrato):
        self._documentoIdentidad = documentoIdentidad
        self._nombreCompleto = nombreCompleto
        self._genero = genero
        self._fechaNacimiento = dt.datetime.strptime(fechaNacimiento, "%d/%m/%y")
        self._telefono = telefono
        self._correo = correo
        self._contrato = contrato
        Inquilino.lista_inquilinos.append(self)

    # Getters and Setters

    def getDocumentoIdentidad(self):
        return self._documentoIdentidad

    def setDocumentoIdentidad(self, documentoIdentidad):
        self._documentoIdentidad = documentoIdentidad

    def getNombreCompleto(self):
        return self._nombreCompleto

    def setNombreCompleto(self, nombreCompleto):
        self._nombreCompleto = nombreCompleto

    def getGenero(self):
        return self._genero

    def setGenero(self, genero):
        self._genero = genero

    def getFechaNacimiento(self):
        return self._fechaNacimiento

    def setFechaNacimiento(self, fechaNacimiento):
        self._fechaNacimiento = dt.datetime.strptime(fechaNacimiento, "%d/%m/%y")

    def getTelefono(self):
        return self._telefono

    def setTelefono(self, telefono):
        self._telefono = telefono

    def getCorreo(self):
        return self._correo

    def setCorreo(self, correo):
        self._correo = correo

    def getContrato(self):
        return self._contrato

    def setContrato(self, contrato):
        self._contrato = contrato

    # Fin Getters and Setters

    def __str__(self):
        return "Inquilino {documento identidad = " + self.getDocumentoIdentidad() + ", nombre completo = " + self.getNombreCompleto() + ", genero = " + self.getGenero() + "\n, fecha nacimiento = " + str(self.getFechaNacimiento()) + ", telefono = " + self.getTelefono() + ", correo" + self.getCorreo() + "\n, contrato = " + self.getContrato().mostrarContrato()