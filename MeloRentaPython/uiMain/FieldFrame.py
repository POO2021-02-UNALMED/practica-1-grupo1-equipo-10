from tkinter import *

class FieldFrame(Frame):

    def __init__(self, master, tituloCriterios, criterios, tituloValores, valores, habilitado):

        super().__init__(master=master, width=400, height=300, borderwidth=1, relief="solid")
        self.pack(expand=TRUE, fill='both')

        Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0, sticky='nsew')

        label = Label(self, text=tituloCriterios, borderwidth=1, relief="solid", padx=50, pady=10)
        label.grid(column=1, row=0, sticky='nsew')

        Label(self, text="               ", padx=50, pady=10).grid(column=2,row=0, sticky='nsew')

        label = Label(self, text=tituloValores, borderwidth=1, relief="solid", padx=50, pady=10)
        label.grid(column=3, row=0, sticky=E+W)

        Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)

        for i in range(len(criterios)):
            if habilitado:
                for j in habilitado:
                    if j == criterios[i]:
                        if valores:
                            Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')

                            labelCodigo = Label(self, text=j, padx=50, pady=10)
                            labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                            Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                            entryCodigo = Entry(self, text=valores[i], state=DISABLED)
                            entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                            Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)
                        else:
                            Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')
                            
                            labelCodigo = Label(self, text=j, padx=50, pady=10)
                            labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                            Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                            entryCodigo = Entry(self, state=DISABLED)
                            entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                            Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)
                    else:
                        if valores:
                            Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')

                            labelCodigo = Label(self, text=criterios[i], padx=50, pady=10)
                            labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                            Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                            entryCodigo = Entry(self, text=valores[i])
                            entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                            Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)
                        else:
                            Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')

                            labelCodigo = Label(self, text=criterios[i], padx=50, pady=10)
                            labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                            Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                            entryCodigo = Entry(self)
                            entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                            Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)
        
            if valores:
                Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')

                labelCodigo = Label(self, text=criterios[i], padx=50, pady=10)
                labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                entryCodigo = Entry(self, text=valores[i])
                entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)
            else:
                Label(self, text="               ", padx=50, pady=10).grid(column=0,row=0,sticky='nsew')
                
                labelCodigo = Label(self, text=criterios[i], padx=50, pady=10)
                labelCodigo.grid(column=1, row=i+2, sticky='nsew')

                Label(self, text="               ", padx=50, pady=10).grid(column=2,row=i+2)

                entryCodigo = Entry(self)
                entryCodigo.grid(column=3, row=i+2, sticky=E+W)

                Label(self, text="               ", padx=50, pady=10).grid(column=4,row=0, sticky=E+W)

            #frame.columnconfigure(0,weight=1)
        self.columnconfigure(3,weight=1)


    def getValue(self, criterio):
        widget = self.winfo_children[0]
        for i in range(len(widget.winfo_children)):
            if widget.winfo_children[i].text == criterio:
                return widget.winfo_children[i+1].get()
        return ""