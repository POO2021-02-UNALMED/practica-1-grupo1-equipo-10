import pickle
from socket import CAN_SFF_MASK
from gestorAplicacion import *
from gestorAplicacion import gestorAplicacion_contratos
from gestorAplicacion import gestorAplicacion_inmuebles

contratos = open("lista_contratos" ,"wbc")
facturas= open("lista_facturas" ,"wbf")
inquilinos= open("lista_inquilinos" ,"wbiq")
apartamentos= open("lista_apartamentos" ,"wba")
casas = open("lista_casas" ,"wbca")
inmuebles = open("lista_inmuebles" ,"wbim")


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
