# class User:
#     def __init__(self, name, lastName):
#         self.name = name
#         self.lastName = lastName

#     def saludo(self):
#         print('Hola, ', self.name, self.lastName)


# user = User('Sebastian', 'Lescano')
# user.saludo()


# class Admin(User):
#     def saludoAdmin(self):
#         print('hola', self.name, 'Admin')

# admin=Admin('lalala', 'sususu')
# admin.saludo()
# admin.saludoAdmin()


class Pizzeria:
    def __init__(self):
        self.company = ['Suc_1', 'Suc_2']
        self.types = ['Muzzarella', 'Palmitos']

    def select(self, type):
        if(self.types.includes(type)):
            print('yes')
        else:
            print('no')


class Sucursal_1(Pizzeria):
    def __init__(self, type):
        super().__init__(type)
        self.price = {
            "Muzzarella": 600,
            "Palmitos": 800
        }

    def getPrice(self, type):
        print(self.company[0], '=> Precio de ', type, ': ', self.price[type])


class Sucursal_2(Pizzeria):
    def __init__(self, type):
        super().__init__(type)
        self.price = {
            "Muzzarella": 500,
            "Palmitos": 700
        }

    def getPrice(self, type):
        print(self.company[0], '=> Precio de ', type, ': ', self.price[type])



pedido=Sucursal_1()
pedido_2=Sucursal_2()

pedido.getPrice('Muzzarella')
pedido_2.getPrice('Palmitos')