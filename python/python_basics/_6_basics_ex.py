#
#!=========== Python Basics: Objetos, clases y herencia ==========#

class User:
    def __init__(self, name, lastName, password,email, role):
        self.name = name
        self.lastName = lastName
        self.password = password
        self.email = email
        self.role = role

class Student(User):
    def __init__(self, name, lastName, password,email, role, module, cohort, instructor):
        User.__init__(self, name, lastName, password,email, role)
        self.module = module
        self.cohort = cohort
        self.instructor = instructor

class Instructor(User):
    def __init__(self, name, lastName, password,email, role, cohort, className):
        super().__init__(name, lastName, password,email, role)
        self.cohort = cohort
        self.className = className




students = []
instructors = []
def createUser(create = True):
    def data():
        name = input('Enter your name: ')
        lastName = input('Enter your lastName: ')
        email = input('Enter your email: ')
        password = input('Enter your password: ')
        cohort = input('Enter your cohort: ')
        return {
            "name": name,
            "lastName": lastName,
            "email": email,
            "password": password,
            "cohort": cohort,
        }

    if create:
        type_ = input('Instructor (i) or Student(s): ')
        if type_ == 's':
            data = data()
            name, lastName, email, password, cohort = data.values()
            module = input('Enter your module')
            instructor = input('Enter your instructor')
            role = 'student'
            user = Student(name, lastName, email, password, role, cohort, module, instructor)
            students.append(user)
        elif type_ == 'i':
            data = data()
            name, lastName, email, password, cohort = data.values()
            role = 'instructor'
            className = input('Enter your class name: ')
            user = Instructor(name, lastName, email, password, role, cohort, className)
            instructors.append(user)
        else:
                print('Debes introducir un valor valido')
                createUser()
    cont=input('Do you need create more users? (s/n): ')
    if cont == "s":
        createUser()
    else:
        for st in students:
            print(st.name, st.email)
        for it in instructors:
            print(it.name, it.email)
        return            
  
createUser()

