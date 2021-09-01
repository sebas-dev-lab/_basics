#
#? Multiplicar dos numeros sin usar el símbolo de multiplicación

def mult(a, b):
    a = a
    b = b
    i = 0
    res = 0
    while i < a:
        res+=b
        i+=1
    return res

# print(mult(4, 10))


#? Ingresar nombre y apellido e imprimirlo al revés

def rev():
    name = input('Nombre: ')
    lastName = input('Apellido: ')
    reverser =(name + ' ' +lastName) [::-1]
    return reverser

# print(rev())

def revSteatment():
    full = []
    name = input('Nombre: ')
    lastName = input('Apellido: ')
    full.append(name)
    full.append(lastName)
    full.reverse()
    final = ' '.join(full)
    return final
# print(revSteatment())

#? Escribir una funcion que encuentre el elmento menor de una lista

def minus(arr):
    minus = arr[0]
    for i in arr:
        if i < minus:
            minus = i
    return minus

lista = [3,8,22,99,103,4,5]

# print(minus(lista))

#? Escribir una funcion que devuelva el volumen de una espera por su radio: 4/3 * pi * r **3
import math
def vol(radio):
    volume = (4/3)*(math.pi)*(pow(radio, 3))
    return volume

# print(vol(2))

#? Escribir una función que indique si el usuario es mayor de edad

def mayor():
    age = int(input('Introduce tu edad: '))
    if age >= 18:
        print('Es mayor de edad')
        return True
    else:
        print('Es menor de edad')
        return False

# mayor()

#?Escribir una funcion que indique si un número es par o impar

def typeNum():
    num = int(input('Introduce un número: '))
    if num % 2 == 0:
        print(num, 'Es número par')
    else:
        print(num, 'Es número impar')
# typeNum()

#? Escribir una función que indique cuantas vocales tiene una palabra

def countVocal():
    vocal = ['a', 'e', 'i', 'o', 'u']
    word = input('Introduce una palabra: ')
    count = 0
    for i in word:
        if i.lower() in vocal:
            count +=1
    print(count)

# countVocal()

#? Escribir una función que reciba una cantidad infinita de datos hasta decir basta, luego que devuelva la suma de los numeros ingresados


def sumInf():
    num = int(input('Ingrese un número: '))
    tot = num;
    status = input('Desea ingresar otro número? (s/n): ')
    if status == 's':
        tot += sumInf()
    return tot


# print(sumInf())


#? Escribir una función que reciba nombre y apellido y los vaya agreando a un archivo
import os
def suscribe():
    name = input('Nombre: ')
    name_i = '\n'+name
    lastName = input('Apellido: ')
    if not os.path.exists('_9_basics_ex.txt'):
        c = open('_9_basics_ex.txt', 'x')
        c.close()
    x = open('_9_basics_ex.txt', 'a')
    x.write(name_i + ' '+ lastName)
    x.close()
    z = open('_9_basics_ex.txt')
    val = input('Desea agregar mas nombres? (s/n): ')
    if val == 's':
        suscribe()
    else:
        print(z.read())
# suscribe()