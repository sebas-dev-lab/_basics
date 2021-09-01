import tkinter as tk

# text.get() obtengo valor introducido en ese input


def onClick():
    number=int(text.get())%2
    content.config(text=str(number))


ventana = tk.Tk()  # Crea La ventana
ventana.title("Modulo 4 python EIT")
ventana.config(width=400, height=300)  # Debe declararse antes del mainloop

button = tk.Button(text='calcular', command=onClick)
text = tk.Entry()
label = tk.Label(text="Ingresa un numero entero:")
content = tk.Label()


button.place(x=20, y=50, width=100, height=30)
label.place(x=20, y=90)
text.place(x=20, y=120, width=200, height=25)
content.place(x=40, y=200)


ventana.mainloop()  # Hace que la ventana se vuelva visible
