class ErrorAplicacion(Exception):
    
    def __init__(self, mensaje):
        self.mensaje_inicio = "Manejo de errores Error Aplicación : "+ mensaje
        super().__init__(self.mensaje_inicio)

