# Imports
from config.security import SecurityEnvs
from config.routes import Routes
# Instances
secEnvs = SecurityEnvs()
routesEnvs = Routes()


class ServerMonitor:
    def __init__(self):
        self.headerAuth = secEnvs.getBauth()
        self.routes = routesEnvs.getServerMonitor()
        self.basicPath = 'api'

    def getHeaderAuth(self):
        return self.headerAuth

    def getPathRoute(self, route):
        return self.routes[route]

    def getMonitorRoutes(self, route):
        return f"/{self.basicPath}/{self.routes[route]}"
