from tkinter import *
from tkinter.messagebox import  *

class Frame2(Frame):

    def __init__(self, master=None):
        super().__init__(master, width=300, height=300)
        self.master = master
        self.pack()
        self.crearWidgets()

    def crearWidgets(self):

        self.labelCriterio = Label(self, text="CRITERIO", borderwidth=1, relief="solid")
        self.labelCriterio.place(relx=0.1,rely = 0.0, relwidth=0.2, relheight=0.1)

        self.labelValor = Label(self, text="VALOR", borderwidth=1, relief="solid")
        self.labelValor.place(relx=0.4,rely = 0.0, relwidth=0.5, relheight=0.1)

        self.labelCodigo = Label(self, text="Codigo")
        self.labelCodigo.place(relx=0.1,rely = 0.2,relwidth=0.2, relheight=0.1)

        self.entryCodigo = Entry()
        self.entryCodigo.place(relx=0.4,rely = 0.355,relwidth=0.5, relheight=0.06)

        self.labelNombre = Label(self, text="Nombre")
        self.labelNombre.place(relx=0.1,rely = 0.4,relwidth=0.2, relheight=0.1)

        self.entryNombre = Entry()
        self.entryNombre.place(relx=0.4,rely = 0.485,relwidth=0.5, relheight=0.06)

        self.labelDescripcion = Label(self, text="Descripcion")
        self.labelDescripcion.place(relx=0.1,rely = 0.6,relwidth=0.2, relheight=0.1)

        self.entryDescripcion = Entry()
        self.entryDescripcion.place(relx=0.4,rely = 0.625,relwidth=0.5, relheight=0.06)

        self.labelUbicacion = Label(self, text="Ubicacion")
        self.labelUbicacion.place(relx=0.1,rely = 0.8,relwidth=0.2, relheight=0.1)

        self.entryUbicacion = Entry()
        self.entryUbicacion.place(relx=0.4,rely = 0.755,relwidth=0.5, relheight=0.06)




window = Tk()
app = Frame2(window)
app.mainloop()



