import pickle
from socket import CAN_SFF_MASK
from gestorAplicacion import *
from gestorAplicacion import gestorAplicacion_contratos
from gestorAplicacion import gestorAplicacion_inmuebles

contratos = open("lista_contratos" ,"wb")
facturas= open("lista_facturas" ,"wb")
inquilinos= open("lista_inquilinos" ,"wb")
apartamentos= open("lista_apartamentos" ,"wb")
casas = open("lista_casas" ,"wb")
inmuebles = open("lista_inmuebles" ,"wb")


pickle.dump(gestorAplicacion_contratos.Contrato.lista_contratos , contratos)
pickle.dump(gestorAplicacion_contratos.Factura.lista_facturas , facturas)
pickle.dump(gestorAplicacion_contratos.Inquilino.lista_inquilinos , inquilinos)
pickle.dump(gestorAplicacion_inmuebles.Apartamento.lista_apartamentos , apartamentos)
pickle.dump(gestorAplicacion_inmuebles.Casa.lista_casas , casas)
pickle.dump(gestorAplicacion_inmuebles.Inmueble.lista_inmuebles , inmuebles)


contratos.close()
facturas.close()
inquilinos.close()
apartamentos.close()
casas.close()
inmuebles.close()



contratosApertura = open("lista_contratos","rb")
facturasApertura = open("lista_facturas","rb")
inquilinosApertura = open("lista_inquilinos","rb")
apartamentosApertura = open("lista_apartamentos","rb")
casasApertura = open("lista_casas","rb")
inmueblesApertura = open("lista_inmuebles","rb")

misContratos= pickle.load(contratosApertura)
misFacturas= pickle.load(facturasApertura)
misInquilinos =pickle.load(inquilinosApertura)
misApartamentos =pickle.load(apartamentosApertura)
misCasas =pickle.load(casasApertura)
misInmuebles =pickle.load(inmueblesApertura)

