# Importacion de librerias necesarias
from doctest import master
from tkinter import *
from turtle import width
import ventanaDelUsuario as window2

c = 0 # Una ayuda para cambiar imagen de sistema
d = 0 # Una ayuda para cambiar texto e imagen de integrantes

#-------------------------------------------------------------------------------------------------------------------
# Creacion de ventana
window = Tk() # Se crea una ventana de tipo TK
window.geometry("800x442")
window.title("MeloRenta") # Se le asigna un titulo a la ventana
window.option_add('*tearOff', FALSE) # Eliminar Underline

#-------------------------------------------------------------------------------------------------------------------
# Creacion de menu de inicio
menubar = Menu(window) # Se le asigna a la ventana el menubar de tipo Menu
inicio = Menu(menubar) # Se crea el Menu 'Inicio' y se le asigna a 'menubar'
menubar.add_cascade(menu=inicio, label='Inicio') # Se agrega a 'menubar' el elemento 'Inicio'

# Se define el evento 'salida' para la opcion 'Salir' del menu de inicio
def salida():
    window.destroy() # Cierra la ventana y acaba con el proceso

inicio.add_command(label="Salir", command=salida) # Se le agrega el comando 'Salir' a 'inicio'
desc = BooleanVar()

def toggleDescripcion():
    if desc.get():
        frameP3.place_forget()
        frameApp.place(x=5, y=5)
    else:
        frameApp.place_forget()
        frameP3.place(x=5, y=5)

inicio.add_checkbutton(label="Descripcion",variable=desc, command=toggleDescripcion)
window['menu'] = menubar # Se agrega a la ventana el menu 'menubar'

#-------------------------------------------------------------------------------------------------------------------
# Creacion de Frames

#Frame maestro
frame = Frame(master=window, width=800, height=442) # Creacion de frame maestro
frame.pack()

# Frames contenedores
frameP1 = Frame(master=frame, width=382, height=432, highlightbackground="black", highlightthickness=1) # Creacion de frame contenedor 'frameP1'
frameP1.place(x=5, y=5) # A 'frameP1' se le agrega al lado izquierdo de la ventana
frameP2 = Frame(master=frame, width=382, height=432, highlightbackground="black", highlightthickness=1) # Creacion de frame contenedor 'frameP2'
frameP2.place(x=412, y=5) # A 'frameP2' se le agrega al lado derecho de la ventana

# Frame de bienvenida
frameP3 = Frame(master=frameP1, width=369, height=108, highlightbackground="black", highlightthickness=1) # Creacion de frame de bienvenida 'frameP3'
frameP3.place(x=5,y=5)

# Frame de descripcion aplicacion
frameApp = Frame(master=frameP1, width=369, height=108, highlightbackground="black", highlightthickness=1)

# Frame de ingreso a sistema e imagenes relacionadas al sistema
frameP4 = Frame(master=frameP1, width=369, height=307, highlightbackground="black", highlightthickness=1) # Creacion de frame del sistema 'frameP4'
frameP4.place(x=5, y=118)

# Frame de hoja de vida
frameP5 = Frame(master=frameP2, width=369, height=108, highlightbackground="black", highlightthickness=1) # Creacion de frame de hoja de vida 'frameP5'
frameP5.place(x=5, y=5)

# Frame de imagenes relacionadas con integrantes
frameP6 = Frame(master=frameP2, width=369, height=307, highlightbackground="black", highlightthickness=1) # Creacion de frame de imagenes integrantes 'frameP6'
frameP6.place(x=5, y=118)

#-------------------------------------------------------------------------------------------------------------------
# Creacion de contenido dentro de frames

# Texto de bienvenida
bienvenida = Label(master=frameP3, text="Bienvenido a MeloRenta", font=("Comic Sans", 20))
bienvenida.place(x=25, y=30)

description = Text(master=frameApp, width=44, height=6)
t = "MeloRenta te permite administrar el\narrendamiento de tus propiedades, ya sea unacasa o un apartamento. Puedes ver quienes\nson tus inquilinos, como se encuentran tus\npropiedades y si tienes propiedades\ndisponibles para arrendar."
description.insert(INSERT, t)
description['state'] = 'disabled'
description.place(x=5,y=5)

# Se define el evento 'cambioImagen' para la imagen del sistema del menu de inicio
def cambioImagen(e):
    global c
    imgList = ["uiMain\img\img1.png","uiMain\img\img2.png", "uiMain\img\img3.png", "uiMain\img\img4.png", "uiMain\img\img5.png"]
    if c > len(imgList)-1:
        c = 0
    image = PhotoImage(file=imgList[c])
    image = image.subsample(2)
    label.configure(image=image)
    label.image = image
    c += 1

# Imagenes del sistema
label = Label(frameP4)
img = PhotoImage(file="uiMain\img\img1.png")
img = img.subsample(2)
label['image'] = img
label.place(x=20, y=5)
label.bind('<Enter>', cambioImagen)

def ingreso():
    window2.mainloop()
    window.destroy()

# Boton para ingresar al sistema
btnIngreso = Button(master=frameP4, text="Ingresar al sistema", width=20, height=2, command=ingreso)
btnIngreso.place(x=100,y=257)

# Se define el evento 'cambioHojaVida' al clickear en la region de texto que contiene la hoja de vida de cada integrante
def cambioHojaVida(e):
    global d
    integrantes = [
                    {
                        'hojaVida' : "Aura Marcela Arbeláez Aristizabal:\ntengo 21 años y estudio ingenieria de\nsistemas en la universidad nacional. Trabajopaseando perros por mi casa. Me gustan los\nperros, comer hamburguesas, los videojuegos y echar chisme.",
                        'imagen' : [["uiMain\img\Aura1.png","uiMain\img\Aura2.png"],["uiMain\img\Aura3.png","uiMain\img\Aura4.png"]]
                    },
                    {
                        'hojaVida' : "Cristian Giraldo Villegas:\n21 años. Estudiante perteneciente a la\ncarrera Ing. Sistemas e Informatica de la\nUniversidad Nacional de Colombia. Le gustan los comics japoneses y Java.",
                        'imagen' : [["uiMain\img\Cristian1.png","uiMain\img\Cristian2.png"],["uiMain\img\Cristian3.png","uiMain\img\Cristian4.png"]]
                    },
                    {
                        'hojaVida' : "Juan Pablo Rivera Sierra:\n21 años. Estudiante de octavo semestre en laUniversidad Nacional de Colombia. Trabaja\ncomo asistente de programacion en Urcube. Legustan los videojuegos y Python.",
                        'imagen' : [["uiMain\img\Juan1.png","uiMain\img\Juan2.png"],["uiMain\img\Juan3.png","uiMain\img\Juan4.png"]]
                    }
                ]
    if d > len(integrantes)-1:
        d = 0
    hojaVida['state'] = 'normal'
    hojaVida.delete('1.0', "end")
    hojaVida.insert('1.0', integrantes[d]['hojaVida'])
    hojaVida['state'] = 'disabled'
    images = PhotoImage(file=integrantes[d]['imagen'][0][0])
    images = images.subsample(9)
    lbl1.configure(image=images)
    lbl1.image = images
    images = PhotoImage(file=integrantes[d]['imagen'][0][1])
    images = images.subsample(9)
    lbl2.configure(image=images)
    lbl2.image = images
    images = PhotoImage(file=integrantes[d]['imagen'][1][0])
    images = images.subsample(9)
    lbl3.configure(image=images)
    lbl3.image = images
    images = PhotoImage(file=integrantes[d]['imagen'][1][1])
    images = images.subsample(9)
    lbl4.configure(image=images)
    lbl4.image = images
    d += 1

# Campo de texto para la hoja de vida de integrantes
hojaVida = Text(master=frameP5, width=44, height=6)
text = "Juan Pablo Rivera Sierra:\n21 años. Estudiante de octavo semestre en laUniversidad Nacional de Colombia. Trabaja \ncomo asistente de programación en Urcube. Legustan los videojuegos y Python."
hojaVida.insert(INSERT, text)
hojaVida.config(state=DISABLED)
hojaVida.bind('<Button-1>', cambioHojaVida)
hojaVida.place(x=5,y=3)

# Campo de imagenes de integrantes

# Imagen 1
lbl1 = Label(frameP6)
img1 = PhotoImage(file="uiMain\img\Juan1.png")
img1 = img1.subsample(9)
lbl1['image'] = img1
lbl1.grid(row=0, column=0)
# Imagen 2
lbl2 = Label(frameP6)
img2 = PhotoImage(file="uiMain\img\Juan2.png")
img2 = img2.subsample(9)
lbl2['image'] = img2
lbl2.grid(row=0, column=1)
# Imagen 3
lbl3 = Label(frameP6)
img3 = PhotoImage(file="uiMain\img\Juan3.png")
img3 = img3.subsample(9)
lbl3['image'] = img3
lbl3.grid(row=1, column=0)
# Imagen 4
lbl4 = Label(frameP6)
img4 = PhotoImage(file="uiMain\img\Juan4.png")
img4 = img4.subsample(9)
lbl4['image'] = img4
lbl4.grid(row=1, column=1)

#-------------------------------------------------------------------------------------------------------------------
#Ejecucion de ventana
window.mainloop()