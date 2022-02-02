from tkinter import *
from tkinter.messagebox import  *

class Frame3(Frame):

    def __init__(self, master=None):
        super().__init__(master, width=300, height=100)
        self.master = master
        self.pack()
        self.crearWidgets()

    def crearWidgets(self):
        self.botonAceptar = Button(self, text="Aceptar")
        self.botonAceptar.place(relx=0.3,relwidth=0.2, relheight=0.6)
        self.botonBorrar = Button(self, text="Borrar")
        self.botonBorrar.place(relx=0.55, relwidth=0.2, relheight=0.6)



window = Tk()
app = Frame3(window)
app.mainloop()
