from tkinter import *
from tkinter.messagebox import  *

from gestorAplicacion.gestorAplicacion_inmuebles.Casa import Casa



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


def crearCasa():
    identificador = entryIdentificador.get("1.0","end")
    direccion = entryDireccion.get("1.0","end")
    valor = entryValor.get("1.0","end")
    tamano = entryTamano.get("1.0","end")
    Casa(identificador,direccion,valor,tamano)



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
label1 = Label(master=frame1,text="Crear casa", borderwidth=1, relief="solid")
label2 = Label(master=frame1, text="Se piden por consola los parámetros necesarios para \nla creación de la casa y luego se hace el guardado y notificación de éxito de la operación", borderwidth=1, relief="solid")

label1.pack(side=TOP, ipadx = 15, ipady=10, pady = 2)
label2.pack(side=TOP, ipadx = 130, ipady=10, pady = 2)
frame1.pack( fill=X)
#FIN FRAME1




#FRAME2
frame2 = Frame(master=window, width=400, height=300, borderwidth=1, relief="solid")
frame2.pack(expand=TRUE, fill='both')


label3 = Label(master=frame2, text="CRITERIO", borderwidth=1, relief="solid")
label3.place(relx=0.1,rely = 0.1, relwidth=0.2, relheight=0.1)


label3 = Label(master=frame2, text="VALOR", borderwidth=1, relief="solid")
label3.place(relx=0.4,rely = 0.1, relwidth=0.5, relheight=0.1)

#Identificador

labelIdentificador = Label(master=frame2, text="Identificador")
labelIdentificador.place(relx=0.1,rely = 0.3,relwidth=0.2, relheight=0.1)

entryIdentificador = Text()
entryIdentificador.place(relx=0.4,rely = 0.45,relwidth=0.5, relheight=0.06)

#Direccion

labelDireccion= Label(master=frame2, text="Direccion")
labelDireccion.place(relx=0.1,rely = 0.48,relwidth=0.2, relheight=0.1)

entryDireccion = Text()
entryDireccion.place(relx=0.4,rely = 0.55,relwidth=0.5, relheight=0.06)

#Valor

labelValor = Label(master=frame2, text="Valor del arriendo")
labelValor.place(relx=0.1,rely = 0.65,relwidth=0.2, relheight=0.1)

entryValor = Text()
entryValor.place(relx=0.4,rely = 0.68,relwidth=0.5, relheight=0.06)


#Tamano

labelTamano = Label(master=frame2, text="Tamano")
labelTamano.place(relx=0.1,rely = 0.85,relwidth=0.2, relheight=0.1)

entryTamano = Text()
entryTamano.place(relx=0.4,rely = 0.78,relwidth=0.5, relheight=0.06)



#fin




#FIN FRAME2

#FRAME3
frame3 = Frame(master=window, width=400, height=50, borderwidth=1, relief="solid")
frame3.pack(fill='both')

botonAceptar = Button(master=frame3, text="Aceptar",command=crearCasa)
botonAceptar.place(relx=0.3,relwidth=0.2, relheight=0.6)
botonBorrar = Button(master=frame3, text="Borrar", command=funcionBorrarDatos)
botonBorrar.place(relx=0.55, relwidth=0.2, relheight=0.6)
#FIN3



window.mainloop()


