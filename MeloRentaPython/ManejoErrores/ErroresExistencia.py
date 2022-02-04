from manejoErrores import *

class ErrorExistencia(ErrorAplicacion):

    def __init__(self, mensaje):
        self.mensaje_existencia = f" Tu busqueda no tiene resultados: {mensaje}"
        super().__init__(self.mensaje_existencia)

class ErrorAgregarinmuieble(ErrorExistencia):

    def __init__(self, id):
        self.mensajeError = f"\nEl inmueble con ID {id} ya se ha guardado"
        super().__init__(self.mensajeError)


class ErrorNoExisteInmueble(ErrorExistencia):

     def __init__(self, id):
         self.mensajeError = f"\nNo existe un Inmueble con el ID: {id}"
         super().__init__(self.mensajeError)

class ErrorNoExisteContrato(ErrorExistencia):

    def __init__(self, id):
        self.mensaje_error = f"\nNo existe un contrato con el ID: {id}"
        super().__init__(self.mensajeError)
