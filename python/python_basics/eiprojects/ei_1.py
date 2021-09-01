'''
    **create
    nombre de alumno
    cantidad de cursos

    -> se almacenan en lista de dos elementos

    **get
    ver lista de alumnos y cursos

    **input
    Preguntar al inicio que funcion realizar create or get

'''

students = []


def testInt(n):
    try:
        int(n)
        return True
    except ValueError:
        return False


def create():
    ''' Add student and course to list '''
    _name = input('Ingrese nombre del alumno: ')
    _dni = input('Ingrese el DNI del alumno: ')
    _num = input('Ingrese la cantidad de cursos que realiza el alumno: ')
    if(testInt(_num)):
        students.append({
            "name": _name,
            "dni": _dni,
            "n_course": _num,
        })
        print("Alumno agregado correctamente")
    else:
        print("Error al introducir el numero de cursos - debe ser entero")
        create()


def get():
    ''' Get student data by dni (unique) '''
    if(len(students) != 0):
        _dni = input('Ingrese el DNI del alumno: ')
        exist = False
        data = ''
        for s in students:
            if(s['dni'] == _dni):
                exist = True
                data = '------------------'+'\n'+'Nombre: '+s['name']+'\n'+'DNI: '+s['dni'] + \
                    '\n'+"Numero de cursos: " + \
                    s['n_course']+'\n'+'------------------'
                break
        if(exist):
            print(data)
        else:
            print('No se encontro informacion')
    else:
        print('No existen registros')


def getAll():
    ''' Get students list '''
    if(len(students) != 0):
        for s in students:
            data = '------------------'+'\n'+'Nombre: '+s['name']+'\n'+'DNI: '+s['dni'] + \
                '\n'+"Numero de cursos: " + \
                s['n_course']+'\n'+'------------------'
            print(data)
    else:
        print('No existen registros')


def startProgram():
    op = input('\n'+'Ingrese el numero de la operacion que desea ejecutar:'+'\n' + '\n' +
               '1 - Ver lista de alumnos.'+'\n'+'2 - Buscar un alumno por dni.'+'\n'+'3 - Registrar nuevo alumno.'+'\n'+'4 - Salir.'+'\n'+'\n'+'>>>')
    if(op == '1'):
        getAll()
        startProgram()
    elif(op == '2'):
        get()
        startProgram()
    elif(op == '3'):
        create()
        startProgram()
    else:
        return


startProgram()
