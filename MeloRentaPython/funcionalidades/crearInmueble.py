from tkinter import *
from tkinter.messagebox import  *



window = Tk()
window.geometry("800x442")
window.title("MeloRenta")

#MENU
window.option_add('*tearOff',FALSE)
menubar = Menu(window)

def funcionAplicacion():
    showinfo("Apliacion", "MeloRenta es un sistema gestor de inmuebles que se encarga de administrar inmuebles para los estudiantes. Se encarga de conectar arrendador a estudiante y facilitar el proceso de arrendamiento")

def funcionSalir():
    showinfo("Salir", "retorna a la Ventana de Inicio del programa")

def funcionAyuda():
    showinfo("Ayuda", "Nombres de los autores de la aplicación: \n Aura Marcela Arbeláez Aristizabal\n Juan Pablo Rivera Sierra \n Cristian Giraldo Villegas ")

def funcionTomaDeDatos():
    identificador = entryIdentificador.get("1.0","end")
    direccion = entryDireccion.get("1.0","end")
    valor = entryValor.get("1.0","end")
    tamano = entryTamano.get("1.0","end")



def funcionBorrarDatos():
    entryIdentificador.delete("1.0","end")
    entryDireccion.delete("1.0","end")
    entryValor.delete("1.0","end")
    entryTamano.delete("1.0","end")



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
label1 = Label(master=frame1,text="Crear inmueble", borderwidth=1, relief="solid")
label2 = Label(master=frame1, text="Se piden por consola los parámetros necesarios para \nla creación del inmueble y luego se hace el guardado y notificación de éxito de la operación", borderwidth=1, relief="solid")

label1.pack(side=TOP, ipadx = 15, ipady=10, pady = 5)
label2.pack(side=TOP, ipadx = 130, ipady=10, pady = 5)
frame1.pack( fill=X)
#FIN FRAME1




#FRAME2
frame2 = Frame(master=window, width=400, height=300, borderwidth=1, relief="solid")
frame2.pack(expand=TRUE, fill='both')


label3 = Label(master=frame2, text="CRITERIO", borderwidth=1, relief="solid")
label3.place(relx=0.1,rely = 0.0, relwidth=0.2, relheight=0.1)


label3 = Label(master=frame2, text="VALOR", borderwidth=1, relief="solid")
label3.place(relx=0.4,rely = 0.0, relwidth=0.5, relheight=0.1)

#Identificador

labelIdentificador = Label(master=frame2, text="Identificador")
labelIdentificador.place(relx=0.1,rely = 0.2,relwidth=0.2, relheight=0.1)

entryIdentificador = Text()
entryIdentificador.place(relx=0.4,rely = 0.355,relwidth=0.5, relheight=0.06)

#Direccion

labelDireccion= Label(master=frame2, text="Direccion")
labelDireccion.place(relx=0.1,rely = 0.4,relwidth=0.2, relheight=0.1)

entryDireccion = Text()
entryDireccion.place(relx=0.4,rely = 0.485,relwidth=0.5, relheight=0.06)

#Valor

labelValor = Label(master=frame2, text="Valor del arriendo")
labelValor.place(relx=0.1,rely = 0.6,relwidth=0.2, relheight=0.1)

entryValor = Text()
entryValor.place(relx=0.4,rely = 0.625,relwidth=0.5, relheight=0.06)

#Tamano

labelTamano = Label(master=frame2, text="Tamano")
labelTamano.place(relx=0.1,rely = 0.8,relwidth=0.2, relheight=0.1)

entryTamano = Text()
entryTamano.place(relx=0.4,rely = 0.755,relwidth=0.5, relheight=0.06)

#NumeroHabitaciones

labelNumeroHabitaciones = Label(master=frame2, text = "Numero de Habitaciones")
labelNumeroHabitaciones.place(relx=0.1,rely = 0.8,relwidth=0.2, relheight=0.1)

entryNumeroHabitaciones = Text()
entryNumeroHabitaciones.place(relx=0.4,rely = 0.755,relwidth=0.5, relheight=0.06)


#Numero de banos


#Tiene balcon?


#Tiene patio?

#Tiene cuarto util?

#Cantidad de parqueaderos

#Su inmueble se encuentra en buen estado?

#El inmueble a registrar es un apartamento o una casa?





#SI ES UN APARTAMENTO

#Numero de Piso en el que se encuentra el Apartamento:

#El inmueble a registrar está disponible?

#respuesta: Apartamento registrado exitosamente




#El inmueble a registrar está disponible?

#Area al aire libre: (En metros cuadrados)

##no esta registrada

##esta registrada



#fin




#FIN FRAME2

#FRAME3
frame3 = Frame(master=window, width=400, height=50, borderwidth=1, relief="solid")
frame3.pack(fill='both')

botonAceptar = Button(master=frame3, text="Aceptar",command=funcionTomaDeDatos)
botonAceptar.place(relx=0.3,relwidth=0.2, relheight=0.6)
botonBorrar = Button(master=frame3, text="Borrar", command=funcionBorrarDatos)
botonBorrar.place(relx=0.55, relwidth=0.2, relheight=0.6)
#FIN3



window.mainloop()

