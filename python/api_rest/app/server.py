from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from utils.environ import getEnviron


class Server:
    def __init__(self):
        self.step = getEnviron("STEP")
        self.port = getEnviron("PORT")
        self.ip = getEnviron("IP")
        self.debug = True
        self.track_modifications = False
        self.sk = getEnviron("SK")

    def onServer(self):
        app = Flask(__name__)
        app.config["SECRET_KEY"] = self.sk
        app.config["SQLALCHEMY_DATABASE_URI"] = getEnviron("DB")
        app.debug = self.debug
        app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = self.track_modifications
        return app

    def onDb(self):
        app = self.onServer()
        db = SQLAlchemy(app)
        return db
