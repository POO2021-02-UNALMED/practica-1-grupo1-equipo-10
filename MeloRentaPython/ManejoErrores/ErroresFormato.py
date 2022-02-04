from ManejoErrores.manejoErrores import ErrorAplicacion

class ErrorFormato(ErrorAplicacion):

    def __init__(self, mensaje):
        self.mensajeErrorFormato = " Error por formato " + mensaje 
        super().__init__(self.mensajeErrorFormato)

class ErrorStringNumero(ErrorFormato):
    def __init__(self,valor):
        self.mensajeError = f"La entrada {valor}  solo recibe de digitos, por favor modifiquela."
        super().__init__(self.mensajeError)

class ErrorEnteroString(ErrorFormato):
    def __init__(self,valor):
        self.mensajeError=f"\nLa entrada {valor} solo recibe numeros enteros, por favor modifiquela." 
        super().__init__(self.mensajeError)

class ErrorEntradasVacias(ErrorFormato):

    def __init__(self,entradas):
        self.mensajeError = f"\nLas siguientes entradas están vacías: {entradas} \nPor favor ingreselas e intente de nuevo"
        super().__init__(self.mensajeError)