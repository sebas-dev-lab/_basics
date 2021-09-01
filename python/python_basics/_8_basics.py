#
#!====== Manipulando archivo ==========#

# c = open('archivo.txt', 'r') #* abrimos archivo
# print(c.read()) #*metodo que nos permite leer la totalidad del archivo

#? Permisos 
# segundo argumento de open 'read''r'-> permiso de leer que viene por defecto, se lo puede borrar para no ser explisitos
# segundo argumento de open 'append' 'a'-> permiso de modificar el archivo, sin modificar completamente, sino agregar al final más texto. agregamos en el segundo argumento una 'a'
#segundo argumento de opern 'write''w'-> permiso de ecribir. Si el archivo no esta creado.. lo crea.
#segundo argumento de open 'x'-> crea archivos. Si el archivo no se encuentra creado, lo crea de lo contrario devuelve un error porque ya existe dicho archivo.
#?Leer linea de uno en uno
# print(c.readline())
# print(c.readline())
# print(c.readline())
# print(c.readline())

# for x in c:
    # print(x)

# c.close()#*cierra el archivo


# c = open('archivo.txt', 'w')

# c.write('\nagregaremos una nueva linea a nuestro archivo')

# c.close()

# x = open('archivo.txt', 'r')
# print(x.read())

#? Eliminar archivos y carpetas
# import os

# if os.path.exists('archivo.txt'):
#     os.remove('archivo.txt')
# else:
#     print('Archivo inexistente')

# os.rmdir('archivo')
