from tkinter import *
from tkinter.messagebox import  *
import inicio as window2

window = Tk()
window.geometry("550x450")
window.title("MeloRenta")

#MENU

def evento():
    pass
window.option_add('*tearOff',FALSE)
menubar = Menu(window)

def funcionAplicacion():
    showinfo("Apliacion", "MeloRenta es un sistema gestor de inmuebles que se encarga de administrar inmuebles para los estudiantes. Se encarga de conectar arrendador a estudiante y facilitar el proceso de arrendamiento")

def funcionSalir():
    showinfo("Salir", "retorna a la Ventana de Inicio del programa")
    window2.mainloop()
    window.destroy()

def funcionProcesoYConsultas():
    showinfo("Proceso y Consultas", "Funcionalidades: \n Crear inmuebles\n Asociar Inquilino a inmuebles\n Creación de contratos\n Recordar la reparación de inmuebles\n Calendario para pagos del inmueble ")

def funcionAyuda():
    showinfo("Ayuda", "Nombres de los autores de la aplicación: \n Aura Marcela Arbeláez Aristizabal\n Juan Pablo Rivera Sierra \n Cristian Giraldo Villegas ")


def funcionTomaDeDatos():
    codigo = entryCodigo.get("1.0","end")
    nombre = entryNombre.get("1.0","end")
    descripcicon = entryDescripcion.get("1.0","end")
    ubicacion = entryUbicacion.get("1.0","end")
    print(codigo)
    print(nombre)
    print(descripcicon)
    print(ubicacion)

def funcionBorrarDatos():
    entryCodigo.delete("1.0","end")
    entryNombre.delete("1.0","end")
    entryUbicacion.delete("1.0","end")
    entryDescripcion.delete("1.0","end")








menu1 = Menu(menubar)
menu2 = Menu(menubar)
menu3 = Menu(menubar)

menubar.add_cascade(menu=menu1, label = 'Archivo', command=evento)
menubar.add_command(label = 'Proceso y Consultas', command=funcionProcesoYConsultas)
menubar.add_cascade(menu=menu3, label = 'Ayuda', command=evento)

menu1.add_command(label="Aplicacion", command=funcionAplicacion)
menu1.add_command(label="Salir", command=funcionSalir)
menu3.add_command(label="Acerca de", command=funcionAyuda)




window['menu'] = menubar

#FIN MENU






#FRAME1
frame1 = Frame(master=window,height=40)
label1 = Label(master=frame1,text="Nombre del proceso o consulta", borderwidth=1, relief="solid")
label2 = Label(master=frame1, text="Descripcion del detalle del proceso o la consulta", borderwidth=1, relief="solid")

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

labelCodigo = Label(master=frame2, text="Codigo")
labelCodigo.place(relx=0.1,rely = 0.2,relwidth=0.2, relheight=0.1)

entryCodigo = Text()
entryCodigo.place(relx=0.4,rely = 0.355,relwidth=0.5, relheight=0.06)


labelNombre = Label(master=frame2, text="Nombre")
labelNombre.place(relx=0.1,rely = 0.4,relwidth=0.2, relheight=0.1)


entryNombre = Text()
entryNombre.place(relx=0.4,rely = 0.485,relwidth=0.5, relheight=0.06)

labelDescripcion = Label(master=frame2, text="Descripcion")
labelDescripcion.place(relx=0.1,rely = 0.6,relwidth=0.2, relheight=0.1)


entryDescripcion = Text()
entryDescripcion.place(relx=0.4,rely = 0.625,relwidth=0.5, relheight=0.06)

labelUbicacion = Label(master=frame2, text="Ubicacion")
labelUbicacion.place(relx=0.1,rely = 0.8,relwidth=0.2, relheight=0.1)


entryUbicacion = Text()
entryUbicacion.place(relx=0.4,rely = 0.755,relwidth=0.5, relheight=0.06)









#FIN FRAME2

#FRAME3
frame3 = Frame(master=window, width=400, height=50, borderwidth=1, relief="solid")
frame3.pack(fill='both')

botonAceptar = Button(master=frame3, text="Aceptar",command=funcionTomaDeDatos)
botonAceptar.place(relx=0.3,relwidth=0.2, relheight=0.6)
botonBorrar = Button(master=frame3, text="Borrar", command=funcionBorrarDatos)
botonBorrar.place(relx=0.55, relwidth=0.2, relheight=0.6)
#FIN3



#window.mainloop()


#Falta organizar la opcion salir del menu
