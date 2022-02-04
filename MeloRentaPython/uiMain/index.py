# Importacion de librerias necesarias
from tkinter import *
from tkinter import messagebox
from FieldFrame import FieldFrame
from gestorAplicacion.gestorAplicacion_contratos import *
from gestorAplicacion.gestorAplicacion_inmuebles import *
from ManejoErrores.manejoErrores import *
from ManejoErrores.ErroresExistencia import *
from ManejoErrores.ErroresFormato import *
from Bases_de_datos.serializacion import *



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
barra = Menu(window) # Se le asigna a la ventana 'barra' de tipo Menu
inicio = Menu(barra) # Se crea el Menu 'Inicio' y se le asigna a 'barra'
barra.add_cascade(menu=inicio, label='Inicio') # Se agrega a 'barra' el elemento 'Inicio'

# Se define el evento 'salida' para la opcion 'Salir' del menu de inicio
def salida():
    window.destroy() # Cierra la ventana y acaba con el proceso

inicio.add_command(label="Salir", command=salida) # Se le agrega el comando 'Salir' a 'inicio'
desc = BooleanVar() # Se define 'desc' como valos booleano de Tkinter para un checkbutton

# Evento para mostrar en la ventana de inicio la descripción del programa
def toggleDescripcion():
    # Si el valor booleano de 'desc' es verdadero, muestra la descripcion, en caso contrario la esconde
    if desc.get():
        frameP3.place_forget()
        frameApp.place(x=5, y=5)
    else:
        frameApp.place_forget()
        frameP3.place(x=5, y=5)

inicio.add_checkbutton(label="Descripcion",variable=desc, command=toggleDescripcion) # Ckeckbutton para ver o no descripcion en ventana de inicio. Si se checkea el botón, se muestra la descripcion
window['menu'] = barra # Se agrega a la ventana el menu 'barra'

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

# Descripcion del programa
description = Text(master=frameApp, width=44, height=6)
t = "MeloRenta te permite administrar el\narrendamiento de tus propiedades, ya sea unacasa o un apartamento. Puedes ver quienes\nson tus inquilinos, como se encuentran tus\npropiedades y si tienes propiedades\ndisponibles para arrendar."
description.insert(INSERT, t) # Se inserta el texto a mostrar
description['state'] = 'disabled' # Se configura para que no se pueda editar
description.place(x=5,y=5) 

# Se define el evento 'cambioImagen' para la imagen del sistema del menu de inicio
def cambioImagen(e):
    global c # Se usa la variable auxiliar previamente definida
    imgList = ["uiMain\img\img1.png","uiMain\img\img2.png", "uiMain\img\img3.png", "uiMain\img\img4.png", "uiMain\img\img5.png"] # Imagenes del sistema
    if c > len(imgList)-1: # Verifica si 'c' se pasa del indice del array
        c = 0
    image = PhotoImage(file=imgList[c]) # Se crea una variable que contiene una imagen válida para Tkinter
    image = image.subsample(2) # Se le desminuye el tamaño
    label.configure(image=image) # Se le asigna la imagen a una etiqueta
    label.image = image
    c += 1

# Imagenes del sistema
label = Label(frameP4) # Etiqueta que contendrá una imagen y que será cambiada con eventos
img = PhotoImage(file="uiMain\img\img1.png") # Se le asigna una imagen de inicio
img = img.subsample(2) # Cambio de tamaño
label['image'] = img # Asignacion a etiqueta
label.image = img
label.place(x=20, y=5)
label.bind('<Enter>', cambioImagen) # Se le asigna evento cuando el cursor entra en la imagen

# Evento que abre la ventana de interacción con el usuario
def ingreso():
    usuario = Toplevel() # Se crea ventana secundaria
    usuario.geometry("800x442") # Tamaño de ventana
    usuario.title("MeloRenta") # Titulo de ventana
    window.iconify() # Se minimiza la ventana de inicio

    #MENU

    usuario.option_add('*tearOff',FALSE) # Elimina Underline
    menubar = Menu(usuario) # Se crea un menu que estará contenido en 'usuario'

    # Evento que abre una ventana con un mensaje donde habla de la aplicacion
    def funcionAplicacion():
        messagebox.showinfo("Aplicacion", "MeloRenta es un sistema gestor de inmuebles que se encarga de administrar inmuebles para los estudiantes. Se encarga de conectar arrendador a estudiante y facilitar el proceso de arrendamiento")
    
    # Evento que cierra ventana de usuario y abre ventana de inicio
    def funcionSalir():
        window.deiconify() # Vuelve a abrir la ventana de inicio
        usuario.destroy() # Cierra por completo la ventana de usuario

    # Evento que abre una ventana con un mensaje donde muestra los nombres de los integrantes
    def funcionAyuda():
        messagebox.showinfo("Ayuda", "Nombres de los autores de la aplicación: \n Aura Marcela Arbeláez Aristizabal\n Juan Pablo Rivera Sierra \n Cristian Giraldo Villegas ")

    # Toma los datos ingresados por el usuario
    #def funcionTomaDeDatos():
        #codigo = entryCodigo.get("1.0","end") # Toma el codigo
        #nombre = entryNombre.get("1.0","end") # Toma el nombre
        #descripcicon = entryDescripcion.get("1.0","end") # Toma la descripcion
        #ubicacion = entryUbicacion.get("1.0","end") # Toma la ubicacion
        #print(codigo)
        #print(nombre)
        #print(descripcicon)
        #print(ubicacion)

    # Borra los datos en el campo de entrada
    #def funcionBorrarDatos():
        #entryCodigo.delete("1.0","end") # Borra lo encontrado en el campo de codigo
        #entryNombre.delete("1.0","end") # Borra lo encontrado en el campo de nombre
        #entryUbicacion.delete("1.0","end") # Borra lo encontrado en el campo de ubicacion
        #entryDescripcion.delete("1.0","end") # Borra lo encontrado en el campo de descripcion

    # Evento que abre una ventana con un mensaje donde muestra los diferentes procesos y consultas
    def funcionProcesoYConsultas(label):
        dict = {
                "Crear casa":"Se piden por consola los parámetros necesarios para \nla creación del inmueble y luego se hace el guardado y notificación de éxito de la operación",
                "Crear apartamento":"Se piden por consola los parámetros necesarios para \nla creación del inmueble y luego se hace el guardado y notificación de éxito de la operación",
                "Visualizar listado de inmuebles":"Se muestra en pantalla los inmuebles que se encuentran actualmente registrados",
                "Buscar un inmueble":"Se busca un inmueble en específico con su identificador",
                "Visualizar Contratos":"Se le muestra al usuario los contratos actuales de los diferentes inmuebles",
                "Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble)":"Se pide la identificación del contrato para imprimir \n la lista de pagos desde el inicio del contrato hasta el final del contrato"
                }
        
        for key in dict.keys():
            if key == label:
                label1.configure(text=key)
                label2.configure(text=dict[key])
                break

    # Se crean los menus dentro de 'menubar'
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
    menu4.add_command(label="Crear casa", command=lambda:funcionProcesoYConsultas(menu4.entrycget(0,'label')))
    menu4.add_command(label="Crear apartamento", command=lambda:funcionProcesoYConsultas(menu4.entrycget(1,'label')))

    menu2.add_cascade(menu = menu5, label = "Visualizar Inmuebles creados")
    menu5.add_command(label="Visualizar listado de inmuebles", command=lambda:funcionProcesoYConsultas(menu5.entrycget(0,'label')))
    menu5.add_command(label="Buscar un inmueble", command=lambda:funcionProcesoYConsultas(menu5.entrycget(1,'label')))

    menu2.add_command(label="Visualizar Contratos", command=lambda:funcionProcesoYConsultas(menu2.entrycget(2,'label')))
    menu2.add_command(label="Visualizar Calendario (Notificaciones de Pago y Estado de Inmueble)", command=lambda:funcionProcesoYConsultas(menu2.entrycget(3,'label')))
    menu3.add_command(label="Acerca de", command=funcionAyuda)

    usuario['menu'] = menubar # Se le asigna a 'usuario' el menu 'menubar'

    #FIN MENU

    #FRAME1
    frame1 = Frame(master=usuario,height=40)
    label1 = Label(master=frame1,text="Nombre del proceso o consulta", borderwidth=1, relief="solid")
    label2 = Label(master=frame1, text="Descripcion del detalle del proceso o la consulta", borderwidth=1, relief="solid")

    label1.pack(side=TOP, ipadx = 15, ipady=10, pady = 5)
    label2.pack(side=TOP, ipadx = 130, ipady=10, pady = 5)
    frame1.pack( fill=X)
    #FIN FRAME1

    #FRAME2
    frame2 = FieldFrame(usuario,'CRITERIOS',['Codigo','Nombre','Descripcion','Ubicacion'],'VALORES', None, None)

    #FRAME3
    frame3 = Frame(master=usuario, width=400, height=50, borderwidth=1, relief="solid")
    frame3.pack(fill='both')

    botonAceptar = Button(master=frame3, text="Aceptar")
    botonAceptar.place(relx=0.3,relwidth=0.2, relheight=0.6)
    botonBorrar = Button(master=frame3, text="Borrar")
    botonBorrar.place(relx=0.55, relwidth=0.2, relheight=0.6)
    #FIN3
    

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


#-------------------------------------------------------------------------------------------------------------------------



def buscarInmueble(id):
    try:
        hay_error = id.aceptar()
    except ErrorStringNumero as owo:
        messagebox.showerror(title="Error",message=owo.mensaje_inicio)
            return
    if hay_error:
            self.generarTiquete()
            return
