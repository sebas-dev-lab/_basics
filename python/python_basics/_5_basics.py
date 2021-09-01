#!=========== Python Basics: Objetos, clases y herencia ==========#

#?
class User:
    def __init__(self, name, lastName):
        self.name = name#*self: valor reservado a las clases y hace referencia a la instancia. No noecesariamente tiene que ser self, puede llevar cualquier otro nombre.
        self.lastName = lastName
    def saludo(self):
        print('Hola, mi nombre es ', self.name, self.lastName) 
        



user= User('Sebastian', 'Lescano')

# user.saludo()
# user.name = 'Felipe'
# user.saludo()
# del usuario.name
# user.saludo()#*error no tiene nombre
# del usuario #*Elimina al usuario

#?Herencia

class Admin(User):
    def saludoAdmin(self):
        print('Hola, me llamo', self.name, 'y soy administrador')

admin = Admin('Admim_1','SuperUser')
# admin.saludo()
# admin.saludoAdmin()
    

#? Ejercicio de herencia
class Animal:
    def __init__(self, name, onomatopeya):
        self.name = name
        self.onomatopeya = onomatopeya
    def saludo(self):
            print('Hola, soy un',self.tipo ,'y mi sonido es el', self.onomatopeya)

class Gato(Animal):
    tipo='gato'
    def __init__(self, name, onomatopeya):
        Animal.__init__(self,name,onomatopeya) #*Metodo de extension del metodo de init del padre.
        print('metodo extendido de init')


class Perro(Animal):
    tipo='perro'
    def __init__(self, name, onomatopeya):
        super().__init__(name, onomatopeya) #*Otra forma de extender el metodo init del padre para mantener el comporameinto.
        print('instanciando un peroo')

    

gato = Gato('Fluffy', 'maullido')
gato.saludo()

perro=Perro('Firulais','ladrido')
perro.saludo()

