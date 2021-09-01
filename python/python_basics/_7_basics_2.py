#
#!=========== Python Basics: Modules ==========#

# import _7_basics_1 as data #*traemos todos los datos del archivo
from _7_basics_1 import saludo #*traemos solo lo que necesitamos del otro moudulo
from camelcase import CamelCase

c = CamelCase()
s = 'Esta oracion necesita CamelCase'

camelcased = c.hump(s)

# print(data.mascotas)
saludo('seba') #*traemos solo saludo por lo tanto no es necesario usar el nombre del archivo.
print(camelcased)


