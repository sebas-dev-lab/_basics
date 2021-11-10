from server import Server

server = Server()
app = server.onServer()
db = server.onDb()


from routes.serverMonitor.serverMonitorRoutes import *
