from tkinter import *
from tkinter.messagebox import  *



window = Tk()
window.geometry("800x442")
window.title("MeloRenta")

#MENU
window.option_add('*tearOff',FALSE)
menubar = Menu(window)

def funcionAplicacion():
    showinfo("Aplicacion", "MeloRenta es un sistema gestor de inmuebles que se encarga de conectar arrendador con sus inmuebles y facilitar el proceso de arrendamiento de los mismos")

def funcionSalir():
    showinfo("Salir", "retorna a la Ventana de Inicio del programa")

def funcionAyuda():
    showinfo("Ayuda", "Nombres de los autores de la aplicación: \n Aura Marcela Arbeláez Aristizabal\n Juan Pablo Rivera Sierra \n Cristian Giraldo Villegas ")



#Menu

menu1 = Menu(menubar)
menu2 = Menu(menubar)
menu3 = Menu(menubar)
menu4 = Menu(menu2)
menu5 = Menu(menu2)

menubar.add_cascade(menu=menu1, label = 'Archivo')
menubar.add_cascade(menu = menu2, label = 'Proceso y Consultas')
menubar.add_cascade(menu=menu3, label = 'Ayuda')

menu1.add_command(label="Aplicacion", command=funcionAplicacion)
menu1.add_command(label="Salir", command=funcionSalir)

menu2.add_cascade(menu=menu4, label="Crear inmueble")
menu4.add_command(label="Crear casa")
menu4.add_command(label="Crear apartamento")

menu2.add_cascade(menu = menu5, label = "Visualizar Inmuebles creados")
menu5.add_command(label="Visualizar listado de inmuebles")
menu5.add_command(label="Buscar un inmueble")



menu2.add_command(label="Visualizar Contratos")
menu2.add_command(label="Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble)")
menu3.add_command(label="Acerca de", command=funcionAyuda)

window['menu'] = menubar

#FIN MENU






#FRAME1
frame1 = Frame(master=window,height=40)
label1 = Label(master=frame1,text="Bienvenido la ventana principal del usuario de MeloRenta", borderwidth=1, relief="solid")
label1.pack(side=TOP, ipadx = 15, ipady=10, pady = 5)

frame1.pack( fill=X)
#FIN FRAME1




#FRAME2
frame2 = Frame(master=window, width=400, height=300, borderwidth=1, relief="solid")
frame2.pack(expand=TRUE, fill='both')


labelMeloRenta = Label(master=frame2, text="MeloRenta", borderwidth=1, relief="solid")
labelMeloRenta.pack(side=TOP, ipadx = 15, ipady=10, pady = 5)

labelIntroduccion = Label(master=frame2, text="MELORENTA es un proyecto que se emplea con el objetivo de facilitar el trabajo para el administrado de\n  varios inmuebles, que está interesado en manejar toda la información de estos, de sus contratos\n y de los inquilinos, con el fin de tener un manejo oportuno de eventualidades, servicio técnico, pagos, entre otros.", borderwidth=1, relief="solid")
labelIntroduccion.pack(side=TOP, ipadx = 15, ipady=10, pady = 5)

labelInformacion1 = Label(master=frame2, text="Como usar la aplicacion?", borderwidth=1, relief="solid")
labelInformacion1.pack( ipadx = 10, ipady=5, pady = 5)

labelInformacion2 = Label(master=frame2, text="La aplicacion se maneja accediendo a las diferentes opcionalidades que estan en el menu de la ventana las cuales son\n Archivo, Proceso y consultas y por ultimo Ayuda", borderwidth=1, relief="solid")
labelInformacion2.pack( ipadx = 10, ipady=5, pady = 5)

labelInformacion4 = Label(master=frame2, text="En el menu de la aplicacion encontrara las siguientes opciones:\n "
                                              "En Archivo encontrara las opciones Aplicacion y Salir, la primera le brindara información básica de la aplicación\n"
                                              "  mientras que la segunda retorna a la Ventana de Inicio del programa. \n "
                                              "En Proceso y Consultas encontrara todas las funcionalidades y consultas que permite realizar la aplicacion las cuales son:\n"
                                              "Crear inmueble: Permite crear una casa o un apartamento\n"
                                              "Visualizar inmuebles creados: Permite ver un listado de todos los inmuebles o buscar uno en especifico\n"
                                              "Visualizar contratos: Permite visualizar el historial de contratos del inmueble\n"
                                              "Visualizar calendario: Permite visualizar el calendario de pago de un inmueble mediante\n su numero de identificaciondel contrato\n"
                                              "En Ayuda encontrara la opcion, Acerca de, la cual mostrara los nombres de los autores de la aplicación ", borderwidth=1, relief="solid")
labelInformacion4.pack( ipadx = 5, ipady=5, pady = 5)

#FIN FRAME2




window.mainloop()
