#
#!=========== Python Basics: Variables & data types ==========#

var_integer=7
var_float=4.9
var_string='hola'

boolean_true=True,
boolean_false=False,

lista=[1,2,3,4]
lista_2=['hola', 'mundo','chau']
lista_3=['hola', 1,3,8, 'chau',3,3,3]

tupla=('hola', 'chau', 1, 4, 5)

rango= range(6)

diccionary={
    "clave_1":"value_1",
    "calve_2":"value_2",
    "clave_3":{
        "clave_3_1":"value_3_1",
        "clave_3_2":"value_3_1",
        "clave_3_3":{
            "clave_3_3_1":"value_3_3_1"
        }
    },

}

#!=========== Python Basics: List & tupla methods ==========#

#?List methods


length=len(lista)
idx_2=lista_2[2]
append_list=lista_2.append('append methods')
copy_list=lista.copy()
delete_pop_lista3=lista_3.pop()
delete_element_lista2=lista_2.remove('mundo')
delete_eli_lista2=lista_2
repeat_value_lista=lista_3.count(3)
reverse_lista3=lista_3.reverse()
sort_lista2=lista_2.sort()

#?Tupla methods
index_tupla=tupla.index(4)
element_1_tupla=tupla[1]
tupla_elements=tupla[:3] 
transform_tupla_to_list=list(tupla)

# Zip
lista=[1,2,3,4,5]
tupla=[10,20,30,40,50]
res=zip(tupla,lista)
res=list(res)
# print(res)

# Strings
leng="123 123 1"
list=leng.split()# [1,2,3...]
#!=========== Python Basics: Diccionary ==========#

copy_dic=diccionary.copy()
copy_2_dic=dict(diccionary)
value_1_dic=diccionary[0]
value_1_dic=diccionary.get('clave_1')
add_new_clave=diccionary['clave_4']='value_4'
del_clave=diccionary.pop('clave_2')
del_last_element_added=diccionary.popitem()
del_one_element_dic=del diccionary['clave_1']
clear_all_elements=copy_dic.clear()

