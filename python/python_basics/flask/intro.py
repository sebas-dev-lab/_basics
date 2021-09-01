from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    return 'hola mundo'


#* GET, POST, PUT, DELETE, PATCH
@app.route('/post/<post_id>', methods=['GET', 'POST'])
def ruta(post_id):
        if request.methods == 'GET':
            return 'El id del post es: '+post_id
        else:
            return 'El metodo es otro y no GET'
@app.route('/prueba/<id>', methods=['GET'])
def ruta_1(_id):
    return 'Este medotodo es un post: '+_id

@app.route('/ruta_2')
def ruta_2():
    return 'ruta_2'