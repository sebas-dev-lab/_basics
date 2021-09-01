#
#!=========== Python Basics: control flow, loops, functions, recursion ==========#
#?while loop
i=0
while i < 5:
    # print(i) #*imprime valores 0-4 
    i+=1

#?while- brake-continue
while i<5:
    # print(i)
    if i==3:
        break #*detiene el loop al cumplir la condición
    i+=1
while i<5:
    # print(i)
    if i==3:
        continue #* pasa de largo y genera un loop inf. 
    i+=1
while i<5:
    i+=1 #* Solución al loop inf anterior
    if i==3:
        continue
    # print(i)

#?For loop
user=['seba', 'andrea', 'nicolas']
# for name in user:
    # print(name)

#?Functions

def myFunction():
   pass

def function_2(par1, par2):
    print(par1, par2)

#*Parámetros variables
def function_3(*parametro):
    print(parametro)

#*Elementos similar a diccionarios
def funtion_4(**kwargs):
    print(kwargs['name'], kwargs['lastName'])

function_4(name='sbea', lastName='lescano')

#* Parametro por defecto
def function_5(argumento='seba'):
    print('argumento')
funtion_5('batman')
function_5()

#*Pasando una lista como argumento
def function_6(lista):
    i=''
    for el in lista:
        i=i+el+' '
        # print(el)
    return i
        


nambe= function_6(['seba', 'lescano'])
print(nambe)
#? Recursividad

def recursion(i):
    if(i<1):
        return i
    print(i)
    recursion(i-1)

recursion(6);
